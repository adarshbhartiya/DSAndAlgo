package com.array.implementations;

/**
   This algorithm works as the steps below.
   1.Divide the array into two parts,one with [0,d-1] and [d,n]
   2.Reverse the first array.
   3.Reverse the second array
   4.Reverse the entire array.

 */
public class ReversalAlgorithm {

    public int[] leftRotate(int[] arr,int d, int n)
     {
     if(d == 0)
         return new int[0];
     else
     {
      reverse(arr,0,d-1);
      reverse(arr,d,n-1);

      reverse(arr,0,n-1);
     }
     return arr;
     }


    public void reverse(int[] arr,int start,int end)
    {
       while(start < end)
       {
       int temp = arr[start];
       arr[start]=arr[end];
       arr[end]=temp;
       start++;
       end--;
       }
    }
}

class ReversalMain
{
public static void main(String[] args)
{
    int[] arr ={1,2,3,4,5,6,7};
    int d =3;
    int n=7;
    ReversalAlgorithm reversalAlgorithm = new ReversalAlgorithm();
    reversalAlgorithm.leftRotate(arr,d,n);
    for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+ " ");
}


}