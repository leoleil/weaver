package cn.edu.bupt.ipoc.onps.model.po;

public class TrafficPO {
    private String id;

    private String name;

    private String layer;

    private String fromNodeId;

    private String toNodeId;

    private Double rate;

    private String trafficRate;

    private String trafficStatus;

    private String trafficGroupIp;

    private String trafficLevel;

    private Integer year;

    private Integer effect;

    private Integer fall;

    private Integer cutoff;

    private String type;

    private String workRouteId;

    private String resumeRouteId;

    private String protectRouteId;

    private String resumeRouteForProtectId;

    private String workMustNodeId;

    private String workNeverNodeId;

    private String protectMustNodeId;

    private String protectNeverNodeId;

    private String workMustLinkId;

    private String workNeverLinkId;

    private String protectMustLinkId;

    private String protectNeverLinkId;

    private String faultAffected;

    private Integer faultType;

    private Integer priorityLevel;

    private String projectId;

    public TrafficPO(String id, String name, String layer, String fromNodeId, String toNodeId, Double rate, String trafficRate, String trafficStatus, String trafficGroupIp, String trafficLevel, Integer year, Integer effect, Integer fall, Integer cutoff, String type, String workRouteId, String resumeRouteId, String protectRouteId, String resumeRouteForProtectId, String workMustNodeId, String workNeverNodeId, String protectMustNodeId, String protectNeverNodeId, String workMustLinkId, String workNeverLinkId, String protectMustLinkId, String protectNeverLinkId, String faultAffected, Integer faultType, Integer priorityLevel, String projectId) {
        this.id = id;
        this.name = name;
        this.layer = layer;
        this.fromNodeId = fromNodeId;
        this.toNodeId = toNodeId;
        this.rate = rate;
        this.trafficRate = trafficRate;
        this.trafficStatus = trafficStatus;
        this.trafficGroupIp = trafficGroupIp;
        this.trafficLevel = trafficLevel;
        this.year = year;
        this.effect = effect;
        this.fall = fall;
        this.cutoff = cutoff;
        this.type = type;
        this.workRouteId = workRouteId;
        this.resumeRouteId = resumeRouteId;
        this.protectRouteId = protectRouteId;
        this.resumeRouteForProtectId = resumeRouteForProtectId;
        this.workMustNodeId = workMustNodeId;
        this.workNeverNodeId = workNeverNodeId;
        this.protectMustNodeId = protectMustNodeId;
        this.protectNeverNodeId = protectNeverNodeId;
        this.workMustLinkId = workMustLinkId;
        this.workNeverLinkId = workNeverLinkId;
        this.protectMustLinkId = protectMustLinkId;
        this.protectNeverLinkId = protectNeverLinkId;
        this.faultAffected = faultAffected;
        this.faultType = faultType;
        this.priorityLevel = priorityLevel;
        this.projectId = projectId;
    }

    public TrafficPO() {
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

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getTrafficRate() {
        return trafficRate;
    }

    public void setTrafficRate(String trafficRate) {
        this.trafficRate = trafficRate == null ? null : trafficRate.trim();
    }

    public String getTrafficStatus() {
        return trafficStatus;
    }

    public void setTrafficStatus(String trafficStatus) {
        this.trafficStatus = trafficStatus == null ? null : trafficStatus.trim();
    }

    public String getTrafficGroupIp() {
        return trafficGroupIp;
    }

    public void setTrafficGroupIp(String trafficGroupIp) {
        this.trafficGroupIp = trafficGroupIp == null ? null : trafficGroupIp.trim();
    }

    public String getTrafficLevel() {
        return trafficLevel;
    }

    public void setTrafficLevel(String trafficLevel) {
        this.trafficLevel = trafficLevel == null ? null : trafficLevel.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getEffect() {
        return effect;
    }

    public void setEffect(Integer effect) {
        this.effect = effect;
    }

    public Integer getFall() {
        return fall;
    }

    public void setFall(Integer fall) {
        this.fall = fall;
    }

    public Integer getCutoff() {
        return cutoff;
    }

    public void setCutoff(Integer cutoff) {
        this.cutoff = cutoff;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getWorkRouteId() {
        return workRouteId;
    }

    public void setWorkRouteId(String workRouteId) {
        this.workRouteId = workRouteId == null ? null : workRouteId.trim();
    }

    public String getResumeRouteId() {
        return resumeRouteId;
    }

    public void setResumeRouteId(String resumeRouteId) {
        this.resumeRouteId = resumeRouteId == null ? null : resumeRouteId.trim();
    }

    public String getProtectRouteId() {
        return protectRouteId;
    }

    public void setProtectRouteId(String protectRouteId) {
        this.protectRouteId = protectRouteId == null ? null : protectRouteId.trim();
    }

    public String getResumeRouteForProtectId() {
        return resumeRouteForProtectId;
    }

    public void setResumeRouteForProtectId(String resumeRouteForProtectId) {
        this.resumeRouteForProtectId = resumeRouteForProtectId == null ? null : resumeRouteForProtectId.trim();
    }

    public String getWorkMustNodeId() {
        return workMustNodeId;
    }

    public void setWorkMustNodeId(String workMustNodeId) {
        this.workMustNodeId = workMustNodeId == null ? null : workMustNodeId.trim();
    }

    public String getWorkNeverNodeId() {
        return workNeverNodeId;
    }

    public void setWorkNeverNodeId(String workNeverNodeId) {
        this.workNeverNodeId = workNeverNodeId == null ? null : workNeverNodeId.trim();
    }

    public String getProtectMustNodeId() {
        return protectMustNodeId;
    }

    public void setProtectMustNodeId(String protectMustNodeId) {
        this.protectMustNodeId = protectMustNodeId == null ? null : protectMustNodeId.trim();
    }

    public String getProtectNeverNodeId() {
        return protectNeverNodeId;
    }

    public void setProtectNeverNodeId(String protectNeverNodeId) {
        this.protectNeverNodeId = protectNeverNodeId == null ? null : protectNeverNodeId.trim();
    }

    public String getWorkMustLinkId() {
        return workMustLinkId;
    }

    public void setWorkMustLinkId(String workMustLinkId) {
        this.workMustLinkId = workMustLinkId == null ? null : workMustLinkId.trim();
    }

    public String getWorkNeverLinkId() {
        return workNeverLinkId;
    }

    public void setWorkNeverLinkId(String workNeverLinkId) {
        this.workNeverLinkId = workNeverLinkId == null ? null : workNeverLinkId.trim();
    }

    public String getProtectMustLinkId() {
        return protectMustLinkId;
    }

    public void setProtectMustLinkId(String protectMustLinkId) {
        this.protectMustLinkId = protectMustLinkId == null ? null : protectMustLinkId.trim();
    }

    public String getProtectNeverLinkId() {
        return protectNeverLinkId;
    }

    public void setProtectNeverLinkId(String protectNeverLinkId) {
        this.protectNeverLinkId = protectNeverLinkId == null ? null : protectNeverLinkId.trim();
    }

    public String getFaultAffected() {
        return faultAffected;
    }

    public void setFaultAffected(String faultAffected) {
        this.faultAffected = faultAffected == null ? null : faultAffected.trim();
    }

    public Integer getFaultType() {
        return faultType;
    }

    public void setFaultType(Integer faultType) {
        this.faultType = faultType;
    }

    public Integer getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }
}