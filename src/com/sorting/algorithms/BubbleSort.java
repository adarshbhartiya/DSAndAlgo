package com.sorting.algorithms;

/**
 *
 * This program implements bubble sort algorithm.
 * Time complexity = O(n^2)
 */
public class BubbleSort {


    public int[] sort(int[] arr)
    {
      if(arr == null)
          return null;
      else
      {
        for(int i=0;i<arr.length-1;i++)
        {
            boolean swapped = false;
            for(int j=0; j < arr.length-1-i; j++)
            {
                if(arr[j] >= arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            printArr(arr);

            if(!swapped)
                break;
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
class BubbleSortMain
{
    public static void main(String[] args)
    {
        int[] arr = {64,11,1,12,25};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);

    }
}