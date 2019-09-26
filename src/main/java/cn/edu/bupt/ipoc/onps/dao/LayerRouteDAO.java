package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.LayerRoutePO;

import java.util.List;

public interface LayerRouteDAO {
    int insertLayerRoute(List<LayerRoutePO> layerRoutePOList);
}
