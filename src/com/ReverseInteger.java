package com;

public class ReverseInteger {

    public static void main(String[] args)
    {
        int x = 1534236469;
        long reverse = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        boolean flag = true;

        if(x < 0)
            flag = false;

        int num = Math.abs(x);
        while(num>0)
        {
            int mod = num%10;
            reverse = (reverse*10)+mod;
            num = num/10;
            if(reverse < min || reverse > max)
            {
                reverse = 0;
                break;
            }

        }

        if(!flag)
            reverse = -reverse;

        System.out.println(reverse);
    }


}

