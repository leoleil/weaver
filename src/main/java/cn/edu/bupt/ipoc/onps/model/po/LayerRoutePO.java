package cn.edu.bupt.ipoc.onps.model.po;

public class LayerRoutePO {
    private String id;

    private String linkId;

    private String carryLinkId;

    private Integer routeSequence;

    private String carryLayer;

    private String carryCellId;

    public LayerRoutePO(String id, String linkId, String carryLinkId, Integer routeSequence, String carryLayer, String carryCellId) {
        this.id = id;
        this.linkId = linkId;
        this.carryLinkId = carryLinkId;
        this.routeSequence = routeSequence;
        this.carryLayer = carryLayer;
        this.carryCellId = carryCellId;
    }

    public LayerRoutePO() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public Integer getRouteSequence() {
        return routeSequence;
    }

    public void setRouteSequence(Integer routeSequence) {
        this.routeSequence = routeSequence;
    }

    public String getCarryLayer() {
        return carryLayer;
    }

    public void setCarryLayer(String carryLayer) {
        this.carryLayer = carryLayer == null ? null : carryLayer.trim();
    }

    public String getCarryCellId() {
        return carryCellId;
    }

    public void setCarryCellId(String carryCellId) {
        this.carryCellId = carryCellId == null ? null : carryCellId.trim();
    }
}