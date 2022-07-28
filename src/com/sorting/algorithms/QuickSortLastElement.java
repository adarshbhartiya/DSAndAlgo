package com.sorting.algorithms;

public class QuickSortLastElement {


    public int[] sort(int[] arr)
    {
       int low = 0;
       int high = arr.length-1;

       quickSort(arr,low,high);

       return arr;
    }
    public void quickSort(int[] arr,int low,int high)
    {
        if(low<high)
        {
         int pi = partition(arr,low,high);
         quickSort(arr,low,pi-1);
         quickSort(arr,pi+1,high);
        }
    }
    public int partition(int[] arr,int low,int high)
    {
      int pivot = arr[high];
      int pi_index = low;
      for(int i=low;i<high;i++)
      {
        if(arr[i]<=pivot)
        {
           swap(arr,i,pi_index);
           pi_index++;
        }
      }
       swap(arr,pi_index,high);

       return pi_index;
    }

    public void swap(int[] arr,int i,int j)
    {
      int temp = arr[j];
      arr[j] = arr[i];
      arr[i] = temp;

    }
}

class QuickMainSolution
{
    public static void main(String[] args)
    {
        QuickSortLastElement quickSort = new QuickSortLastElement();
        int[] arr = {12,18,15,21,19,30,4,17};
        int[] res = quickSort.sort(arr);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");

    }
}