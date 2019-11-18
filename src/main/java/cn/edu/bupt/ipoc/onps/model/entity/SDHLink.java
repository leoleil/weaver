package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.model.HaveTraffic;
import cn.edu.bupt.ipoc.onps.utils.LayerString;
import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SDHLink extends BasicLink implements HaveTraffic {
    private boolean 		 	        inRing=false;       //链路是否是构成环
    private	String					    carriedType;	    //承载媒介，光缆还是WDM
    private	boolean			            gran=false;         //标示是否复用,false为没有小粒度业务，true为有小粒度业务
    private List<SDHRing>               SDHRing = new ArrayList<>();            //该SDH链所属环
    private	List<BasicLink>	 	        layerRouteLinkList = new ArrayList<>(); //如果承载在光缆上的对应的Fiber层链路链表
    private	List<Timeslot>	 	        timeslotList = new ArrayList<>();       //包含的时隙链
    private	List<Timeslot>	 	        exTimeslotList = new ArrayList<>();     //扩容时隙

    @Override
    public boolean addTrafficWork(Traffic traffic) {
        if(free > 0){
            for(Timeslot timeslot: timeslotList){
                if(timeslot.getStatus().equals(LinkStatusString.FREE)){
                    timeslot.addTrafficeWork(traffic);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean addTrafficWork(Traffic traffic, String chooseResId) {
        if(free > 0){
            for(Timeslot timeslot: timeslotList){
                if(timeslot.getId().equals(chooseResId) && timeslot.getStatus().equals(LinkStatusString.FREE)){
                    timeslot.addTrafficeWork(traffic);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean addTrafficWorkProtect(Traffic traffic) {
        if(free > 0){
            for(Timeslot timeslot: timeslotList){
                if(timeslot.getStatus().equals(LinkStatusString.FREE)){
                    timeslot.addTrafficWorkProtect(traffic);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean addTrafficWorkProtect(Traffic traffic, String chooseResId) {
        if(free > 0){
            for(Timeslot timeslot: timeslotList){
                if(timeslot.getId().equals(chooseResId) && timeslot.getStatus().equals(LinkStatusString.FREE)){
                    timeslot.addTrafficWorkProtect(traffic);
                    return true;
                }
            }
        }
        return false;
    }

    public static class Builder extends BasicLink.Builder<Builder>{
        private Port formPort;//链路首节点端口
        private Port toPort;//链路尾节点端口
        private boolean 		 	        inRing=false;       //链路是否是构成环
        private	String					    carriedType;	    //承载媒介，光缆还是WDM
        private	boolean			            gran=false;         //标示是否复用,false为没有小粒度业务，true为有小粒度业务
        private List<SDHRing>               SDHRing;            //该SDH链所属环
        private	List<BasicLink>	 	        layerRouteLinkList;      //如果承载在光缆上的对应的Fiber层链路链表
        private	List<Timeslot>	 	        timeslotList;       //包含的时隙链
        private	List<Timeslot>	 	        exTimeslotList;     //扩容时隙
        private List<String> linkResIdList;
        /**
         * 节点间创建链路
         * 端口自动生成
         * @param id
         * @param name
         * @param fromNode
         * @param toNode
         */
        public Builder(String id, String name, CommonNode fromNode, CommonNode toNode) {
            super(id, name, LayerString.SDH, fromNode, toNode);
            this.formPort = new Port(LayerString.SDH);
            this.toPort = new Port(LayerString.SDH);
            formPort.setBelongsNode(fromNode);
            toPort.setBelongsNode(toNode);
            fromNode.addPort(formPort);
            toNode.addPort(toPort);
        }
        /**
         * 节点间创建链路
         * 端口自动生成
         * id自动生成
         * @param name
         * @param fromNode
         * @param toNode
         */
        public Builder(String name, CommonNode fromNode, CommonNode toNode) {
            super(name, LayerString.OTN, fromNode, toNode);
            this.formPort = new Port(LayerString.SDH);
            this.toPort = new Port(LayerString.SDH);
            formPort.setBelongsNode(fromNode);
            toPort.setBelongsNode(toNode);
            fromNode.addPort(formPort);
            toNode.addPort(toPort);
        }
        /**
         * 节点间创建sdh链路
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

        public Builder carriedType(String carriedType){
            this.carriedType = carriedType;
            return self();
        }

        public Builder layerRoute(List<BasicLink> layerRouteLinkList){
            this.layerRouteLinkList = layerRouteLinkList;
            return self();
        }

        public Builder linkResIdList(List<String> linkResIdList){
            this.linkResIdList = linkResIdList;
            return self();
        }

        /**
         * 自动置入时隙
         * @param size
         * @return
         */
        @Override
        public Builder size(int size){
            if(timeslotList == null)
                timeslotList = new ArrayList<>();
            for(int i=0; i < size ; i++){
                Timeslot timeslot = new Timeslot();
                timeslotList.add(timeslot);
            }
            this.size = size;
            this.free = size;
            return self();
        }

        public Builder timeslot(List<Timeslot> timeslots){
            if(timeslots != null){
                this.timeslotList = timeslots;
                this.size = timeslots.size();
                this.free = timeslots.size();
            }else{
                this.timeslotList = new ArrayList<>();
            }
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public BasicLink build() {
            return new SDHLink(this);
        }
    }
    private SDHLink(Builder builder) {
        super(builder);
        this.formPort = builder.formPort;//设置端口
        this.toPort = builder.toPort;
        formPort.setBelongsLink(this);
        toPort.setBelongsLink(this);
        this.carriedType = builder.carriedType;
        this.timeslotList = builder.timeslotList;
        this.layerRouteLinkList = builder.layerRouteLinkList;
        //占据层间路由
        if(carriedType.equals(LayerString.FIBER) && layerRouteLinkList != null){
            for(BasicLink link:layerRouteLinkList){
                if(link instanceof FiberLink){
                    ((FiberLink) link).occupyFiber(this);
                }
            }
        }else if(carriedType.equals(LayerString.WDM) && layerRouteLinkList != null){
            for(BasicLink link:layerRouteLinkList){
                if(link instanceof WDMLink){
                    ((WDMLink) link).occupyWavelength(this);
                }
            }
        }else if(carriedType.equals(LayerString.OTN) && layerRouteLinkList != null){
            for(BasicLink link:layerRouteLinkList){
                if(link instanceof OTNLink){
                    ((OTNLink) link).occupyOTU(this);
                }
            }
        }
        else if(carriedType.equals(LayerString.FIBER) && layerRouteLinkList != null && builder.linkResIdList != null){
            for(int i=0;i<layerRouteLinkList.size();i++){
                BasicLink link = layerRouteLinkList.get(i);
                if(link instanceof FiberLink){
                    ((FiberLink) link).occupyFiber(this,builder.linkResIdList.get(i));
                }
            }
        }else if(carriedType.equals(LayerString.WDM) && layerRouteLinkList != null && builder.linkResIdList != null){
            for(int i=0;i<layerRouteLinkList.size();i++){
                BasicLink link = layerRouteLinkList.get(i);
                if(link instanceof WDMLink){
                    ((WDMLink) link).occupyWavelength(this,builder.linkResIdList.get(i));
                }
            }
        } else if(carriedType.equals(LayerString.OTN) && layerRouteLinkList != null && builder.linkResIdList != null){
            for(int i=0;i<layerRouteLinkList.size();i++){
                BasicLink link = layerRouteLinkList.get(i);
                if(link instanceof OTNLink){
                    ((OTNLink) link).occupyOTU(this,builder.linkResIdList.get(i));
                }
            }
        }
        else {
            layerRouteLinkList = new ArrayList<>();
        }

    }

    public boolean addSize(int addSize){
        if(addSize < 0){
            Iterator<Timeslot> timeslotIterator= timeslotList.iterator();
            while (timeslotIterator.hasNext() && addSize<0){
                Timeslot timeslot = timeslotIterator.next();
                if(timeslot.getStatus().equals(LinkStatusString.FREE)){
                    timeslotIterator.remove();
                    addSize++;
                }
            }
            return true;
        }else if (addSize > 0){
            while (addSize>0){
                Timeslot timeslot = new Timeslot();
                timeslotList.add(timeslot);
                addSize--;
            }
            return true;
        }else{
            return true;
        }
    }
    

    public List<Timeslot> getTimeslotList() {
        return timeslotList;
    }

    public String takeFromPortId(){
        return this.formPort.getId();
    }
    public String takeToPortId(){
        return this.toPort.getId();
    }
    //在删除链路时使用 解绑端口
    public void release(){
        setStatus(LinkStatusString.USELESS);
        formPort.getBelongsNode().removePort(formPort.getId());
        toPort.getBelongsNode().removePort(toPort.getId());
    }
    public List<BasicLink> takeLayerRouteLinkList(){
            return this.layerRouteLinkList;
    }

    public String getCarriedType() {
        return carriedType;
    }
}
