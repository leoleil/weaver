package cn.edu.bupt.ipoc.onps.base.algrithm.traverse;


import cn.edu.bupt.ipoc.onps.base.algrithm.traverse.TraverseAlgorithm.Adjacency;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class DFSAlgorithmTest {
    @Test
    public void test(){
        List<Adjacency> adjacencyList = new ArrayList<>();
        Adjacency next = null;
        Adjacency adjacency0 = TraverseAlgorithm.createAdjacency()
                .andIndex(0)
                .andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(1));
        adjacency0.getNextAdjacency().andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(2));
        Adjacency adjacency1 = TraverseAlgorithm.createAdjacency()
                .andIndex(1)
                .andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(0));
        next = adjacency1.getNextAdjacency();
        next.andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(3));
        next = next.getNextAdjacency();
        next.andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(4));
        Adjacency adjacency2 = TraverseAlgorithm.createAdjacency()
                .andIndex(2)
                .andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(0));
        next = adjacency2.getNextAdjacency();
        next.andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(5));
        next = next.getNextAdjacency();
        next.andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(6));
        Adjacency adjacency3 = TraverseAlgorithm.createAdjacency()
                .andIndex(3)
                .andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(1));
        adjacency3.getNextAdjacency().andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(7));
        Adjacency adjacency4 = TraverseAlgorithm.createAdjacency()
                .andIndex(4)
                .andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(1));
        adjacency4.getNextAdjacency().andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(7));
        Adjacency adjacency5 = TraverseAlgorithm.createAdjacency()
                .andIndex(5)
                .andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(2));
        adjacency5.getNextAdjacency().andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(6));
        Adjacency adjacency6 = TraverseAlgorithm.createAdjacency()
                .andIndex(6)
                .andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(2));
        adjacency6.getNextAdjacency().andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(5));
        Adjacency adjacency7 = TraverseAlgorithm.createAdjacency()
                .andIndex(7)
                .andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(3));
        adjacency7.getNextAdjacency().andNextAdjacency(TraverseAlgorithm.createAdjacency().andIndex(4));
        adjacencyList.add(adjacency0);
        adjacencyList.add(adjacency1);
        adjacencyList.add(adjacency2);
        adjacencyList.add(adjacency3);
        adjacencyList.add(adjacency4);
        adjacencyList.add(adjacency5);
        adjacencyList.add(adjacency6);
        adjacencyList.add(adjacency7);
        List<List<Integer>> route = DFSAlgorithm.getInstance().search(adjacencyList,7,5);
        return;

    }



}