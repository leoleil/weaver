package cn.edu.bupt.ipoc.onps.model.po;

public class WavelengthPO {
    private String id;

    private Integer sequenceNumber;

    private String status;

    private String waveType;

    private Integer year;

    private Integer caption;

    private Integer free;

    private Integer gran;

    private String wdmId;

    private String linkId;

    public WavelengthPO(String id, Integer sequenceNumber, String status, String waveType, Integer year, Integer caption, Integer free, Integer gran, String wdmId, String linkId) {
        this.id = id;
        this.sequenceNumber = sequenceNumber;
        this.status = status;
        this.waveType = waveType;
        this.year = year;
        this.caption = caption;
        this.free = free;
        this.gran = gran;
        this.wdmId = wdmId;
        this.linkId = linkId;
    }

    public WavelengthPO() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getWaveType() {
        return waveType;
    }

    public void setWaveType(String waveType) {
        this.waveType = waveType == null ? null : waveType.trim();
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

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    public Integer getGran() {
        return gran;
    }

    public void setGran(Integer gran) {
        this.gran = gran;
    }

    public String getWdmId() {
        return wdmId;
    }

    public void setWdmId(String wdmId) {
        this.wdmId = wdmId == null ? null : wdmId.trim();
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId == null ? null : linkId.trim();
    }
}