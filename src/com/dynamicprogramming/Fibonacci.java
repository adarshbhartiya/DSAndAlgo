package com.dynamicprogramming;

public class Fibonacci {

    public static void main(String[] args)
    {
      int max = Integer.MAX_VALUE;
      Long[] arr = new Long[51];
      for(int i=0;i<arr.length;i++)
          arr[i]= Long.valueOf(-1);
      System.out.println(findFibonacci(50,arr));
    }

    public static long findFibonacci(int num,Long[] arr)
    {
        if(arr[num]!=-1)
            return arr[num];
        if(num<=1)
            return num;
        arr[num]= findFibonacci(num-1,arr)+findFibonacci(num-2,arr);
        return arr[num];
    }
}
