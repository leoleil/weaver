package cn.edu.bupt.ipoc.onps.model.po;

public class OTUPO {
    private String otuId;

    private String status;

    private String otnLinkId;

    private String linkId;

    private String carrayLinkId;

    private String trafficId;

    private String type;

    private Integer gran;

    public OTUPO(String otuId, String status, String otnLinkId, String linkId, String carrayLinkId, String trafficId, String type, Integer gran) {
        this.otuId = otuId;
        this.status = status;
        this.otnLinkId = otnLinkId;
        this.linkId = linkId;
        this.carrayLinkId = carrayLinkId;
        this.trafficId = trafficId;
        this.type = type;
        this.gran = gran;
    }

    public OTUPO() {
        super();
    }

    public String getOtuId() {
        return otuId;
    }

    public void setOtuId(String otuId) {
        this.otuId = otuId == null ? null : otuId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOtnLinkId() {
        return otnLinkId;
    }

    public void setOtnLinkId(String otnLinkId) {
        this.otnLinkId = otnLinkId == null ? null : otnLinkId.trim();
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId == null ? null : linkId.trim();
    }

    public String getCarrayLinkId() {
        return carrayLinkId;
    }

    public void setCarrayLinkId(String carrayLinkId) {
        this.carrayLinkId = carrayLinkId == null ? null : carrayLinkId.trim();
    }

    public String getTrafficId() {
        return trafficId;
    }

    public void setTrafficId(String trafficId) {
        this.trafficId = trafficId == null ? null : trafficId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getGran() {
        return gran;
    }

    public void setGran(Integer gran) {
        this.gran = gran;
    }
}