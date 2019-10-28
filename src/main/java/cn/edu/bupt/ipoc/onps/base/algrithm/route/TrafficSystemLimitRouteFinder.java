package cn.edu.bupt.ipoc.onps.base.algrithm.route;

import cn.edu.bupt.ipoc.onps.base.algrithm.KPathTrafficRouteAlgorithm;
import cn.edu.bupt.ipoc.onps.base.algrithm.TrafficRouteAlgorithm;
import cn.edu.bupt.ipoc.onps.base.algrithm.traverse.DFSAlgorithm;
import cn.edu.bupt.ipoc.onps.base.algrithm.traverse.TraverseAlgorithm;
import cn.edu.bupt.ipoc.onps.base.algrithm.traverse.TraverseAlgorithm.Adjacency;
import cn.edu.bupt.ipoc.onps.model.Limit;
import cn.edu.bupt.ipoc.onps.model.entity.System;
import cn.edu.bupt.ipoc.onps.model.entity.BasicLink;
import cn.edu.bupt.ipoc.onps.model.entity.CommonNode;
import cn.edu.bupt.ipoc.onps.model.entity.Traffic;
import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;
import cn.edu.bupt.ipoc.onps.utils.StrategyString;

import java.util.*;

public class TrafficSystemLimitRouteFinder implements TrafficRouteAlgorithm, KPathTrafficRouteAlgorithm {
    private String strategy = StrategyString.BALANCE;//策略
    private double resourceReservation = 0.2;//资源预留
    private int hopLimit = 16;//跳数限制

    public List<BasicLink> find (Set<BasicLink> links, Set<CommonNode> nodes, CommonNode origin, CommonNode destination, String type, Set<Limit> limits) {
        //如果在同一个系统中，单系统内算路
        //如果不在同一个系统中，使用深度优先算路，选取跨系统最少的路
        List<Adjacency> adjacencyList = new ArrayList<>();//邻接数组
        Map<CommonNode,Integer> nodeIntegerMap = new HashMap<>();//节点坐标字典
        Map<Integer,CommonNode> integerCommonNodeMap = new HashMap<>();
        //初始化邻接表
        Iterator<CommonNode> commonNodeIterator =  nodes.iterator();
        Integer index = 0;
        while (commonNodeIterator.hasNext()){
            CommonNode node = commonNodeIterator.next();
            nodeIntegerMap.put(node,index);
            integerCommonNodeMap.put(index,node);
            Adjacency adjacency = TraverseAlgorithm.createAdjacency();
            adjacencyList.add(adjacency);
            index ++;
        }

        //根据策略构建邻接表
        for(BasicLink link: links){
            if(!link.getStatus().equals(LinkStatusString.FAULT) && link.getFree()>0){
                CommonNode formNode = link.getFromNode();
                CommonNode toNode = link.getToNode();
                int index0 = nodeIntegerMap.get(formNode);
                int index1 = nodeIntegerMap.get(toNode);
                Adjacency adjacency0 = TraverseAlgorithm.createAdjacency()
                        .andIndex(index1)
                        .andWeight(weightOf(link));
                adjacencyList.get(index0).andNextAdjacency(adjacency0);
                Adjacency adjacency1 = TraverseAlgorithm.createAdjacency()
                        .andIndex(index0)
                        .andWeight(weightOf(link));
                adjacencyList.get(index1).andNextAdjacency(adjacency1);
            }
        }
        int ori = nodeIntegerMap.get(origin);
        int des = nodeIntegerMap.get(destination);
        //全部路由
        List<List<Integer>> allPath = DFSAlgorithm.getInstance().search(adjacencyList,ori,des);
        //找跨系统最少的路
        int[] indexMap = new int[allPath.size()];
        Set<Integer> minSysIndexSet = new HashSet<>();
        //List<int[]> array = new ArrayList<>();
        //找到跨系统数量
        for(int i = 0 ; i< allPath.size() ; i++){
            indexMap[i] = 0;
            for(Limit limit:limits){
                List<Integer> path = allPath.get(i);
                System system = (System) limit;
                for(int j = 0; j<path.size()-1 ; j++){
                    CommonNode from = integerCommonNodeMap.get(path.get(j));
                    CommonNode to = integerCommonNodeMap.get(path.get(j+1));
                    if(system.inTheSomeSystem(from,to))
                        indexMap[i]++;
                }

            }
        }
        //找到跨系统最少的线路集合
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<indexMap.length ;i++){
            min = indexMap[i] < min ? indexMap[i]:min;
        }
        for(int i = 0; i<indexMap.length ;i++){
            if(indexMap[i] == min){
                minSysIndexSet.add(i);
            }
        }
        //在跨系统最少的情况下找权值最小的路
        Iterator iterator = minSysIndexSet.iterator();
        double minWeight = Double.MAX_VALUE;
        List<BasicLink> res = new ArrayList<>();
        while (iterator.hasNext()){
            List<Integer> path = allPath.get((Integer) iterator.next());
            for(int i = 0; i<path.size()-1 ; i++){
                CommonNode from = integerCommonNodeMap.get(path.get(i));
                CommonNode to = integerCommonNodeMap.get(path.get(i+1));
                List<BasicLink> route = new ArrayList<>();
                Double weight = 0.0;
                for (BasicLink link:
                links) {
                    if(link.getFromNode().equals(from) && link.getToNode().equals(to)){
                        route.add(link);
                        weight += weightOf(link);
                    }
                    if(link.getFromNode().equals(to) && link.getToNode().equals(from)){
                        weight += weightOf(link);
                        route.add(link);
                    }
                }
                res = minWeight>weight ? route:res;
                minWeight = minWeight>weight ? weight:minWeight;
            }
        }
        return res;
    }

    public List<List<BasicLink>> find(Set<BasicLink> links, Set<CommonNode> nodes, Traffic traffic, String layer, double rate, int k, Set<Limit> systems) {
        return null;
    }
    //根据链路选定的策略，计算链路的权值，有可能返回最大值，有溢出风险
    private double weightOf(BasicLink link){
        switch (strategy){
            case StrategyString.BALANCE:
                double free = (double) link.getFree() * 0.1;
                if(free <=0 ) return Double.MAX_VALUE;//注意有溢出风险
                double length = link.getLength();
                double weight = length/free;
                return weight;
            case StrategyString.HOP:
                return 1.0;
            case StrategyString.LENGTH:
                return link.getLength();
            default:
                return 0;
        }
    }
}
