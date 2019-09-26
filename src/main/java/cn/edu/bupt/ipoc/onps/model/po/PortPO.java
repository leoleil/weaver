package cn.edu.bupt.ipoc.onps.model.po;

public class PortPO {
    private String portId;

    private Double velocity;

    private String layer;

    private String portType;

    private String portRate;

    private String status;

    private String nodeId;

    private Integer free;

    private Integer caption;

    public PortPO(String portId, Double velocity, String layer, String portType, String portRate, String status, String nodeId, Integer free, Integer caption) {
        this.portId = portId;
        this.velocity = velocity;
        this.layer = layer;
        this.portType = portType;
        this.portRate = portRate;
        this.status = status;
        this.nodeId = nodeId;
        this.free = free;
        this.caption = caption;
    }

    public PortPO() {
        super();
    }

    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId == null ? null : portId.trim();
    }

    public Double getVelocity() {
        return velocity;
    }

    public void setVelocity(Double velocity) {
        this.velocity = velocity;
    }

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer == null ? null : layer.trim();
    }

    public String getPortType() {
        return portType;
    }

    public void setPortType(String portType) {
        this.portType = portType == null ? null : portType.trim();
    }

    public String getPortRate() {
        return portRate;
    }

    public void setPortRate(String portRate) {
        this.portRate = portRate == null ? null : portRate.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    public Integer getCaption() {
        return caption;
    }

    public void setCaption(Integer caption) {
        this.caption = caption;
    }
}