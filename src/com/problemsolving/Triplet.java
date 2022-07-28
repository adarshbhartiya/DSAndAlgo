package com.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Triplet {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List> arr = new HashSet<>();
        int n = nums.length;
        if (nums.length <= 2)
            return res;
        else {
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i++)
            {
                int start = i+1;
                int end = n-1;
                while(start<end)
                {
                 int sum = nums[start]+nums[end];
                 int totalSum = sum+nums[i];
                 if(totalSum > 0)
                     end--;
                 else if(totalSum < 0)
                     start++;
                 else
                 {
                     List<Integer> temp = Arrays.asList(nums[i],nums[start],nums[end]);
                     Collections.sort(temp);
                     if(!arr.contains(temp))
                     arr.add(temp);
                     start++;
                     end--;
                 }
                }
            }
            arr.stream().forEach(x -> res.add(x));
            return res;
        }

    }
}

class TripletMain
{
   public static void main(String[] args)
   {
       Triplet tr = new Triplet();
       int[] arr = {-4,-1,-1,0,1,2};
       tr.threeSum(arr);
   }

}