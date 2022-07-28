package com.problemsolving;

public class Power {
    public double myPow(double x, int n) {
        int val = Math.abs(n);
        double res = calculateValue(x,val);
        if(n>=0)
          return res;
        else
        {
         if(val% 2 == 0)
             return (1/res);
         else
             return(-1/res);
        }
    }

    public double calculateValue(double x,int val)
    {
        if(x == 0)
            return 1.0;
        if(val == 1)
            return x;
        if(val%2 == 0)
            return calculateValue(x,val/2)*calculateValue(x,val/2);
        else
            return x*calculateValue(x,(val-1));
    }
}
class PowerMain
{

    public static void main(String[] args)
    {
        Power p = new Power();
        System.out.println(p.myPow(2,3));

    }

}