package com.problemsolving;

public class CutRod {

    public int maxValue(int[] price,int n)
    {
        int len = price.length;
        int[][] dp = new int[len+1][n+1];

        for(int j=0;j<n+1;j++)
        {
            dp[0][j]=0;
        }
        for(int i=0;i<len+1;i++)
        {
            dp[i][0]=0;
        }

        for(int j=1;j<n+1;j++)
            dp[1][j] = price[0]*j;

        for(int i=2;i<len+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(j<i)
                    dp[i][j] = dp[i-1][j];
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],price[i-1]+dp[i][j-i]);
                }
            }
        }

        return dp[len][n];
    }
}

class CutRodMain
{
  public static void main(String[] args)
  {
     int[] price = {3,5,8,9,10,17,17,20};
     CutRod cr = new CutRod();
     System.out.println(cr.maxValue(price,8));
  }

}
