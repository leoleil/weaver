import cn.edu.bupt.ipoc.onps.base.algrithm.sp.DijkstraAlgorithm;
import org.junit.Test;

import java.util.List;

public class DijkstraAlgorithmTest {
    @Test
    public void dTest(){
        DijkstraAlgorithm d = DijkstraAlgorithm.getInstance();
        int[][] adjacentMatrix = {
                {0,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,0,1,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,1,1,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,1,0,1,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,1,0,1,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,1,0,1,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,1,0,1,Integer.MAX_VALUE,1},
                {Integer.MAX_VALUE,1,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,1,0,Integer.MAX_VALUE,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,1,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,0,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,1,Integer.MAX_VALUE,Integer.MAX_VALUE,0}
        };
        List<Integer> route = d.routeCalculation(adjacentMatrix,7,6);
        route = d.routeCalculation(adjacentMatrix,7,8);
        route = d.routeCalculation(adjacentMatrix,7,0);
        route = d.routeCalculation(adjacentMatrix,1,4);
        route = d.routeCalculation(adjacentMatrix,2,8);
        route = d.routeCalculation(adjacentMatrix,2,2);
    }
}
