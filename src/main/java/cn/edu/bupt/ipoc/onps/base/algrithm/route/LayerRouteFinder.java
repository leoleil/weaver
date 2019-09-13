package cn.edu.bupt.ipoc.onps.base.algrithm.route;

import cn.edu.bupt.ipoc.onps.base.algrithm.LayerRouteAlgorithm;
import cn.edu.bupt.ipoc.onps.base.algrithm.sp.DijkstraAlgorithm;
import cn.edu.bupt.ipoc.onps.model.entity.BasicLink;
import cn.edu.bupt.ipoc.onps.model.entity.CommonNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LayerRouteFinder implements LayerRouteAlgorithm {
    private static final LayerRouteFinder INSTANCE = new LayerRouteFinder();
    private LayerRouteFinder(){}
    public static LayerRouteAlgorithm getInstance(){
        return INSTANCE;
    }
    /**
     * 层间路由算法
     * 考虑资源数量，两个节点间的距离，需要的带宽
     * @param links 链路
     * @param nodes 节点
     * @param layer 层级
     * @param rate  速率
     * @return 路由线路
     */
    @Override
    public List<BasicLink> find(List<BasicLink> links, List<CommonNode> nodes, CommonNode source, CommonNode destination, String layer, double rate){
        Map<CommonNode,Integer> nodeIntegerMap = new HashMap<>();//节点坐标字典
        int size = nodes.size();//矩阵大小
        int [][]adjacentMatrix = new int[size][size];//图矩阵
        int ori = 0;//起点
        int des = 0;//终点
        //寻找起点和终点的引用，并确定节点的坐标字典
        for(int i = 0; i< size; i++){
            if(nodes.get(i).equals(source))
                ori = i;
            if(nodes.get(i).equals(destination))
                des = i;
            nodeIntegerMap.put(nodes.get(i),i);
        }
        //初始化矩阵
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++){
                if(i == j)
                    adjacentMatrix[i][j] = 0;
                else
                    adjacentMatrix[i][j] = Integer.MAX_VALUE;
            }
        //设置矩阵
        for (BasicLink link:links
             ) {
            if(link.getFree() > 0 && rate < link.getRate()) {
                adjacentMatrix[nodeIntegerMap.get(link.getToNode())][nodeIntegerMap.get(link.getFromNode())] = (int) link.getLength() * 1000;
                adjacentMatrix[nodeIntegerMap.get(link.getFromNode())][nodeIntegerMap.get(link.getToNode())] = (int) link.getLength() * 1000;
            }
        }
        //算路
        List<Integer> route = DijkstraAlgorithm.getInstance().routeCalculation(adjacentMatrix,ori,des);
        if (route == null )return null;//没有路由
        //生成路由
        List<BasicLink> returnLink = new ArrayList<>();
        for(int i = 0;i<route.size()-1;i++){
            CommonNode from = nodes.get(route.get(i));
            CommonNode to = nodes.get(route.get(i+1));
            for(BasicLink link : links){
                if((link.getFromNode().equals(from) && link.getToNode().equals(to)) || (link.getFromNode().equals(to) && link.getToNode().equals(from))) {
                    returnLink.add(link);
                    break;
                }

            }
        }
        return returnLink;
    }
}
