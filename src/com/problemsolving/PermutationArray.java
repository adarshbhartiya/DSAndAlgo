package com.problemsolving;
import java.util.*;
import java.util.stream.Collectors;

public class PermutationArray {

    public void permutation(int[] nums)
    {
        int len = nums.length;
        if(len == 0)
            return;
        List<List<Integer>> list = new ArrayList<>();
        calculateAllPermutations(nums,0,list);
        printPermutations(list);
    }
    private void calculateAllPermutations(int[] nums, int curr,List<List<Integer>> list) {

        if(curr == nums.length-1)
          list.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        for(int i=curr;i<nums.length;i++)
        {
           swap(nums,i,curr);
           calculateAllPermutations(nums,curr+1,list);
           swap(nums,i,curr);
        }
    }
    private void printPermutations(List<List<Integer>> list)
    {
        list.forEach(obj -> {
            obj.forEach(val -> System.out.print(val+","));
            System.out.println();
        });


    }
    public void swap(int[] nums,int a,int b)
    {
      int temp = nums[a];
      nums[a] = nums[b];
      nums[b] = temp;
    }

}

class PermutationMain
{

public static void main(String[] args)
{
   PermutationArray pa = new PermutationArray();
   int[] nums = {1,2,3};
   pa.permutation(nums);

}

}