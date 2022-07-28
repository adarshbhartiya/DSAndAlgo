package com.array.implementations;

public class ArrayRotation {

    public int[] rotate(int[] arr, int d)
    {
      int[] temp = new int[d];
      int[] newArray = new int[arr.length];
      int k=0;
      for(int i=d-1;i>=0;i--)
      {
          temp[k++] = arr[i];
      }

      for(int i=0;i<arr.length;i++)
      {
       if(i<arr.length-d) {
           newArray[i] = arr[i + d];
       }
       else
       {
          newArray[i]=temp[arr.length-i-1];
       }

      }

        return newArray;
    }




}

class ArrayRotationMain
{
   public static void main(String[] args)
   {
       int[] arr = {1,2,3,4,5,6,7};
       ArrayRotation arrayRotation = new ArrayRotation();
       int[] res=arrayRotation.rotate(arr,3);
       for(int x:res)
       {
        System.out.print(x+ " ");
       }
   }

}