package cn.edu.bupt.ipoc.onps.model.po;

public class NodePO {
    private String nodeId;

    private String name;

    private Double longitude;

    private Double latitude;

    private Integer year;

    private String nodeType;

    private String status;

    private Double failureRate;

    private Integer sequrenceNumber;

    private String projectId;

    private String networkId;

    private Integer level;

    private String level1;

    private String level2;

    private String level3;

    public NodePO(String nodeId, String name, Double longitude, Double latitude, Integer year, String nodeType, String status, Double failureRate, Integer sequrenceNumber, String projectId, String networkId, Integer level, String level1, String level2, String level3) {
        this.nodeId = nodeId;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.year = year;
        this.nodeType = nodeType;
        this.status = status;
        this.failureRate = failureRate;
        this.sequrenceNumber = sequrenceNumber;
        this.projectId = projectId;
        this.networkId = networkId;
        this.level = level;
        this.level1 = level1;
        this.level2 = level2;
        this.level3 = level3;
    }

    public NodePO() {
        super();
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType == null ? null : nodeType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Double getFailureRate() {
        return failureRate;
    }

    public void setFailureRate(Double failureRate) {
        this.failureRate = failureRate;
    }

    public Integer getSequrenceNumber() {
        return sequrenceNumber;
    }

    public void setSequrenceNumber(Integer sequrenceNumber) {
        this.sequrenceNumber = sequrenceNumber;
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

    public String getLevel1() {
        return level1;
    }

    public void setLevel1(String level1) {
        this.level1 = level1 == null ? null : level1.trim();
    }

    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2 == null ? null : level2.trim();
    }

    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3 == null ? null : level3.trim();
    }
}