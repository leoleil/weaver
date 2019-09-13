package cn.edu.bupt.ipoc.onps.model.po;

public class TrafficRoutePO {
    private String id;

    private String fromNodeId;

    private String toNodeId;

    private String rate;

    private String layer;

    private String trafficId;

    private Integer hop;

    private Integer length;

    private Integer value;

    private Integer success;

    private Double reliability;

    private String linkId;

    private Integer routeSequence;

    private String sourceId;

    private String type;

    private String fromPortSourceId;

    private String toPortSourceId;

    public TrafficRoutePO(String id, String fromNodeId, String toNodeId, String rate, String layer, String trafficId, Integer hop, Integer length, Integer value, Integer success, Double reliability, String linkId, Integer routeSequence, String sourceId, String type, String fromPortSourceId, String toPortSourceId) {
        this.id = id;
        this.fromNodeId = fromNodeId;
        this.toNodeId = toNodeId;
        this.rate = rate;
        this.layer = layer;
        this.trafficId = trafficId;
        this.hop = hop;
        this.length = length;
        this.value = value;
        this.success = success;
        this.reliability = reliability;
        this.linkId = linkId;
        this.routeSequence = routeSequence;
        this.sourceId = sourceId;
        this.type = type;
        this.fromPortSourceId = fromPortSourceId;
        this.toPortSourceId = toPortSourceId;
    }

    public TrafficRoutePO() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFromNodeId() {
        return fromNodeId;
    }

    public void setFromNodeId(String fromNodeId) {
        this.fromNodeId = fromNodeId == null ? null : fromNodeId.trim();
    }

    public String getToNodeId() {
        return toNodeId;
    }

    public void setToNodeId(String toNodeId) {
        this.toNodeId = toNodeId == null ? null : toNodeId.trim();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer == null ? null : layer.trim();
    }

    public String getTrafficId() {
        return trafficId;
    }

    public void setTrafficId(String trafficId) {
        this.trafficId = trafficId == null ? null : trafficId.trim();
    }

    public Integer getHop() {
        return hop;
    }

    public void setHop(Integer hop) {
        this.hop = hop;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public Double getReliability() {
        return reliability;
    }

    public void setReliability(Double reliability) {
        this.reliability = reliability;
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId == null ? null : linkId.trim();
    }

    public Integer getRouteSequence() {
        return routeSequence;
    }

    public void setRouteSequence(Integer routeSequence) {
        this.routeSequence = routeSequence;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getFromPortSourceId() {
        return fromPortSourceId;
    }

    public void setFromPortSourceId(String fromPortSourceId) {
        this.fromPortSourceId = fromPortSourceId == null ? null : fromPortSourceId.trim();
    }

    public String getToPortSourceId() {
        return toPortSourceId;
    }

    public void setToPortSourceId(String toPortSourceId) {
        this.toPortSourceId = toPortSourceId == null ? null : toPortSourceId.trim();
    }
}