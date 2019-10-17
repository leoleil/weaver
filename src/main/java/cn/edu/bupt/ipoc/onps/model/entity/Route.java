package cn.edu.bupt.ipoc.onps.model.entity;

import java.util.List;
import java.util.UUID;

public class Route {
    private CommonNode                     fromNode;                       //路由首节点
    private CommonNode                     toNode;                         //路由末节点
    private String                         rate;                       //路由速率
    private String  				       id;                         //路由ID
    private String                         layer;                      //路由所属层
    private int  				           hop;                        //跳数
    private int  				           length;                     //长度
    private int  			               value;                      //代价
    private boolean                        success = false;            //是否成功，true为成功，否则为false
    private float          	               reliability;                //可靠性
    private List<CommonNode> 		       nodeList = null;          //记录业务路由
    private List<BasicLink> 		       linkList = null;          //记录业务路由
    private List<String>                   sourceID=null;             //用于记录链路中占用的波道 或者 时序号
    private List<String>                   portSourceID=null;         //用于记录端口中占用的端口  包括两个业务端口  及相应2倍跳的线路端口

    public Route(String id){
        this.id = id;
    }
    public Route(){
        this.id = UUID.randomUUID().toString().replace("-","");
    }
    public Route andFromNode(CommonNode node){
        this.fromNode = node;
        return this;
    }
    public Route andToNode(CommonNode node){
        this.toNode = node;
        return this;
    }
    public Route andRate(String rate){
        return this;
    }
    public Route andLayer(String layer){
        this.layer = layer;
        return this;
    }
    public Route andLinkList(List<BasicLink> links){
        this.linkList = links;
        return this;
    }
    public Route andLinkList(List<BasicLink> links,List<String> sourceID){
        this.sourceID = sourceID;
        return this;
    }

    public CommonNode getFromNode() {
        return fromNode;
    }

    public CommonNode getToNode() {
        return toNode;
    }

    public String getRate() {
        return rate;
    }

    public String getId() {
        return id;
    }

    public String getLayer() {
        return layer;
    }

    public int getHop() {
        return hop;
    }

    public int getLength() {
        return length;
    }

    public int getValue() {
        return value;
    }

    public boolean isSuccess() {
        return success;
    }

    public float getReliability() {
        return reliability;
    }

    public List<CommonNode> getNodeList() {
        return nodeList;
    }

    public List<BasicLink> getLinkList() {
        return linkList;
    }

    public List<String> getSourceID() {
        return sourceID;
    }

    public List<String> getPortSourceID() {
        return portSourceID;
    }
}
