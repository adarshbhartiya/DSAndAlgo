package com.array.implementations;

/**
  this program is to implement array rearranging such that a[i]=i and if the element is not present in the given
  array consisting of of 0 to N-1 elements then that positions shoudl be filled with -1.

 */
public class RearrangeArray {

    public int[] rearrange(int[] arr)
    {
      int[] res = new int[arr.length];
      for(int i=0; i<arr.length;i++)
      {
          if(arr[i]!=-1)
          {
          res[arr[i]]=arr[i];
          }
      }
      for(int i=0; i<arr.length;i++)
      {
          if(res[i]==0)
              res[i]=-1;
      }
     return res;
    }
}

class RearrangeMain
{
    public static void main(String[] args)
    {
     int[] arr = {-1,-1,6,1,9,3,2,-1,4,-1};
        RearrangeArray rearrangeMain = new RearrangeArray();
     int[] res = rearrangeMain.rearrange(arr);
     for(int i=0;i<res.length;i++)
     {
         System.out.print(res[i]+" ");
     }

    }

}

