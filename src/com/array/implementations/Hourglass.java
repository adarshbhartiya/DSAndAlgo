package com.array.implementations;
import java.util.*;

public class Hourglass {

    public static void main(String[] args)
    {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1,1,1,0,0,0));
        list.add(Arrays.asList(0,1,0,0,0,0));
        list.add(Arrays.asList(1,1,1,0,0,0));
        list.add(Arrays.asList(0,0,2,4,4,0));
        list.add(Arrays.asList(0,0,0,2,0,0));
        list.add(Arrays.asList(0,0,1,2,4,0));

        hourglassSum(list);
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int maximumSum = Integer.MIN_VALUE;
        for(int i=0;i<4;i++)
        {
            int sum=0;
            int k=0;
            int count=0;
            int j=0;
            while(j<6)
            {
                sum = sum+arr.get(i).get(j);
                count++;
                k=j;
                if(count==3)
                {
                    sum = sum+arr.get(i+1).get(k-1);
                    sum = sum+arr.get(i+2).get(k)+arr.get(i+2).get(k-1)+arr.get(i+2).get(k-2);
                    if(sum>maximumSum)
                        maximumSum=sum;
                    System.out.println(sum);
                    sum = 0;
                    j =j-2;
                    count=0;
                }
                j++;
            }
        }
        return maximumSum;
    }
}

