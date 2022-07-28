package com.sorting.algorithms;

public class InsertionSort {

    public int[] sort(int[] arr)
    {
      if(arr == null)
          return null;
      else
      {
       for(int i=1;i<=arr.length-1;i++)
       {
           for(int j=i;j>0;j--)
           {
               if(arr[j] < arr[j-1])
               {
                 int temp = arr[j];
                 arr[j] = arr[j-1];
                 arr[j-1] = temp;
               }
           }
       }
      }
      return arr;

    }

    public void printArr(int[] arr)
    {
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }



}
class InsertionSortMain
{
    public static void main(String[] args)
    {
        int[] arr = {64,11,1,12,25};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        insertionSort.printArr(arr);
    }
}
