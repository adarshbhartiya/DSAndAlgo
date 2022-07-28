package com.dynamicprogramming;

import java.util.HashMap;

public class GridTraveller {

    public static void main(String[] args)
    {

     HashMap<String,Long> map = new HashMap<>();
     System.out.println(numberOfWays(18,18,map));
    }

    public static long numberOfWays(int row,int column,HashMap<String,Long> map)
    {
        if(row == 0 || column == 0)
         return 0;
        if(row == 1 || column == 1)
         return 1;
        String key = row+","+column;
        if(map.containsKey(key))
            return map.get(key);
         map.put(key,numberOfWays(row-1,column,map)+numberOfWays(row,column-1,map));
         return map.get(key);

    }
}
