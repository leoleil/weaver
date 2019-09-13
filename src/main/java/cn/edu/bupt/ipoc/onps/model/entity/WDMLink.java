package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.base.exception.LayerOccupyException;
import cn.edu.bupt.ipoc.onps.utils.LayerString;
import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;

import java.util.ArrayList;
import java.util.List;

public class WDMLink extends BasicLink{
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
    private List<BasicLink>	 fiberLinkList;       //用来承载该WDM段落的具体的光纤链表:层间路由


    public static class Builder extends BasicLink.Builder<Builder>{
        protected Port formPort;//链路首节点端口
        protected Port toPort;//链路尾节点端口
        private List<Wavelength> wavelengthList;	  //该段落所对应的详细波道使用状态
        private List<BasicLink>	 fiberLinkList;       //用来承载该WDM段落的具体的光纤链路链表:层间路由
        private List<String> fiberIdList;             //用来承载该WDM段落的具体光纤链表
        /**
         * 节点间创建wdm链路
         * 端口自动生成
         *
         * @param id
         * @param name
         * @param fromNode
         * @param toNode
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
         *
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
         * 节点间创建wdm链路
         * 端口已经建立
         * @param id
         * @param name
         * @param fromPort
         * @param toPort
         */
        public Builder(String id, String name, Port fromPort, Port toPort){
            super(id,name, LayerString.WDM, fromPort.getBelongsNode(), toPort.getBelongsNode());
            this.formPort = fromPort;
            this.toPort = toPort;
            this.fromNode = fromPort.getBelongsNode();
            this.toNode = toPort.getBelongsNode();
        }

        /**
         * 设置层间路由，占据层间资源
         * @param links
         * @return
         */
        public Builder layerRoute(List<BasicLink> links) {
            fiberLinkList = links;
            return self();
        }

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
            else wavelengthList = new ArrayList<>();
            return self();
        }

        /**
         * 自动置入波道
         * @param size
         * @return
         */
        @Override
        public Builder size(int size){
            if (wavelengthList == null)
                wavelengthList = new ArrayList<>();
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
        toPort.setBelongsLink(this);
        this.wavelengthList = builder.wavelengthList;
        //占据层间路由资源
        //没有指定层间路由由哪一个fiber承载的情况
        if(builder.fiberLinkList != null && builder.fiberIdList == null) {
            for(BasicLink link : builder.fiberLinkList){
                if(link instanceof FiberLink){
                    ((FiberLink) link).occupyFiber(this);
                }
            }
            this.fiberLinkList = builder.fiberLinkList;
        }//指定层间路由的fiber承载情况
        else if(builder.fiberLinkList != null && builder.fiberIdList != null){
            for(int i=0; i< builder.fiberLinkList.size();i++){
                if(builder.fiberLinkList.get(i) instanceof FiberLink){
                    FiberLink link = (FiberLink)builder.fiberLinkList.get(i);
                    link.occupyFiber(this,builder.fiberIdList.get(i));
                }
            }
        }
        else fiberLinkList = new ArrayList<>();

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

    public boolean addTrafficeWork(Traffic traffic){
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

}
