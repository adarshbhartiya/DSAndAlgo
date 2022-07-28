package com.spanningtree;

public class SpanningTreeMain {

    public static void main(String[] args)
    {
     int[] vertices = new int[4];
     Edge[] edges = new Edge[5];
     for(int i=0;i<4;i++)
     {
       vertices[i] = i;
     }
     edges[0] = new Edge(0,1,10);
     edges[1] = new Edge(0,2,6);
     edges[2] = new Edge(0,3,5);
     edges[3] = new Edge(1,3,15);
     edges[4] = new Edge(2,3,4);

     KruskalAlgorithm kruskalAlgorithm = new KruskalAlgorithm(4,5,vertices,edges);
     System.out.println(kruskalAlgorithm.findMinimumCostSpanningTree());


    }
}
