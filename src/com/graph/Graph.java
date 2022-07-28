package com.graph;
import java.util.*;
public class Graph {

    private ArrayList<ArrayList<Integer>> graph;
    int vertices;
    public Graph(int V)
    {
      this.vertices = V;
      graph = new ArrayList<>();
      for(int i=0;i<V;i++)
      {
        ArrayList<Integer> temp = new ArrayList<>();
        graph.add(temp);
      }
    }
    public void addEdge(int u, int v)
    {
       graph.get(u).add(v);
       graph.get(v).add(u);
    }

    public void breadthTraversal(int start)
    {
     Queue<Integer> queue = new ArrayDeque<>();
     queue.add(start);
     System.out.print(start+" ");
     boolean[] flag = new boolean[this.vertices];

     for(int i =0;i<this.vertices;i++)
         flag[i] = false;
     flag[start] = true;
     while(!queue.isEmpty())
     {
       ArrayList<Integer> temp = graph.get(queue.poll());
       for(Integer val:temp)
       {
           if(!flag[val])
           {
               System.out.print(val+" ");
               flag[val] = true;
               queue.add(val);
           }
       }

     }
    }
}
