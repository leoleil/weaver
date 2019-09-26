package cn.edu.bupt.ipoc.onps.model.po;

public class OTNLinkPO {
    private String otnLinkId;

    private Integer sequenceNumber;

    private String carryType;

    public OTNLinkPO(String otnLinkId, Integer sequenceNumber, String carryType) {
        this.otnLinkId = otnLinkId;
        this.sequenceNumber = sequenceNumber;
        this.carryType = carryType;
    }

    public OTNLinkPO() {
        super();
    }

    public String getOtnLinkId() {
        return otnLinkId;
    }

    public void setOtnLinkId(String otnLinkId) {
        this.otnLinkId = otnLinkId == null ? null : otnLinkId.trim();
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getCarryType() {
        return carryType;
    }

    public void setCarryType(String carryType) {
        this.carryType = carryType == null ? null : carryType.trim();
    }
}