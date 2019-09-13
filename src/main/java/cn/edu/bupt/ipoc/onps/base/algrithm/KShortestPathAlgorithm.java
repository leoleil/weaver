package cn.edu.bupt.ipoc.onps.base.algrithm;

import java.util.List;

/**
 * 两点间的k条最短路算法
 * @author 陈雷雨
 * @since 2019/5/17
 */
public interface KShortestPathAlgorithm {
    List<List<Integer>> routeCalculation(int [][]adjacentMatrix, int origin, int destination);
}
