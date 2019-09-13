package cn.edu.bupt.ipoc.onps.base.allocation;

import cn.edu.bupt.ipoc.onps.model.entity.Resource;
import cn.edu.bupt.ipoc.onps.model.entity.Route;

public interface ResourceManagement {
    Route getLayerRoute(String fromNodeId, String toNodeId, String pattern, Resource resource);
}
