package com.luxoft.test;
import java.util.*;

/**
 *  input - abcabcabcxyz
 *  output -
 */
public class Sample {

    public static void main(String[] args) {
       String str="#abcd#23$$$";
       int len = str.length();
       HashMap<Character,Integer> map = new HashMap<>();
       for(int i=0;i<str.length();i++)
       {
          char ch = str.charAt(i);
          int ascii =(int)ch;
          if(ascii<65 || ascii>90 || ascii<97 || ascii>122)
          {
            if(!map.containsKey(ch))
                map.put(ch,1);
            else
                map.put(ch,map.get(ch)+1);
          }

       }
       int max = Integer.MIN_VALUE;
       for(Map.Entry<Character,Integer> entry:map.entrySet())
       {
         int val = entry.getValue();
         if(val>max)
             max=val;
       }
       System.out.println(max);


    }
}