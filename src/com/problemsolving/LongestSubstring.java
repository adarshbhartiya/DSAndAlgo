package com.problemsolving;
import java.util.*;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s)
    {
        int len = s.length();
        if(len == 0)
            return 0;
        if(len == 1)
            return 1;

        int start =0;
        int end = 0;
        int max = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        int i=0;
        while(i<len)
        {
          if(!set.contains(s.charAt(i)))
          {
            set.add(s.charAt(i));
            end = i;
            i++;
          }
          else
          {
            int size = end-start+1;
            if(size>max)
                max=size;
            start=start+1;
            i=start;
            end=start;
            set.clear();
          }
        }

        return max;



    }

}

class LongestSubMain
{
 public static void main(String[] args)
 {
     LongestSubstring ls = new LongestSubstring();
     System.out.println(ls.lengthOfLongestSubstring("au"));
 }

}
