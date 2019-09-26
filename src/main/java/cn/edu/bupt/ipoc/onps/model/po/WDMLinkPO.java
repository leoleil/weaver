package cn.edu.bupt.ipoc.onps.model.po;

public class WDMLinkPO {
    private String wdmLinkId;

    private Integer sequenceNumber;

    private String deviceType;

    public WDMLinkPO(String wdmLinkId, Integer sequenceNumber, String deviceType) {
        this.wdmLinkId = wdmLinkId;
        this.sequenceNumber = sequenceNumber;
        this.deviceType = deviceType;
    }

    public WDMLinkPO() {
        super();
    }

    public String getWdmLinkId() {
        return wdmLinkId;
    }

    public void setWdmLinkId(String wdmLinkId) {
        this.wdmLinkId = wdmLinkId == null ? null : wdmLinkId.trim();
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }
}