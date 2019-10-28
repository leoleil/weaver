package cn.edu.bupt.ipoc.onps.base.algrithm;

import cn.edu.bupt.ipoc.onps.model.Limit;
import cn.edu.bupt.ipoc.onps.model.entity.BasicLink;
import cn.edu.bupt.ipoc.onps.model.entity.CommonNode;
import cn.edu.bupt.ipoc.onps.model.entity.Traffic;

import java.util.List;
import java.util.Set;

public interface TrafficRouteAlgorithm {
    /**
     * 计算业务路由
     * @param links
     * @param nodes
     * @param type
     * @param limits
     * @return
     */
    List<BasicLink> find (Set<BasicLink> links, Set<CommonNode> nodes, CommonNode fromNode, CommonNode toNode, String type, Set<Limit> limits) ;
}
