package cn.edu.bupt.ipoc.onps.base.algrithm.route;

import cn.edu.bupt.ipoc.onps.base.algrithm.TrafficRouteAlgorithm;
import cn.edu.bupt.ipoc.onps.model.Limit;
import cn.edu.bupt.ipoc.onps.model.entity.BasicLink;
import cn.edu.bupt.ipoc.onps.model.entity.CommonNode;
import cn.edu.bupt.ipoc.onps.model.entity.Traffic;

import java.util.List;
import java.util.Set;

public class TrafficSystemLimitRouteFinder implements TrafficRouteAlgorithm {



    @Override
    public List<BasicLink> find(List<BasicLink> links, List<CommonNode> nodes, Traffic traffic, String layer, String type, Set<Limit> limits) {
        //如果在同一个系统中，单系统内算路

        //如果不在同一个系统中，使用深度优先算路，选取跨系统最少的路

        return null;
    }
}
