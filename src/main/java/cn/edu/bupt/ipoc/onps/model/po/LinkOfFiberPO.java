package cn.edu.bupt.ipoc.onps.model.po;

public class LinkOfFiberPO {
    private String linkId;

    private String name;

    private String layer;

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

    private String fiberLinkId;

    private Integer sequenceNumber;

    private Integer fualtTimes;

    private Integer completedYear;

    private String perfunctoryWay;

    private String maintainUnit;

    private String area;

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }
    public String getFromNodeId() {
        return fromNodeId;
    }
    public void setFromNodeId(String fromNodeId) {
        this.fromNodeId = fromNodeId;
    }

    public String getToNodeId() {
        return toNodeId;
    }

    public void setToNodeId(String toNodeId) {
        this.toNodeId = toNodeId;
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
        this.childNetNumber = childNetNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSurvivance() {
        return survivance;
    }

    public void setSurvivance(String survivance) {
        this.survivance = survivance;
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
        this.domain = domain;
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
        this.type = type;
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
        this.fromPort = fromPort;
    }

    public String getToPort() {
        return toPort;
    }

    public void setToPort(String toPort) {
        this.toPort = toPort;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getFiberLinkId() {
        return fiberLinkId;
    }

    public void setFiberLinkId(String fiberLinkId) {
        this.fiberLinkId = fiberLinkId;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Integer getFualtTimes() {
        return fualtTimes;
    }

    public void setFualtTimes(Integer fualtTimes) {
        this.fualtTimes = fualtTimes;
    }

    public Integer getCompletedYear() {
        return completedYear;
    }

    public void setCompletedYear(Integer completedYear) {
        this.completedYear = completedYear;
    }

    public String getPerfunctoryWay() {
        return perfunctoryWay;
    }

    public void setPerfunctoryWay(String perfunctoryWay) {
        this.perfunctoryWay = perfunctoryWay;
    }

    public String getMaintainUnit() {
        return maintainUnit;
    }

    public void setMaintainUnit(String maintainUnit) {
        this.maintainUnit = maintainUnit;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public LinkOfFiberPO() {
    }

    public LinkOfFiberPO(String linkId, String name, String layer, String fromNodeId, String toNodeId, Double length, Double rate, Integer year, Integer caption, Integer carried, Integer size, Double utilization, String childNetNumber, String status, String survivance, Double error, String domain, Double weight, String type, Integer free, String fromPort, String toPort, String projectId, String networkId, Integer level, String fiberLinkId, Integer sequenceNumber, Integer fualtTimes, Integer completedYear, String perfunctoryWay, String maintainUnit, String area) {
        this.linkId = linkId;
        this.name = name;
        this.layer = layer;
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
        this.fiberLinkId = fiberLinkId;
        this.sequenceNumber = sequenceNumber;
        this.fualtTimes = fualtTimes;
        this.completedYear = completedYear;
        this.perfunctoryWay = perfunctoryWay;
        this.maintainUnit = maintainUnit;
        this.area = area;
    }
}
