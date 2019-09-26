package cn.edu.bupt.ipoc.onps.model.po;

public class FiberLinkPO {
    private String fiberLinkId;

    private Integer sequenceNumber;

    private Integer fualtTimes;

    private Integer completedYear;

    private String perfunctoryWay;

    private String maintainUnit;

    private String area;

    public FiberLinkPO(String fiberLinkId, Integer sequenceNumber, Integer fualtTimes, Integer completedYear, String perfunctoryWay, String maintainUnit, String area) {
        this.fiberLinkId = fiberLinkId;
        this.sequenceNumber = sequenceNumber;
        this.fualtTimes = fualtTimes;
        this.completedYear = completedYear;
        this.perfunctoryWay = perfunctoryWay;
        this.maintainUnit = maintainUnit;
        this.area = area;
    }

    public FiberLinkPO() {
        super();
    }

    public String getFiberLinkId() {
        return fiberLinkId;
    }

    public void setFiberLinkId(String fiberLinkId) {
        this.fiberLinkId = fiberLinkId == null ? null : fiberLinkId.trim();
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Integer getFualtTimes() {
        return fualtTimes;
    }

    public void setFualtTimes(Integer fualtTimes) {
        this.fualtTimes = fualtTimes;
    }

    public Integer getCompletedYear() {
        return completedYear;
    }

    public void setCompletedYear(Integer completedYear) {
        this.completedYear = completedYear;
    }

    public String getPerfunctoryWay() {
        return perfunctoryWay;
    }

    public void setPerfunctoryWay(String perfunctoryWay) {
        this.perfunctoryWay = perfunctoryWay == null ? null : perfunctoryWay.trim();
    }

    public String getMaintainUnit() {
        return maintainUnit;
    }

    public void setMaintainUnit(String maintainUnit) {
        this.maintainUnit = maintainUnit == null ? null : maintainUnit.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }
}