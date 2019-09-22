package cn.edu.bupt.ipoc.onps.base.algrithm.traverse;

import java.util.List;

public abstract class TraverseAlgorithm {
    public static final class Adjacency{
        protected int index;
        protected int weigth = 0;
        protected Adjacency nextAdjacency;
        protected boolean inStack = false;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getWeigth() {
            return weigth;
        }

        public void setWeigth(int weigth) {
            this.weigth = weigth;
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

        public Adjacency andWeight(int weigth) {
            this.weigth = weigth;
            return this;
        }
        public Adjacency andNextAdjacency(Adjacency nextAdjacency) {
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
