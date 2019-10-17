package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.base.exception.LayerOccupyException;
import cn.edu.bupt.ipoc.onps.utils.LayerString;
import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;
import cn.edu.bupt.ipoc.onps.utils.TypeString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WDMLink extends BasicLink implements HaveTraffic{
    private String		facilityType;        //设备类型 1--2.5G  2--10G
    private int			newNum;				 //扩波数量
    /*波道信息*/
    private int			sum;				 //满配波道数量		(***)
    private int			Configure;			 //已配波道数量		(***)
    private int			Unconfigure;	     //未配波道数量		(***)
    private int			used;				 //业务占用波道数量	(***)
    private int			work;				 //工作波道数量 	(***)
    private int			protect;		     //保护波道数量 	(***)
    private int			restore;			 //恢复波道数量		(***)
    private int			maintenance;		 //承载波道数量		(***)
    private int			fault;				 //故障波道数量		(***)
    private int			isolation;			 //隔离波道数量		(***)
    /*algorithm*/
    private int			advice;				 //建议波道数量
    private int			addAdvice;			 //建议扩容波道数量
    private int			reconfigure;		 //上年度规划已安排但本次规划中应重新安排的波道数量
    private int			futureUse;			 //统计本次规划将要用到的波长数（用于扩容，新建波道）
    private int			newAdvice;			 //建议新建波道数量

    private List<Wavelength> wavelengthList;	  //该段落所对应的详细波道使用状态
    private List<Wavelength> exWavelengthList;    //扩容波道,扩容时使用
    private List<BasicLink>	 layerRouteLinkList;       //用来承载该WDM段落的具体的光纤链表:层间路由


    public static class Builder extends BasicLink.Builder<Builder>{
        protected Port formPort;//链路首节点端口
        protected Port toPort;//链路尾节点端口
        private List<Wavelength> wavelengthList = new ArrayList<>();	  //该段落所对应的详细波道使用状态
        private List<BasicLink>	 layerRouteLinkList = new ArrayList<>();  //用来承载该WDM段落的具体的光纤链路链表:层间路由
        private List<String> fiberIdList = new ArrayList<>();             //用来承载该WDM段落的具体光纤链表
        /**
         * 节点间创建wdm链路
         * 端口自动生成
         * @param id wdn的id
         * @param name 链路名称
         * @param fromNode 起点
         * @param toNode 终点
         */
        public Builder(String id, String name, CommonNode fromNode, CommonNode toNode) {
            super(id, name, LayerString.WDM, fromNode, toNode);
            //设置节点和端口
            this.formPort = new Port(LayerString.WDM);
            this.toPort = new Port(LayerString.WDM);
            this.formPort.setBelongsNode(fromNode);
            this.toPort.setBelongsNode(toNode);
            fromNode.addPort(this.formPort);
            toNode.addPort(toPort);
        }

        /**
         * 节点间创建wdm链路
         * 端口自动生成
         * id自动生成
         * @param name
         * @param fromNode
         * @param toNode
         */
        public Builder(String name, CommonNode fromNode, CommonNode toNode) {
            super(name, LayerString.WDM, fromNode, toNode);
            //设置节点和端口
            this.formPort = new Port(LayerString.WDM);
            this.toPort = new Port(LayerString.WDM);
            this.formPort.setBelongsNode(fromNode);
            this.toPort.setBelongsNode(toNode);
            fromNode.addPort(this.formPort);
            toNode.addPort(toPort);
        }

        /**
         * 节点间创建wdm链路 推荐再从DAO载入时使用
         *  端口已经建立，其中端口的节点已经确定
         * @param id  节点ID
         * @param name 节点名
         * @param fromPort 起点端口
         * @param toPort 终点端口
         * @param fromNode 起点节点
         * @param toNode 终点节点
         */
        public Builder(String id, String name, Port fromPort, Port toPort , CommonNode fromNode, CommonNode toNode){
            super(id,name, LayerString.WDM, fromPort.getBelongsNode(), toPort.getBelongsNode());
            this.formPort = fromPort;
            this.toPort = toPort;
            this.fromNode = fromNode;
            this.toNode = toNode;
        }

        /**
         * 设置层间路由，占据层间资源
         * 如果与fiberIdList对应使用需要注意与fiber的ID对应
         * @param links
         * @return
         */
        public Builder layerRoute(List<BasicLink> links) {
            layerRouteLinkList = links;
            return self();
        }

        /**
         * 设置层间路由占据的光纤的id，与层间路由对应使用
         * @param fiberIdList
         * @return
         */
        public Builder fiberIdList(List<String> fiberIdList){
            this.fiberIdList = fiberIdList;
            return self();
        }

        /**
         * 手动置入波道
         * @param wavelengths
         * @return
         */
        public Builder wavelengthList(List<Wavelength> wavelengths){
            if(wavelengths != null){
                wavelengthList = wavelengths;
                size = wavelengths.size();
                this.free = size;
            }
            return self();
        }

        /**
         * 自动置入波道
         * @param size
         * @return
         */
        @Override
        public Builder size(int size){
            for(int i=0 ; i < size ; i++){
                Wavelength wavelength = new Wavelength();
                wavelengthList.add(wavelength);
            }
            this.free = size;
            this.size = size;
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public BasicLink build() {
            return new WDMLink(this);

        }
    }

    /**
     * 构造函数
     * @param builder
     */
    private WDMLink(Builder builder) {
        super(builder);
        this.formPort = builder.formPort;//设置端口
        this.toPort = builder.toPort;
        formPort.setBelongsLink(this);
        formPort.setBelongsNode(builder.fromNode);
        toPort.setBelongsLink(this);
        toPort.setBelongsNode(builder.toNode);
        this.wavelengthList = builder.wavelengthList;
        //占据层间路由资源
        //没有指定层间路由由哪一个fiber承载的情况
        if(!builder.layerRouteLinkList.isEmpty() && builder.fiberIdList == null) {
            for(BasicLink link : builder.layerRouteLinkList){
                if(link instanceof FiberLink){
                    ((FiberLink) link).occupyFiber(this);
                }
            }
            this.layerRouteLinkList = builder.layerRouteLinkList;
        }//指定层间路由的fiber承载情况
        else if(!builder.layerRouteLinkList.isEmpty() && builder.fiberIdList != null){
            for(int i=0; i< builder.layerRouteLinkList.size();i++){
                if(builder.layerRouteLinkList.get(i) instanceof FiberLink){
                    FiberLink link = (FiberLink)builder.layerRouteLinkList.get(i);
                    link.occupyFiber(this,builder.fiberIdList.get(i));
                }
            }
        }

    }

    public List<Wavelength> getWavelengthList() {
        return wavelengthList;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public boolean occupyWavelength(BasicLink link){
        if(free > 0){
            for(Wavelength wavelength:wavelengthList){
                if(wavelength.getStatus().equals(LinkStatusString.FREE)){
                    wavelength.addCarryLink(link);
                    this.free --;
                    return true;
                }
            }
        }
        return false;
    }
    public boolean occupyWavelength(BasicLink link, String wavelengthID){
        if(free > 0){
            for(Wavelength wavelength:wavelengthList){
                if(wavelength.getStatus().equals(LinkStatusString.FREE) && wavelength.getId().equals(wavelengthID)){
                    wavelength.addCarryLink(link);
                    this.free --;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addTrafficWork(Traffic traffic){
        if(free > 0){
            for(Wavelength wavelength:wavelengthList){
                if(wavelength.getStatus().equals(LinkStatusString.FREE)){
                    wavelength.addTrafficeWork(traffic);
                    this.free --;
                    return true;
                }
            }

        }
        return false;
    }

    /**
     * 在wdm链路上添加业务,无论波道状态强行占用，适用于从数据库恢复数据
     * @param traffic 业务对象
     * @param wavelengthId 指定业务要占据的波道
     * @return 有资源并占据成功返回true 资源不足或者没有匹配id的波道返回false
     */
    public boolean addTrafficWork(Traffic traffic, String wavelengthId){
        if(free > 0){
            for(Wavelength wavelength:wavelengthList){
                if(wavelength.getId().equals(wavelengthId)){
                    wavelength.addTrafficeWork(traffic);
                    this.free --;
                    return true;
                }
            }

        }
        return false;
    }

    /**
     * 在wdm链路上占据
     * @param traffic 业务对象 波道自动占据
     * @return 有资源并占据成功返回true 资源不足返回false
     */
    public boolean addTrafficWorkProtect(Traffic traffic){
        if(free > 0){
            for(Wavelength wavelength:wavelengthList){
                if(wavelength.getStatus().equals(LinkStatusString.FREE)){
                    wavelength.addTrafficWorkProtect(traffic);
                    this.free --;
                    return true;
                }
            }

        }
        return false;
    }

    @Override
    public boolean addTrafficWorkProtect(Traffic traffic, String wavelengthId) {
        if(free > 0){
            for(Wavelength wavelength:wavelengthList){
                if(wavelength.getId().equals(wavelengthId)){
                    wavelength.addTrafficWorkProtect(traffic);
                    this.free --;
                    return true;
                }
            }

        }
        return false;
    }

    //新建波道
    public boolean addSize(int addSize){
        if(addSize < 0){
            Iterator<Wavelength>wavelengthIterator = wavelengthList.iterator();
            while (wavelengthIterator.hasNext() && addSize<0){
                Wavelength wavelength = wavelengthIterator.next();
                if(wavelength.getStatus().equals(LinkStatusString.FREE) && wavelength.getType().equals(TypeString.NEW)){
                    wavelengthIterator.remove();
                    addSize++;
                    size --;
                    free --;
                }
            }
            return true;
        }else if (addSize > 0){
            while (addSize>0){
                Wavelength wavelength = new Wavelength();
                wavelength.andStatus(TypeString.NEW).andYear(this.year);
                wavelengthList.add(wavelength);
                addSize--;
                size ++;
                free ++;
            }
            return true;
        }else{
            return true;
        }
    }

    public String takeFromPortId(){
        return this.formPort.getId();
    }
    public String takeToPortId(){
        return this.toPort.getId();
    }

    public List<BasicLink> takeLayerRouteLinkList(){
        return this.layerRouteLinkList;
    }


}
