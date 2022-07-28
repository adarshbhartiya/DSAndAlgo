package com.problemsolving;
import java.util.*;
import java.util.stream.Collectors;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if (len == 0)
            return;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> duplicate = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for(int i=0;i<len;i++)
            duplicate.add(nums[i]);

        calculateAllPermutations(list,duplicate,temp);



    }

    private void calculateAllPermutations(List<List<Integer>> list, List<Integer> duplicate, List<Integer> temp) {

        if(duplicate.isEmpty())
            list.add(temp);
        for(Integer val:duplicate)
        {
          List<Integer> newList = duplicate.stream().filter(x->x!=val).collect(Collectors.toList());
          temp.add(val);
          calculateAllPermutations(list,newList,temp);
          temp.remove(val);
        }
    }
}

class NPMain
{

    public static void main(String[] args)
    {
      NextPermutation np = new NextPermutation();
      int[] arr = {1,2,3};
      np.nextPermutation(arr);

    }

}