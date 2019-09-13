package cn.edu.bupt.ipoc.onps.base.algrithm;

import cn.edu.bupt.ipoc.onps.model.entity.BasicLink;
import cn.edu.bupt.ipoc.onps.model.entity.CommonNode;
import cn.edu.bupt.ipoc.onps.model.entity.Traffic;

import java.util.List;

public interface TrafficRouteAlgorithm {
    boolean find (List<BasicLink> links, List<CommonNode> nodes, Traffic traffic, String layer, String type) ;
}
