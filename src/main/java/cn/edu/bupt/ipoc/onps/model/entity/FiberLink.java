package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.utils.LayerString;
import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FiberLink extends BasicLink {
    private int fualtTime=0;//平均每年故障时间  ？天
    private int completedYear=0;//竣工年份
    private double aveAttenua=0;//平均衰耗
    private List<Fiber> fibers = new ArrayList<>();//光纤
    private String perfunctoryWay;//敷设方式

    public static class Builder extends BasicLink.Builder<Builder>{
        private int fualtTime=0;//平均每年故障时间  ？天
        private int completedYear=0;//竣工年份
        private double aveAttenua=0;//平均衰耗
        private List<Fiber> fibers;//光纤
        private String perfunctoryWay;//敷设方式
        private String maintianDepartment;//维护单位

        /**
         * 节点间创建链路
         * 端口自动生成
         *  fiber链路构建需要设置光纤数量 光纤对象自动生成
         * @param id
         * @param name
         * @param fromNode
         * @param toNode
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
         * @param name
         * @param fromNode
         * @param toNode
         * @param size
         */
        public Builder(String name, CommonNode fromNode, CommonNode toNode, int size) {
            super(name, LayerString.FIBER, fromNode, toNode);
            this.size = size;
            this.free = size;
            if(fibers == null)fibers = new ArrayList<>();
            for(int i = 0; i < size ; i++){
                Fiber fiber = new Fiber();
                fibers.add(fiber);
            }
        }

        /**
         * 设置fiber链路，光纤置入
         * @param id
         * @param name
         * @param fromNode
         * @param toNode
         * @param fibers
         */
        public Builder(String id, String name, CommonNode fromNode, CommonNode toNode, ArrayList<Fiber> fibers){
            super(id, name, LayerString.FIBER, fromNode, toNode);
            this.fibers = fibers;
            this.size = fibers.size();
            this.free = size;
        }

        public Builder fualtTime(int fualtTime){
            this.fualtTime = fualtTime;
            return self();
        }

        public Builder completedYear(int completedYear){
            this.completedYear = completedYear;
            return self();
        }

        public Builder aveAttenua(double aveAttenua){
            this.aveAttenua = aveAttenua;
            return  self();
        }

        public Builder perfunctoryWay(String perfunctoryWay){
            this.perfunctoryWay = perfunctoryWay;
            return self();
        }

        public Builder maintianDepartment(String maintianDepartment){
            this.maintianDepartment = maintianDepartment;
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

    private FiberLink(Builder builder) {
        super(builder);
        fualtTime = builder.fualtTime;
        completedYear = builder.completedYear;
        aveAttenua = builder.aveAttenua;
        perfunctoryWay = builder.perfunctoryWay;
        this.fibers = builder.fibers;
    }

    public List<Fiber> getFibers() {
        return fibers;
    }

    /**
     * 上层链路占据Fiber资源,有空闲资源就占据
     * @param link
     * @return
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
     * @param link
     * @param fibeID
     * @return
     */
    public boolean occupyFiber(BasicLink link, String fibeID){
        if(this.free > 0){
            for(Fiber fiber:fibers){
                if(fiber.getStatus().equals(LinkStatusString.FREE) && fiber.getId().equals(fibeID)){
                    fiber.addCarryLink(link);
                    this.free --;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addSize(int addSize){
        if(addSize < 0){
            Iterator<Fiber> fiberIterator = fibers.iterator();
            while (fiberIterator.hasNext() && addSize<0){
                Fiber fiber = fiberIterator.next();
                if(fiber.getStatus().equals(LinkStatusString.FREE)){
                    fiberIterator.remove();
                    addSize++;
                }
            }
            return true;
        }else if (addSize > 0){
            while (addSize>0){
                Fiber fiber = new Fiber();
                fibers.add(fiber);
                addSize--;
            }
            return true;
        }else{
            return true;
        }
    }

}
