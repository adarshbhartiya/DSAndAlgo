package com.problemsolving;

public class CoinChangeProblem {


    public int findNumberOfWays(int[] coin,int sum)
    {
     int len  = coin.length;
     int[][] dynamic = new int[len][sum+1];

        /**
         *   Intially for all the value of j=0 the dynamic array value will be 1 as becuase there is only one possibility
         *   of forming the sum as zero that is 1.
         */

     for(int i=0;i<len;i++)
         dynamic[i][0] = 1;

     for(int j=1;j<sum+1;j++)
     {
         if(j % coin[0] == 0)
             dynamic[0][j] = 1;

     }


     for(int i=1;i<len;i++)
     {
         for(int j=1;j<sum+1;j++)
         {
            if(j >= coin[i])
                dynamic[i][j] = dynamic[i-1][j] + dynamic[i][j-coin[i]];
            else
                dynamic[i][j] = dynamic[i-1][j];
         }
     }


    return dynamic[len-1][sum];


    }
}

class CoinChange
{

 public static void main(String[] args)
 {
     int[] arr = {1,2,3};
     int N =4;

     CoinChangeProblem coinChangeProblem = new CoinChangeProblem();
     System.out.println(coinChangeProblem.findNumberOfWays(arr,N));
 }

}