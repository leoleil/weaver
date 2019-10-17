package cn.edu.bupt.ipoc.onps.base.algrithm;

import cn.edu.bupt.ipoc.onps.model.entity.BasicLink;
import cn.edu.bupt.ipoc.onps.model.entity.CommonNode;

import java.util.List;

public interface KPathTrafficRouteAlgorithm {
    /**
     * 计算K条路由 其中K条路由存在限制
     * @param links
     * @param nodes
     * @param source
     * @param destination
     * @param layer
     * @param rate
     * @param k
     * @return
     */
    List<List<BasicLink>> find (List<BasicLink> links, List<CommonNode> nodes, CommonNode source, CommonNode destination, String layer, double rate, int k) ;
}
