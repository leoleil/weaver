package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.model.Link;
import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 基础的链路抽象类
 * 使用Builder设计模式
 */
public abstract class BasicLink implements Link {
    //变量
    protected String id;//链路ID，唯一
    protected int sequence;//链路序列号
    protected String name;//链路名称
    protected String layer;//所属层
    protected CommonNode fromNode;//链路起始节点
    protected CommonNode toNode;//链路到达节点
    protected double length;//链路长度
    protected double rate = 160.0;//链路速率
    protected int year;//年份
    protected int caption;//链路可容纳业务量
    protected int carried;//链路已承载业务量
    protected int size;//链路含有下层低粒度的数量
    protected double utilization;//链路利用率
    protected String childNetID;//所属子网id
    protected String status = LinkStatusString.FREE;//链路状态
    protected boolean survivance=false;//是否是故障链路 ture为是
    protected double error;//链路故障率，计算电路可靠性使用
    protected String domain;//链路域链路属性：1为域间链路，2为域内网关之间链路
    protected double weight;//链路权重
    protected int link;//链路复用度 （用于BSP算法）
    protected List<LinkRGroup> relate = new ArrayList<>(); //链路所在的共享风险链路组
    protected List<Traffic> carriedTraffic = new ArrayList<>();//承载业务
    protected String type;//链路类型
    protected int level;//链路等级
    protected int free;//链路空闲资源
    protected Port formPort;//链路首节点端口
    protected Port toPort;//链路尾节点端口

    abstract static class Builder <T extends Builder<T>> {
        //必须构建项目
        protected String id;//链路ID，唯一
        protected String name;//链路名称
        protected String layer;//所属层
        protected CommonNode fromNode;//链路起始节点
        protected CommonNode toNode;//链路到达节点

        //可设置项目
        protected int sequence;//链路序列号
        protected double length;//链路长度
        protected double rate = 160.0;//链路速率
        protected int year;//年份
        protected int caption;//链路可容纳业务量
        protected int size;//链路含有下层低粒度的数量
        protected String childNetID;//所属子网id
        protected String status = LinkStatusString.FREE;//链路状态
        protected double error;//链路故障率，计算电路可靠性使用
        protected String domain;//链路域链路属性：1为域间链路，2为域内网关之间链路
        protected double weight;//链路权重
        protected String type;//链路类型
        protected int level;//链路等级
        protected int free;//链路空闲资源

        /**
         * 节点间创建链路
         * 端口自动生成
         * @param id
         * @param name
         * @param layer
         * @param fromNode
         * @param toNode
         */
        public Builder(String id, String name, String layer,CommonNode fromNode,CommonNode toNode){
            this.id = id;//链路ID，唯一
            this.name = name;//链路名称
            this.layer = layer;//所属层
            this.fromNode = fromNode;//链路起始节点
            this.toNode = toNode;//链路到达节点
        }

        /**
         * 节点间创建链路
         * 端口自动生成
         * id自动生成
         * @param name
         * @param layer
         * @param fromNode
         * @param toNode
         */
        public Builder(String name, String layer,CommonNode fromNode,CommonNode toNode){
            id = UUID.randomUUID().toString().replaceAll("-","");
            this.name = name;//链路名称
            this.layer = layer;//所属层
            this.fromNode = fromNode;//链路起始节点
            this.toNode = toNode;//链路到达节点
        }

        protected abstract T self();

        public T sequence(int sequence){this.sequence = sequence; return self();}
        public T length(double length){this.length = length; return self();}
        public T rate(double rate){this.rate = rate; return self();}
        public T year(int year){this.year = year; return self();}
        public T caption(int caption){this.caption = caption; return self();}
        public T size(int size){this.size = size;this.free = size; return self();}
        public T childNetID(String childNetID){this.childNetID = childNetID; return self();}
        public T status(String status){this.status = status; return self();}
        public T weight(double weight){this.weight = weight; return self();}
        public T type(String type){this.type = type; return self();}
        public T level(int level){this.level = level; return self();}

        abstract BasicLink build();

    }

    protected BasicLink(Builder <?> builder){
        this.id = builder.id;
        this.name = builder.name;
        this.layer = builder.layer;
        this.fromNode = builder.fromNode;
        this.toNode = builder.toNode;
        this.sequence = builder.sequence;
        this.length = builder.length;
        this.rate = builder.rate;
        this.year = builder.year;
        this.caption = builder.caption;
        this.size = builder.size;
        this.free = builder.free;
        this.childNetID = builder.childNetID;
        this.status = builder.status;
        this.weight = builder.weight;
        this.type = builder.type;
        this.level = builder.level;
        //设置端口
    }

    public String getId() {
        return id;
    }

    public int getSequence() {
        return sequence;
    }

    public String getName() {
        return name;
    }

    public String getLayer() {
        return layer;
    }

    public CommonNode getFromNode() {
        return fromNode;
    }

    public CommonNode getToNode() {
        return toNode;
    }

    public double getLength() {
        return length;
    }

    public double getRate() {
        return rate;
    }

    public int getYear() {
        return year;
    }

    public int getCaption() {
        return caption;
    }

    public int getCarried() {
        return carried;
    }

    public int getSize() {
        return size;
    }

    public double getUtilization() {
        return utilization;
    }

    public String getChildNetID() {
        return childNetID;
    }

    public String getStatus() {
        return status;
    }

    public boolean isSurvivance() {
        return survivance;
    }

    public double getError() {
        return error;
    }

    public String getDomain() {
        return domain;
    }

    public double getWeight() {
        return weight;
    }

    public int getLink() {
        return link;
    }

    public List<LinkRGroup> getRelate() {
        return relate;
    }

    public List<Traffic> getCarriedTraffic() {
        return carriedTraffic;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getFree() {
        return free;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public boolean addTraffic(Traffic traffic){
        return carriedTraffic.add(traffic);
    }

    /**
     * 重载equals方法
     * 地址一样的对象一定是相等的
     * 如果两个链路的Id是一样的也是相等的
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;
        if(!(o instanceof BasicLink))
            return false;
        BasicLink link = (BasicLink) o;
        return link.id.equals(this.id);
    }

    /**
     * 重载hanscode方法
     * hashcode使用Id生成
     * @return
     */
    @Override
    public int hashCode(){
        return this.id.hashCode();
    }

}
