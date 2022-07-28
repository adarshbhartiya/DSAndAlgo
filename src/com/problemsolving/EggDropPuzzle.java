package com.problemsolving;

public class EggDropPuzzle {

    private int[][] memo = new int[100][10001];

    public EggDropPuzzle()
    {
       for(int i=0;i<100;i++)
       {
           for(int j=0;j<10001;j++)
               memo[i][j] = -1;
        }

    }

    public int eggDrop(int n,int k)
    {
     if(k == 1 || k == 0)
         return k;
     if(n == 1)
         return k;
     int val = Integer.MAX_VALUE;

     if(memo[n][k]!=-1)
         return memo[n][k];

     for(int i=1;i<=k;i++)
     {
       int res = 1+Math.max(eggDrop(n-1,i-1),eggDrop(n,k-i));
         if(res <= val)
             val = res;
     }
     memo[n][k] = val;
     return val;
    }
}

class EggDropMain
{
  public static void main(String[] args)
  {
    EggDropPuzzle egp = new EggDropPuzzle();
    System.out.println(egp.eggDrop(5,10000));
  }

}
