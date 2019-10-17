package cn.edu.bupt.ipoc.onps.base.algrithm.route;

import cn.edu.bupt.ipoc.onps.base.algrithm.KPathTrafficRouteAlgorithm;
import cn.edu.bupt.ipoc.onps.base.algrithm.TrafficRouteAlgorithm;
import cn.edu.bupt.ipoc.onps.base.algrithm.traverse.TraverseAlgorithm;
import cn.edu.bupt.ipoc.onps.base.algrithm.traverse.TraverseAlgorithm.Adjacency;
import cn.edu.bupt.ipoc.onps.model.Limit;
import cn.edu.bupt.ipoc.onps.model.entity.BasicLink;
import cn.edu.bupt.ipoc.onps.model.entity.CommonNode;
import cn.edu.bupt.ipoc.onps.model.entity.Traffic;

import java.util.*;

public class TrafficSystemLimitRouteFinder implements TrafficRouteAlgorithm, KPathTrafficRouteAlgorithm {


    @Override
    public List<BasicLink> find(List<BasicLink> links, List<CommonNode> nodes, Traffic traffic, String layer, String type, Set<Limit> limits) {
        //如果在同一个系统中，单系统内算路
        //如果不在同一个系统中，使用深度优先算路，选取跨系统最少的路
        List<Adjacency> adjacencyList = new ArrayList<>();
        Map<CommonNode,Integer> nodeIntegerMap = new HashMap<>();//节点坐标字典
        //初始化邻接表
        for(int i = 0; i < nodes.size(); i++){
            CommonNode node = nodes.get(i);
            nodeIntegerMap.put(node,i);
            Adjacency adjacency = TraverseAlgorithm.createAdjacency();
            adjacencyList.add(adjacency);
        }
        for(BasicLink link: links){
            CommonNode formNode = link.getFromNode();
            CommonNode toNode = link.getToNode();
            int index0 = nodeIntegerMap.get(formNode);
            int index1 = nodeIntegerMap.get(toNode);
            Adjacency adjacency0 = TraverseAlgorithm.createAdjacency().andIndex(index1).andWeight(link.getLength());
            adjacencyList.get(index0).andNextAdjacency(adjacency0);
            Adjacency adjacency1 = TraverseAlgorithm.createAdjacency().andIndex(index0).andWeight(link.getLength());
            adjacencyList.get(index1).andNextAdjacency(adjacency1);
        }


        return null;
    }

    @Override
    public List<List<BasicLink>> find(List<BasicLink> links, List<CommonNode> nodes, CommonNode source, CommonNode destination, String layer, double rate, int k) {
        return null;
    }
}
