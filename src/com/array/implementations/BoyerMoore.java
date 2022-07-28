package com.array.implementations;

public class BoyerMoore {

    public static void main(String[] args)
    {
        int[] nums = {7, 7, 5, 5, 5, 5, 5, 7 ,5, 5, 7, 7 , 5, 5, 5, 5};
        majorityElement(nums);

    }

    public static int majorityElement(int[] nums) {

        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
