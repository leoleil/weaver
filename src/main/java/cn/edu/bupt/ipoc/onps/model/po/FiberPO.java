package cn.edu.bupt.ipoc.onps.model.po;

public class FiberPO {
    private String fiberId;

    private Integer sequenceNumber;

    private String status;

    private String fiberLinkId;

    private String wdmLinkId;

    private String otnLinkId;

    private String sdhLinkId;

    public FiberPO(String fiberId, Integer sequenceNumber, String status, String fiberLinkId, String wdmLinkId, String otnLinkId, String sdhLinkId) {
        this.fiberId = fiberId;
        this.sequenceNumber = sequenceNumber;
        this.status = status;
        this.fiberLinkId = fiberLinkId;
        this.wdmLinkId = wdmLinkId;
        this.otnLinkId = otnLinkId;
        this.sdhLinkId = sdhLinkId;
    }

    public FiberPO() {
        super();
    }

    public String getFiberId() {
        return fiberId;
    }

    public void setFiberId(String fiberId) {
        this.fiberId = fiberId == null ? null : fiberId.trim();
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getFiberLinkId() {
        return fiberLinkId;
    }

    public void setFiberLinkId(String fiberLinkId) {
        this.fiberLinkId = fiberLinkId == null ? null : fiberLinkId.trim();
    }

    public String getWdmLinkId() {
        return wdmLinkId;
    }

    public void setWdmLinkId(String wdmLinkId) {
        this.wdmLinkId = wdmLinkId == null ? null : wdmLinkId.trim();
    }

    public String getOtnLinkId() {
        return otnLinkId;
    }

    public void setOtnLinkId(String otnLinkId) {
        this.otnLinkId = otnLinkId == null ? null : otnLinkId.trim();
    }

    public String getSdhLinkId() {
        return sdhLinkId;
    }

    public void setSdhLinkId(String sdhLinkId) {
        this.sdhLinkId = sdhLinkId == null ? null : sdhLinkId.trim();
    }
}