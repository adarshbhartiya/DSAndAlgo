package com.array.implementations;

/** This program is to implement binary search.

1.Its assumed that the array is sorted.So choose the median first.
in case of n is even median = n/2 or n is odd median is median = n-1/2;

2.check whether the search key is greater than or less than median.

3.depending on the searched result iterate the steps 1 and 2 again.

*/

public class BinarySearchAlgorithm {


    public int search(int[] arr,int l,int r,int key)
    {
      int median= l+(r-l)/2;
      if(key == arr[median])
          return median;
      else if(key > arr[median])
         return search(arr,l=median+1,r,key);
      else if(key < arr[median])
          return search(arr,l,r=median-1,key);
      else
          return -1;
    }
}
class Main
{
public static void main(String[] args)
{
    BinarySearchAlgorithm binarySearchAlgorithm = new BinarySearchAlgorithm();
    int[] arr = {12,14,16,19,34,45,65,83,87};
    System.out.println(binarySearchAlgorithm.search(arr,0,arr.length-1,87));
}

}