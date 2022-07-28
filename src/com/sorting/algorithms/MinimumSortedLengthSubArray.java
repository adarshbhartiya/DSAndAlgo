package com.sorting.algorithms;

public class MinimumSortedLengthSubArray {

    public void minimumSortedlength(int[] arr) {
        if (arr != null) {
            //find the start index of the unsorted part
            int start = -1;
            int end = -1;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    start = i;
                    break;
                }
            }
            for (int j = arr.length - 1; j >= 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    end = j;
                    break;
                }
            }
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = start; i <= end; i++) {
                if (arr[i] <= min)
                    min = arr[i];
                if (arr[i] >= max)
                    max = arr[i];
            }
            int e1 = -1;
            int e2 = -1;
            boolean flag1 = false;
            boolean flag2 = false;
            for (int i = 0; i <= start; i++) {
                if (arr[i] >= min) {
                    System.out.println("Start Index"+i);
                    break;
                }
            }
            for (int i = end + 1; i < arr.length; i++) {
                if (arr[i] <= max) {
                    System.out.println("End Index"+i);
                    break;
                }
            }
        }


    }
}
class SolutionMinimumMain
    {
        public static void main(String[] args)
        {
            int[] arr = {10,12,20,30,25,40,32,31,35,50,60};
            MinimumSortedLengthSubArray minimumSortedLengthSubArray = new MinimumSortedLengthSubArray();
            minimumSortedLengthSubArray.minimumSortedlength(arr);
        }
            }

