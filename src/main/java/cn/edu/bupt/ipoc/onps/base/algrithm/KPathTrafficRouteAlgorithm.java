package cn.edu.bupt.ipoc.onps.base.algrithm;

import cn.edu.bupt.ipoc.onps.model.Limit;
import cn.edu.bupt.ipoc.onps.model.entity.BasicLink;
import cn.edu.bupt.ipoc.onps.model.entity.CommonNode;
import cn.edu.bupt.ipoc.onps.model.entity.Traffic;

import java.util.List;
import java.util.Set;

public interface KPathTrafficRouteAlgorithm {
    /**
     * 计算K条路由 其中K条路由存在限制
     * @param links
     * @param nodes
     * @param traffic
     * @param layer
     * @param rate
     * @param k
     * @return
     */
    List<List<BasicLink>> find (Set<BasicLink> links, Set<CommonNode> nodes, Traffic traffic, String layer, double rate, int k, Set<Limit> limits) ;
}
