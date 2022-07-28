package com.sorting.algorithms;

/**
 * This class is to implement the selection sort algorithm.
 * Time complexity of selection sort is O(n^2)
 * Also selection sort even in the worst case does not make more than O(n) swap.
 * Good in cases where memory management is costly.
 *
 */
public class SelectionSort {

    public int[] sort(int[] arr)
    {
      if(arr == null && arr.length == 0)
          return null;
      else
      {
        int len = arr.length;
        for(int i =0; i <len-1; i++)
        {
            int min_idx = i;

            for(int j = i+1; j<len; j++)
            {
                if(arr[j] < arr[min_idx])
                    min_idx = j;

            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
      }
      return arr;
    }
}

class SelectionSortMain
{
   public static void main(String[] args)
   {
       int[] arr = {};

       SelectionSort selectionSort = new SelectionSort();
       int[] res = selectionSort.sort(arr);
       for(int i =0;i<res.length;i++)
           System.out.print(res[i]+" ");


   }

}


