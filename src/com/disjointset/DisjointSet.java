package com.disjointset;

public class DisjointSet {

    private int N;
    private int[] rank;
    private int[] arr;


    public DisjointSet(int N){

        this.N = N;
        this.rank = new int[N];
        this.arr = new int[N];
    }

    public int findParent(int p)
    {
        if(arr[p] == p)
            return p;
        findParent(arr[p]);
      return p;
    }

    public boolean isConnected(int a,int b)
    {
        return findParent(a) == findParent(b);

    }

    public void union(int a,int b)
    {
       int p1 = findParent(a);
       int p2 = findParent(b);

       if(p1 == p2)
           return;

       if(rank[p1] < rank[p2])
       {
         arr[p1] = arr[p2];
         rank[p2] = +rank[p1];
       }
       else if(rank[p2] < rank[p1])
       {
           arr[p2] = arr[p1];
           rank[p1] = +rank[p2];
       }

    }

}
