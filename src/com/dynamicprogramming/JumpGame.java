package com.dynamicprogramming;
import java.util.*;

public class JumpGame {

    public static void main(String[] args)
    {
        JumpGame jg = new JumpGame();
        int[] nums = {2,3,1,1,4};
        System.out.println(jg.jump(nums));
    }

    public int jump(int[] nums) {

            int len = nums.length;
            int start = nums[0];
            if(len == 1 || start == 0)
                return 0;
            int distance = len-1;
            if(start>=distance)
                return 1;
            return findJump(distance,nums,0);
        }
        public int findJump(int distance,int[] nums,int pos)
        {
            if(nums[pos] == 0)
                return 0;
            if(pos >= nums.length-1)
                return 0;
            int steps = nums[pos];
            int minJump = Integer.MAX_VALUE;
            while(steps>0)
            {
                int val = 1+findJump(distance-steps,nums,pos+steps);
                if(val<minJump)
                    minJump = val;
                steps--;
            }

            return minJump;
        }

    }

