package cn.edu.bupt.ipoc.onps.base.algrithm;

import java.util.List;

/**
 * 两点间最短路算法
 * @author 陈雷雨
 * @since 2019/3/17
 */
public interface ShortestPathAlgorithm {
    /**
     * 路由计算
     * @param adjacentMatrix 整个图的邻接矩阵
     * @param origin 起点
     * @param destination 终点
     * @return 路由的数组
     */
     List<Integer> routeCalculation(int [][]adjacentMatrix, int origin, int destination);
}
