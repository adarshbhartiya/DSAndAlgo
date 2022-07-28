package com.problemsolving;

public class Knapsack01 {


    public int findMaximumWeight(int[] val, int[] weight, int W) {
        int n = val.length;
        int[][] dp = new int[n][W + 1];
        for (int j = 0; j < W + 1; j++) {
            if (j < weight[0])
                dp[0][j] = 0;
            else
                dp[0][j] = val[0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (j < weight[i])
                    dp[i][j] = dp[i - 1][j];
                else if (weight[i] == j)
                    dp[i][j] = max(val[i], dp[i - 1][j]);
                else {
                    dp[i][j] = max(dp[i-1][j],val[i]+dp[i-1][j-weight[i]]);
                }
            }
        }
        return dp[n-1][W];
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }

}
class KnapsackMain
{
  public static void main(String[] args)
  {
    Knapsack01 ks = new Knapsack01();
    int[] weights = {10,20,30};
    int[] value = {60,100,120};
    int W = 50;
    System.out.println(ks.findMaximumWeight(value,weights,W));
  }
}
