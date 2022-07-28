package com.problemsolving;
import java.util.*;

public class CombinationSum {


    public List<List<Integer>> calculateCombination(int[] nums,int target)
    {
        List<List<Integer>> flist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        calculateCombination(nums,flist,list,0,target);
        System.out.println(flist);
        return flist;
    }
    public void calculateCombination(int[] nums,List<List<Integer>> flist,List<Integer> list,int index,int target)
        {
            if(target == 0) {
                flist.add(new ArrayList<>(list));
                return;
            }
            for(int i=index;i<nums.length;i++)
            {
                if(target>=0)
                {
                    list.add(nums[i]);
                    calculateCombination(nums,flist,list,index,target-nums[i]);
                    list.remove(list.size()-1);
                }
            }
        }


}
class CombinationMain {
    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();
        int[] arr = {2, 3, 6, 7};
        cs.calculateCombination(arr, 7);


    }
}


