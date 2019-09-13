package cn.edu.bupt.ipoc.onps.base.algrithm;

import cn.edu.bupt.ipoc.onps.model.entity.BasicLink;
import cn.edu.bupt.ipoc.onps.model.entity.CommonNode;

import java.util.List;

import static cn.edu.bupt.ipoc.onps.utils.LayerString.FIBER;

public interface LayerRouteAlgorithm {
    /**
     * 层间路由算法
     * @param links 链路
     * @param nodes 节点
     * @param layer 承载层级
     * @param rate 速率
     * @return 路由线路
     * @throws Exception
     */
    List<BasicLink> find (List<BasicLink> links, List<CommonNode> nodes, CommonNode source, CommonNode destination, String layer, double rate) ;
}
