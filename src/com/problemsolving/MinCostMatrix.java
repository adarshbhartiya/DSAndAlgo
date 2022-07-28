package com.problemsolving;

public class MinCostMatrix {

    public int minCostMatrix(int[][] arr,int m, int n)
    {
      if(m<0 || n<0)
          return Integer.MAX_VALUE;
      if(m == 0 && n == 0)
          return arr[m][n];
      return arr[m][n]+ min(minCostMatrix(arr,m-1,n),minCostMatrix(arr,m,n-1),minCostMatrix(arr,m-1,n-1));
    }
    public int min(int x,int y,int z)
{
    if(x<=y)
        return x<z?x:z;
    else
        return y<z?y:z;

}
}


class MinCostMain
{
   public static void main(String[] args)
   {
      int[][] arr = {{1,2,3},{4,8,2},{1,5,3}};
      MinCostMatrix minCost = new MinCostMatrix();
      System.out.println(minCost.minCostMatrix(arr,2,2));
   }

}
