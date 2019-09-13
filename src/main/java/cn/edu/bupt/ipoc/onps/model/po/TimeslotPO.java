package cn.edu.bupt.ipoc.onps.model.po;

public class TimeslotPO {
    private String id;

    private String status;

    private String sdhId;

    private Integer free;

    private String linkId;

    private Integer caption;

    public TimeslotPO(String id, String status, String sdhId, Integer free, String linkId, Integer caption) {
        this.id = id;
        this.status = status;
        this.sdhId = sdhId;
        this.free = free;
        this.linkId = linkId;
        this.caption = caption;
    }

    public TimeslotPO() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSdhId() {
        return sdhId;
    }

    public void setSdhId(String sdhId) {
        this.sdhId = sdhId == null ? null : sdhId.trim();
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
}