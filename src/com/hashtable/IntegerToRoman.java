package com.hashtable;

import java.util.*;

public class IntegerToRoman {

    public static void main(String[] args)
    {
    String res = intToRoman(1994);
    System.out.println(res);
    }


public static String intToRoman(int num)
{
   Map<Integer,String> map = intializeMap();
   if(num == 0)
       return "0";
   String sb = findDivisor("",map,num);
   return sb;
}

public static String findDivisor(String res,Map<Integer,String> map,int num)
{
    int min = Integer.MAX_VALUE;
    int divisor = 1;
    if(num <= 0)
        return res;
    else
    {
        if(map.containsKey(num)) {
            res = res + map.get(num);
            num = 0;
           return findDivisor(res,map,num);
        }
        else {
            for(Map.Entry<Integer,String> entry:map.entrySet())
            {
                int val = entry.getKey();
                if(val <= num)
                {
                    int diff = Math.abs(num-val);
                    if(diff<=min) {
                        min = diff;
                        divisor = val;
                    }
                }
            }
            res = res + map.get(divisor);
            num = num - divisor;
            return findDivisor(res,map,num);

        }
    }



}

public static Map<Integer,String> intializeMap()
{
    Map<Integer,String> map = new LinkedHashMap<>();
   map.put(1,"I");
   map.put(5,"V");
   map.put(10,"X");
   map.put(50,"L");
   map.put(100,"C");
   map.put(500,"D");
   map.put(1000,"M");
   map.put(4,"IV");
   map.put(9,"IX");
   map.put(40,"XL");
   map.put(90,"XC");
   map.put(400,"CD");
   map.put(900,"CM");
   return map;



}

}
