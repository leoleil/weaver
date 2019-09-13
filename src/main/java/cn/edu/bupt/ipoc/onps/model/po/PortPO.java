package cn.edu.bupt.ipoc.onps.model.po;

public class PortPO {
    private String id;

    private Double velocity;

    private String layer;

    private String portType;

    private String portRate;

    private String status;

    private String nodeId;

    public PortPO(String id, Double velocity, String layer, String portType, String portRate, String status, String nodeId) {
        this.id = id;
        this.velocity = velocity;
        this.layer = layer;
        this.portType = portType;
        this.portRate = portRate;
        this.status = status;
        this.nodeId = nodeId;
    }

    public PortPO() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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
}