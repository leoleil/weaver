package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.utils.LayerString;
import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;
import cn.edu.bupt.ipoc.onps.utils.TypeString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * fiber链路
 */
public class FiberLink extends BasicLink {
    private int fualtTime=0;//平均每年故障时间  ？天
    private int completedYear=0;//竣工年份
    private double aveAttenua=0;//平均衰耗
    private List<Fiber> fibers = new ArrayList<>();//光纤
    private String perfunctoryWay;//敷设方式
    private String maintianDepartment;//维护单位
    //builder对象
    public static class Builder extends BasicLink.Builder<Builder>{
        private int fualtTime=0;//平均每年故障时间  ？天
        private int completedYear=0;//竣工年份
        private double aveAttenua=0;//平均衰耗
        private List<Fiber> fibers;//光纤
        private String perfunctoryWay;//敷设方式
        private String maintianDepartment;//维护单位

        /**
         * 节点间创建fiber链路
         * 端口自动生成
         *  fiber链路构建需要设置光纤数量 光纤对象自动生成
         * @param id 设置id
         * @param name fiber名称
         * @param fromNode 起点
         * @param toNode 终点
         * @param size 光纤数量
         */
        public Builder(String id, String name, CommonNode fromNode, CommonNode toNode, int size) {
            super(id, name, LayerString.FIBER, fromNode, toNode);
            this.size = size;
            this.free = size;
            if(fibers == null)fibers = new ArrayList<>();
            for(int i = 0; i < size ; i++){
                Fiber fiber = new Fiber();
                fibers.add(fiber);
            }
        }

        /**
         * 节点间创建链路
         * 端口自动生成
         * id自动生成
         * fiber链路构建需要设置光纤数量 光纤对象自动生成
         * @param name fiber名称
         * @param fromNode 起点
         * @param toNode 终点
         * @param size 光纤数量
         */
        public Builder(String name, CommonNode fromNode, CommonNode toNode, int size) {
            super(name, LayerString.FIBER, fromNode, toNode);
            this.size = size;
            this.free = size;
            for(int i = 0; i < size ; i++){
                Fiber fiber = new Fiber();
                fibers.add(fiber);
            }
        }

        /**
         * 设置fiber链路，光纤置入
         * 此方法推荐使用于从DAO层恢复链路时使用
         * @param id 链路的id
         * @param name 名
         * @param fromNode 起点
         * @param toNode 终点
         * @param fibers 光纤对象数组
         */
        public Builder(String id, String name, CommonNode fromNode, CommonNode toNode, ArrayList<Fiber> fibers){
            super(id, name, LayerString.FIBER, fromNode, toNode);
            this.fibers = fibers;
            this.size = fibers.size();
            this.free = size;
        }
        //设置错误次数
        public Builder fualtTime(int fualtTime){
            this.fualtTime = fualtTime;
            return self();
        }
        //设置竣工年份
        public Builder completedYear(int completedYear){
            this.completedYear = completedYear;
            return self();
        }
        //设置平均衰耗
        public Builder aveAttenua(double aveAttenua){
            this.aveAttenua = aveAttenua;
            return  self();
        }
        //敷设方式
        public Builder perfunctoryWay(String perfunctoryWay){
            this.perfunctoryWay = perfunctoryWay;
            return self();
        }
        //维护单位
        public Builder maintianDepartment(String maintianDepartment){
            this.maintianDepartment = maintianDepartment;
            return self();
        }

        //使得size构造无效
        @Override
        public Builder size(int size){
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public BasicLink build() {
            return new FiberLink(this);
        }
    }
    //构造方法
    private FiberLink(Builder builder) {
        super(builder);
        this.fualtTime = builder.fualtTime;
        this.completedYear = builder.completedYear;
        this.aveAttenua = builder.aveAttenua;
        this.perfunctoryWay = builder.perfunctoryWay;
        this.maintianDepartment = builder.maintianDepartment;
        this.fibers = builder.fibers;
    }

    public List<Fiber> getFibers() {
        return fibers;
    }

    public int getFualtTime() {
        return fualtTime;
    }

    public int getCompletedYear() {
        return completedYear;
    }

    public double getAveAttenua() {
        return aveAttenua;
    }

    public String getPerfunctoryWay() {
        return perfunctoryWay;
    }


    /**
     * 上层链路占据Fiber资源,有空闲资源就占据
     * @param link 上层的链路
     * @return 资源不足返回false 成功占据返回true
     */
    public boolean occupyFiber(BasicLink link){
        if(this.free > 0){
            for(Fiber fiber:fibers){
                if(fiber.getStatus().equals(LinkStatusString.FREE)){
                    fiber.addCarryLink(link);
                    this.free --;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 上层链路占据Fiber资源,根据Fiber的ID来指定占据
     * 次方法推荐使用于DAO载入时占据Fiber
     * @param link 上层的链路
     * @param fiberID 要占据的fiber的ID
     * @return 如果成功占据返回true ,如果指定的fiber已经被占据返回false ,占据失败返回false
     */
    public boolean occupyFiber(BasicLink link, String fiberID){
        if(this.free > 0){
            for(Fiber fiber:fibers){
                if(fiber.getStatus().equals(LinkStatusString.FREE) && fiber.getId().equals(fiberID)){
                    fiber.addCarryLink(link);
                    this.free --;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 添加光纤，添加正数就是增加，负数就是减少
     * addSize为负数时，会将为空闲的新建光纤去除，如果要减少的大小大于空闲光纤数量则不再减少
     * @param addSize
     * @return
     * @return
     */
    public boolean addSize(int addSize){
        if(addSize < 0){
            Iterator<Fiber> fiberIterator = fibers.iterator();
            while (fiberIterator.hasNext() && addSize<0){
                Fiber fiber = fiberIterator.next();
                if(fiber.getStatus().equals(LinkStatusString.FREE) && fiber.getType().equals(TypeString.NEW)){
                    fiberIterator.remove();
                    addSize++;
                    size --;
                    free --;
                }
            }
            return true;
        }else if (addSize > 0){
            while (addSize>0){
                Fiber fiber = new Fiber();
                fiber.andType(TypeString.NEW).andYear(this.year);
                fibers.add(fiber);
                addSize--;
                size ++;
                free ++;
            }
            return true;
        }else{
            return true;
        }
    }

}
