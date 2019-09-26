package cn.edu.bupt.ipoc.onps.model.po;

public class WavelengthPO {
    private String wavelengthId;

    private Integer sequenceNumber;

    private String status;

    private String waveType;

    private Integer year;

    private Integer caption;

    private Integer free;

    private Integer gran;

    private String wdmLinkId;

    private String linkId;

    private String carryLinkId;

    private String trafficId;

    public WavelengthPO(String wavelengthId, Integer sequenceNumber, String status, String waveType, Integer year, Integer caption, Integer free, Integer gran, String wdmLinkId, String linkId, String carryLinkId, String trafficId) {
        this.wavelengthId = wavelengthId;
        this.sequenceNumber = sequenceNumber;
        this.status = status;
        this.waveType = waveType;
        this.year = year;
        this.caption = caption;
        this.free = free;
        this.gran = gran;
        this.wdmLinkId = wdmLinkId;
        this.linkId = linkId;
        this.carryLinkId = carryLinkId;
        this.trafficId = trafficId;
    }

    public WavelengthPO() {
        super();
    }

    public String getWavelengthId() {
        return wavelengthId;
    }

    public void setWavelengthId(String wavelengthId) {
        this.wavelengthId = wavelengthId == null ? null : wavelengthId.trim();
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

    public String getWdmLinkId() {
        return wdmLinkId;
    }

    public void setWdmLinkId(String wdmLinkId) {
        this.wdmLinkId = wdmLinkId == null ? null : wdmLinkId.trim();
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId == null ? null : linkId.trim();
    }

    public String getCarryLinkId() {
        return carryLinkId;
    }

    public void setCarryLinkId(String carryLinkId) {
        this.carryLinkId = carryLinkId == null ? null : carryLinkId.trim();
    }

    public String getTrafficId() {
        return trafficId;
    }

    public void setTrafficId(String trafficId) {
        this.trafficId = trafficId == null ? null : trafficId.trim();
    }
}