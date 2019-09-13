package cn.edu.bupt.ipoc.onps.model.po;

public class LinkPO {
    private String id;

    private String name;

    private String layer;

    private String linkExpendId;

    private String fromNodeId;

    private String toNodeId;

    private Double length;

    private Double rate;

    private Integer year;

    private Integer caption;

    private Integer carried;

    private Integer size;

    private Double utilization;

    private String childNetNumber;

    private String status;

    private String survivance;

    private Double error;

    private String domain;

    private Double weight;

    private String type;

    private Integer free;

    private String fromPort;

    private String toPort;

    private String projectId;

    private String networkId;

    private Integer level;

    public LinkPO(String id, String name, String layer, String linkExpendId, String fromNodeId, String toNodeId, Double length, Double rate, Integer year, Integer caption, Integer carried, Integer size, Double utilization, String childNetNumber, String status, String survivance, Double error, String domain, Double weight, String type, Integer free, String fromPort, String toPort, String projectId, String networkId, Integer level) {
        this.id = id;
        this.name = name;
        this.layer = layer;
        this.linkExpendId = linkExpendId;
        this.fromNodeId = fromNodeId;
        this.toNodeId = toNodeId;
        this.length = length;
        this.rate = rate;
        this.year = year;
        this.caption = caption;
        this.carried = carried;
        this.size = size;
        this.utilization = utilization;
        this.childNetNumber = childNetNumber;
        this.status = status;
        this.survivance = survivance;
        this.error = error;
        this.domain = domain;
        this.weight = weight;
        this.type = type;
        this.free = free;
        this.fromPort = fromPort;
        this.toPort = toPort;
        this.projectId = projectId;
        this.networkId = networkId;
        this.level = level;
    }

    public LinkPO() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer == null ? null : layer.trim();
    }

    public String getLinkExpendId() {
        return linkExpendId;
    }

    public void setLinkExpendId(String linkExpendId) {
        this.linkExpendId = linkExpendId == null ? null : linkExpendId.trim();
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

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCaption() {
        return caption;
    }

    public void setCaption(Integer caption) {
        this.caption = caption;
    }

    public Integer getCarried() {
        return carried;
    }

    public void setCarried(Integer carried) {
        this.carried = carried;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Double getUtilization() {
        return utilization;
    }

    public void setUtilization(Double utilization) {
        this.utilization = utilization;
    }

    public String getChildNetNumber() {
        return childNetNumber;
    }

    public void setChildNetNumber(String childNetNumber) {
        this.childNetNumber = childNetNumber == null ? null : childNetNumber.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSurvivance() {
        return survivance;
    }

    public void setSurvivance(String survivance) {
        this.survivance = survivance == null ? null : survivance.trim();
    }

    public Double getError() {
        return error;
    }

    public void setError(Double error) {
        this.error = error;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    public String getFromPort() {
        return fromPort;
    }

    public void setFromPort(String fromPort) {
        this.fromPort = fromPort == null ? null : fromPort.trim();
    }

    public String getToPort() {
        return toPort;
    }

    public void setToPort(String toPort) {
        this.toPort = toPort == null ? null : toPort.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId == null ? null : networkId.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}