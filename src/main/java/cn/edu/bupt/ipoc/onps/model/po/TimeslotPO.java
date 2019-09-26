package cn.edu.bupt.ipoc.onps.model.po;

public class TimeslotPO {
    private String timeslotId;

    private String status;

    private Integer free;

    private String linkId;

    private Integer caption;

    private String sdhLinkId;

    private String trafficId;

    public TimeslotPO(String timeslotId, String status, Integer free, String linkId, Integer caption, String sdhLinkId, String trafficId) {
        this.timeslotId = timeslotId;
        this.status = status;
        this.free = free;
        this.linkId = linkId;
        this.caption = caption;
        this.sdhLinkId = sdhLinkId;
        this.trafficId = trafficId;
    }

    public TimeslotPO() {
        super();
    }

    public String getTimeslotId() {
        return timeslotId;
    }

    public void setTimeslotId(String timeslotId) {
        this.timeslotId = timeslotId == null ? null : timeslotId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId == null ? null : linkId.trim();
    }

    public Integer getCaption() {
        return caption;
    }

    public void setCaption(Integer caption) {
        this.caption = caption;
    }

    public String getSdhLinkId() {
        return sdhLinkId;
    }

    public void setSdhLinkId(String sdhLinkId) {
        this.sdhLinkId = sdhLinkId == null ? null : sdhLinkId.trim();
    }

    public String getTrafficId() {
        return trafficId;
    }

    public void setTrafficId(String trafficId) {
        this.trafficId = trafficId == null ? null : trafficId.trim();
    }
}