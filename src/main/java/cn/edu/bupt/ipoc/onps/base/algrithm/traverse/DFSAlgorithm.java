package cn.edu.bupt.ipoc.onps.base.algrithm.traverse;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSAlgorithm extends TraverseAlgorithm {
    private List<List<Integer>> routeList = new ArrayList<>();
    private boolean[] mack;
    private static final DFSAlgorithm  INSTANCE = new DFSAlgorithm();
    private DFSAlgorithm(){
        super();
    }

    public static DFSAlgorithm getInstance() {
        return INSTANCE;
    }

    @Override
    public List<List<Integer>> search(List<Adjacency> adjacencyList, int origin, int destination) {
        int[] route = new int[adjacencyList.size()];
        mack = new boolean[adjacencyList.size()];
        for(int i =0;i<route.length;i++){
            mack[i] = false;
            route[i]=-1;
        }
        dfs(origin,route,0,adjacencyList,destination);
        return routeList;
    }
    private void dfs(int index,int[] route,int count,List<Adjacency> adjacencyList,int stop){
        mack[index] = true;
        route[count++] = index;
        if(index == stop){
            int i = 0;
            List<Integer> r = new ArrayList<>();
            while(i<route.length){
                if(route[i] != -1)
                    r.add(route[i]);
                i++;
            }
            routeList.add(r);
            mack[index] = false;
            //route[index] = -1;
            return;
        }
        int nextIndex = index;
        Adjacency next = adjacencyList.get(nextIndex).nextAdjacency;
        while (next != null){
             nextIndex = next.index;
             if(!mack[nextIndex]){
                 dfs(nextIndex,route,count,adjacencyList,stop);
             }
             next = next.nextAdjacency;
        }
        mack[index] = false;
        route[count] = -1;
        return;
    }

}
