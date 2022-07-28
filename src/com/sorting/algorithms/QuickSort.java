package com.sorting.algorithms;

public class QuickSort {

    public int partition(int[] arr,int low,int high)
    {
      int pivot = arr[low];
      int i=low+1;

      for(int j=low+1; j<=high; j++)
      {
        if(arr[j]<= pivot)
        {
         swap(arr,i,j);
         i++;
        }
      }
      swap(arr,low,i-1);
      return i-1;
    }

      public void swap(int[] arr,int low, int high)
      {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
      }

      public void sort(int[] arr,int low,int high)
      {
      if(low<high)
      {
        int p = partition(arr,low,high);
        sort(arr,low,p-1);
        sort(arr,p+1,high);
      }
      }

    public void printArr(int[] arr)
    {
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

}
class QuickMain
{
    public static void main(String[] args)
    {
        int[] arr = {64,11,1,12,25};

        QuickSort quickMain = new QuickSort();
        quickMain.sort(arr,0,arr.length-1);
        quickMain.printArr(arr);
    }
}