package com.dynamicprogramming;

/**
 *
 *
 */
public class CanConstruct {

    public static void main(String[] args)
    {
      String[] arr = {"abc","cd","ab","def","xyz"};
      String target = "xyz";
      int count = 0;
      System.out.println(canConstruct(target,arr,count));
    }
    private static int canConstruct(String target, String[] arr,int count) {
        if(target.isEmpty())
            count = count+1;
        for(int i=0;i<arr.length;i++)
        {
          String temp = arr[i];
          int len = temp.length();
          if(len == 0)
              continue;
          String sub = (len > target.length())?"":target.substring(0,len);
          if(sub.equals(temp))
          {
           String newTarget = target.substring(len);
           count = canConstruct(newTarget,arr,count);
          }
        }
        return count;
    }
}
