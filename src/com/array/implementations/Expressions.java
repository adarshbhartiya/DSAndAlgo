package com.array.implementations;


/**
 *  24(7+3)8
 */
public class Expressions {

    public String minimizeResult(String expression) {

        String[] arr = expression.split("\\+");
        int len1 = arr[0].length();
        int len2 = arr[1].length();
        int min = Integer.MAX_VALUE;
        int index1 = len1-1;
        int index2 = 0;
        String res="";
        while(index1>=0 && index2<len2)
        {
         String s1 = arr[0].substring(index1);
         String s2 = arr[1].substring(0,index2+1);
         String res1 = arr[0].substring(0,index1);
         String res2 = "";
         int val1=1;
         int val2=1;
         if(res1.isEmpty())
                val1=1;
         else
             val1 = Integer.parseInt(res1);
         if((index2+1)!=len2) {
             res2 = arr[1].substring(index2 + 1);
             val2 = Integer.parseInt(res2);
         }
         else {
             res2 = "";
             val2 = 1;
         }
         int sum1 = Integer.parseInt(s1)+Integer.parseInt(s2);

         int sum = val1*sum1*val2;
         if(sum<min)
         {
           min =sum;
           res = res1+"("+s1+"+"+s2+")"+res2;
         }
        index1--;
        index2++;
        }

        while(index1>=0)
        {
            String s1 = arr[0].substring(index1);
            String res1 = arr[0].substring(0,index1);
            if(res1.isEmpty())
                res1="1";
            int sum = Integer.parseInt(res1)*(Integer.parseInt(s1)+Integer.parseInt(arr[1]));
            if(sum<min)
            {
                min =sum;
                res = res1+"("+s1+"+"+arr[1]+")";
            }

          index1--;
        }

        while(index2<len2)
        {
            String s2 = arr[1].substring(0,index2+1);
            String res2="";
            if((index2+1)!=len2)
            res2 = arr[1].substring(index2+1);
            else
            res2 = "1";
            int sum = (Integer.parseInt(arr[0])+Integer.parseInt(s2))*Integer.parseInt(res2);
            if(sum<min)
            {
                min =sum;
                res = "("+arr[0]+"+"+s2+")"+res2;
            }

          index2++;
        }


        return res;
    }
}
class ExpressionMain
{
    public static void main(String[] args)
    {
      Expressions exp = new Expressions();
      System.out.println(exp.minimizeResult("999+999"));
    }


}