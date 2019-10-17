package cn.edu.bupt.ipoc.onps.base.algrithm.traverse;

import java.util.List;

public abstract class TraverseAlgorithm {
    //邻接矩阵
    public static final class Adjacency{
        protected int index;
        protected double weight = 0;
        protected Adjacency nextAdjacency;
        protected boolean inStack = false;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public Adjacency getNextAdjacency() {
            return nextAdjacency;
        }

        public void setNextAdjacency(Adjacency nextAdjacency) {
            this.nextAdjacency = nextAdjacency;
        }

        public boolean isInStack() {
            return inStack;
        }

        public void setInStack(boolean inStack) {
            this.inStack = inStack;
        }

        public Adjacency andIndex(int index) {
            this.index = index;
            return this;
        }

        public Adjacency andWeight(double weight) {
            this.weight = weight;
            return this;
        }
        //添加邻接表，头插入
        public Adjacency andNextAdjacency(Adjacency nextAdjacency) {
            nextAdjacency.andNextAdjacency(this.nextAdjacency);
            this.nextAdjacency = nextAdjacency;
            return this;
        }
        public Adjacency andInStack(boolean inStack) {
            this.inStack = inStack;
            return this;
        }

    }
    public static Adjacency createAdjacency(){
        return new Adjacency();
    }
    public abstract List<List<Integer>> search(List<Adjacency>adjacencyList,int origin,int destination);
}
