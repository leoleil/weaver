package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.model.Node;
import cn.edu.bupt.ipoc.onps.utils.LayerString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CommonNode implements Node {
    //变量
    protected String id;//节点ID，唯一
    protected int sequence;//链路序列号
    protected String name;//节点名称，唯一
    protected int year;//年份
    protected String type;//节点类型
    protected int level;//节点等级
    protected double longitude;//节点经度
    protected double latitude;//节点纬度
    protected double recoverLongitude;//恢复用节点经度
    protected double recoverLatitude;//恢复用节点纬度
    protected String status;//节点状态
    protected String subNetNum;//子网编号,对应网络域id
    protected boolean circleState;//环路状态
    protected Domain domain;//节点所属域
    protected double error;//节点故障率，计算电路可靠性使用
    protected List<SDHRing> SDHRing ;//所属SDH环
    protected List<Port> portOfOTN = new ArrayList<>();//存储该节点所有OTN层端口
    protected List<Port> portOfWDM = new ArrayList<>();//存储该节点所有WDM层端口
    protected List<Port> portOfSDH = new ArrayList<>();//存储该节点所有SDH层端口
    protected List<Port> portForEx = new ArrayList<>();//扩容端口
    public static class Builder{
        private String id;//节点ID，唯一
        private String name;//节点名称，唯一
        private int year;//年份
        private String type;//节点类型
        private int level;//节点等级
        private double longitude;//节点经度
        private double latitude;//节点纬度
        private String status;//节点状态

        private List<SDHRing> SDHRing ;//所属SDH环
        private List<Port> portOfOTN;//存储该节点所有OTN层端口
        private List<Port> portOfWDM;//存储该节点所有WDM层端口
        private List<Port> portOfSDH;//存储该节点所有SDH层端口
        private List<Port> portForEx;//扩容端口
        public Builder(String id , String name , double longitude , double latitude){
            this.id = id;
            this.name = name;
            this.latitude = latitude;
            this.longitude = longitude;
        }
        public Builder(String name , double longitude , double latitude){
            this.id = UUID.randomUUID().toString().replace("-","");
            this.name = name;
            this.latitude = latitude;
            this.longitude = longitude;
        }
        public Builder year(int year){
            this.year = year;
            return this;
        }
        public Builder type(String type){
            this.type = type;
            return this;
        }
        public Builder level(int level){
            this.level = level;
            return this;
        }
        public Builder status(String status){
            this.status = status;
            return this;
        }
        public CommonNode build(){
            return new CommonNode(this);
        }

    }
    protected CommonNode(Builder builder){
        id = builder.id;
        name = builder.name;
        longitude = builder.longitude;
        latitude = builder.latitude;
        recoverLongitude = longitude;
        recoverLatitude = latitude;
        year = builder.year;
        type = builder.type;
        status = builder.status;
    }
    public boolean addPort(Port port){
        switch (port.getLayer()){
            case LayerString.WDM: return portOfWDM.add(port);
            case LayerString.OTN: return portOfOTN.add(port);
            case LayerString.SDH: return portOfSDH.add(port);
            default: return false;
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getRecoverLongitude() {
        return recoverLongitude;
    }

    public void setRecoverLongitude(double recoverLongitude) {
        this.recoverLongitude = recoverLongitude;
    }

    public double getRecoverLatitude() {
        return recoverLatitude;
    }

    public void setRecoverLatitude(double recoverLatitude) {
        this.recoverLatitude = recoverLatitude;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;
        if(!(o instanceof CommonNode))
            return false;
        CommonNode node = (CommonNode) o;
        return node.getId().equals(this.id);
    }
    @Override
    public int hashCode(){
        return this.id.hashCode();
    }
}
