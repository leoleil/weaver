package cn.edu.bupt.ipoc.onps.model.po;

import java.util.UUID;

public class LayerRoutePO {
    private String layerRouteId;
    private String linkId;
    private String carryLinkId;
    private int routeSequence;
    private String carryLayer;
    private String carryCellId;

    public LayerRoutePO(String layerRouteId, String linkId, String carryLinkId, int routeSequence, String carryLayer, String carryCellId) {
        this.layerRouteId = layerRouteId;
        this.linkId = linkId;
        this.carryLinkId = carryLinkId;
        this.routeSequence = routeSequence;
        this.carryLayer = carryLayer;
        this.carryCellId = carryCellId;
    }

    public LayerRoutePO(String linkId, String carryLinkId, int routeSequence, String carryLayer, String carryCellId) {
        layerRouteId = UUID.randomUUID().toString().replace("-","");
        this.linkId = linkId;
        this.carryLinkId = carryLinkId;
        this.routeSequence = routeSequence;
        this.carryLayer = carryLayer;
        this.carryCellId = carryCellId;
    }

    public String getLayerRouteId() {
        return layerRouteId;
    }

    public void setLayerRouteId(String layerRouteId) {
        this.layerRouteId = layerRouteId;
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public String getCarryLinkId() {
        return carryLinkId;
    }

    public void setCarryLinkId(String carryLinkId) {
        this.carryLinkId = carryLinkId;
    }

    public int getRouteSequence() {
        return routeSequence;
    }

    public void setRouteSequence(int routeSquence) {
        this.routeSequence = routeSquence;
    }

    public String getCarryLayer() {
        return carryLayer;
    }

    public void setCarryLayer(String carryLayer) {
        this.carryLayer = carryLayer;
    }

    public String getCarryCellId() {
        return carryCellId;
    }

    public void setCarryCellId(String carryCellId) {
        this.carryCellId = carryCellId;
    }
}
