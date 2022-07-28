package com.problemsolving;

import java.util.Arrays;

public class MaximumIncreasingSumSubsequence {

    public int maxSumIS(int arr[], int n)
    {
        int[] LIS = new int[n];
        int[] ms = new int[n];

        for(int i=0;i<n;i++)
            ms[i] = arr[i];

        for(int i=0;i<n;i++)
            LIS[i] = 1;

        for(int i=1;i<n;i++)
        {
            int sum = 0;
            for(int j=0;j<i;j++)
            {
                if(arr[i] > arr[j] && ms[i] < arr[i]+ms[j])
                {
                    ms[i] = ms[j]+arr[i];
                }


            }

        }
        Arrays.sort(ms);
        return ms[n-1];

    }
}

class MaximumSumMain
{
   public static void main(String[] args)
   {
     int[] arr = {27,39,22,35,3,38,48,4,19};
     MaximumIncreasingSumSubsequence ms = new MaximumIncreasingSumSubsequence();
     System.out.println(ms.maxSumIS(arr,9));

   }

}
