package com.spanningtree;

import java.util.Arrays;

public class KruskalAlgorithm {
    private int V;
    private int E;
    private int[] vertices;
    private Edge[] edges;
    private int[] parent;


    public KruskalAlgorithm(int V, int E, int[] vertices, Edge[] edges) {
        this.V = V;
        this.E = E;
        this.vertices = vertices;
        this.edges = edges;
        this.parent = new int[V];
        for(int i =0;i<V;i++)
            this.parent[i] = -1;
    }

    public int findMinimumCostSpanningTree() {

        Arrays.sort(this.edges);
        int maxEdges = V-1;
        int count = 0;
        int totalWeight = 0;
        for(int i=0;i<E;i++)
        {
         Edge edge = edges[i];
         if(!detectCycle(edge)) {
             totalWeight = totalWeight + edge.getWeight();
             count++;
         }
           if(count == maxEdges)
               break;
        }


     return totalWeight;
    }

     public boolean detectCycle(Edge edge)
     {
       int src = edge.getSrc();
       int dest = edge.getDest();

       int p1 = findParent(parent,src);
       int p2 = findParent(parent,dest);

       if(p1 == p2)
           return true;
       else {
           parent[p1] = p2;
           return false;
       }
     }
     public int findParent(int[] parent,int i)
     {
       if(parent[i] == -1)
           return i;
       return findParent(parent,parent[i]);
     }
}

