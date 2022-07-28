package com.problemsolving;

public class LIS {


    public int findLIS(int n,int[] arr)
    {
        if(n == 1)
            return 1;
        else
        {
         if(arr[n-1]>arr[n-2])
             return 1+findLIS(n-1,arr);
         else
          return  findLIS(n-1,arr);
        }

    }

}

class LisMain
{

public static void main(String[] args)
{
   LIS li = new LIS();
   int[] arr = {50,3,10,7,40,80};
   System.out.println(li.findLIS(6,arr));

}
}


