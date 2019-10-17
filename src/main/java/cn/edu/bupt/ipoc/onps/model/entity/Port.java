package cn.edu.bupt.ipoc.onps.model.entity;

import java.util.List;
import java.util.UUID;

public class Port {
    private String id;//端口ID
    private CommonNode belongsNode;//端口所属节点
    private BasicLink belongsLink;//端口所属链路
    private String rate;//端口速率：
    private String layer;//端口技术类型
    private String statue;//端口状态
    private String type;//端口类型
    //用于资源分配
    private String grand;//WDM/OTN端口 对应链路的波道序号
    private int free;//端口剩余资源
    private List<Traffic> carriedTraffic;//承载业务
    public Port(String id , String layer){
        this.id = id;
        this.layer = layer;
    }
    public Port(String layer){
        this.id = UUID.randomUUID().toString().replace("-","");
        this.layer = layer;
    }

    public boolean addTraffic(Traffic traffic){
        return carriedTraffic.add(traffic);
    }

    public String getLayer() {
        return layer;
    }

    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }

    public void setBelongsNode(CommonNode belongsNode) {
        this.belongsNode = belongsNode;
    }

    public BasicLink getBelongsLink() {
        return belongsLink;
    }

    public void setBelongsLink(BasicLink belongsLink) {
        this.belongsLink = belongsLink;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGrand() {
        return grand;
    }

    public void setGrand(String grand) {
        this.grand = grand;
    }

    public int getFree() {
        return free;
    }

    public void setFree(int free) {
        this.free = free;
    }

    public CommonNode getBelongsNode() {
        return belongsNode;
    }
}
