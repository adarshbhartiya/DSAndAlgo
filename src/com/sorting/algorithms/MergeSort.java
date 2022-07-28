package com.sorting.algorithms;

public class MergeSort {


    public int[] mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
        return arr;
    }

    public void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i];
                i++;
            } else  {
                temp[k++] = arr[j];
                j++;
            }
        }
        while(i<=mid)
        {
          temp[k++] = arr[i];
          i++;
        }
        while(j<=end)
        {
            temp[k++] = arr[j];
            j++;
        }

        for(int x=start;x<=end;x++)
        {
          arr[x] = temp[x-start];
        }
    }
}

class MergeMain
{
    public static void main(String[] args)
    {
     MergeSort ms = new MergeSort();
     int[] arr = {64,11,1,12,25};
     int[] res= ms.mergeSort(arr,0,4);
     for(int i=0;i<res.length;i++)
         System.out.println(res[i]);

    }
}
