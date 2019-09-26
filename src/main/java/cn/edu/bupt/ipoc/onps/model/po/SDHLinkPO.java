package cn.edu.bupt.ipoc.onps.model.po;

public class SDHLinkPO {
    private String sdhId;

    private Integer sequenceNumber;

    private String inRing;

    private String carryType;

    public SDHLinkPO(String sdhId, Integer sequenceNumber, String inRing, String carryType) {
        this.sdhId = sdhId;
        this.sequenceNumber = sequenceNumber;
        this.inRing = inRing;
        this.carryType = carryType;
    }

    public SDHLinkPO() {
        super();
    }

    public String getSdhId() {
        return sdhId;
    }

    public void setSdhId(String sdhId) {
        this.sdhId = sdhId == null ? null : sdhId.trim();
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getInRing() {
        return inRing;
    }

    public void setInRing(String inRing) {
        this.inRing = inRing == null ? null : inRing.trim();
    }

    public String getCarryType() {
        return carryType;
    }

    public void setCarryType(String carryType) {
        this.carryType = carryType == null ? null : carryType.trim();
    }
}