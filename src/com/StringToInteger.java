package com;

public class StringToInteger {

    public static void main(String[] args) {
        String s = "-91283472332";
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int len = s.length();
        if(len == 0)
            System.exit(0);
        s = s.trim();
        String[] arr = s.split(" ");
        String word = arr[0];
        char ch = word.charAt(0);
        if(ch == '-' || ch == '+')
            word = word.substring(1);
        int count = -1;
        for(int i=0;i<word.length();i++)
        {
          char c = word.charAt(i);
          if(c == 48)
            count++;
          else
              break;
        }
        word = word.substring(count+1);
        int res=0;
        long exp = (long)Math.pow(10,word.length()-1);
        int pow = exp<max ?(int)Math.pow(10,word.length()-1):0;
        if(pow == 0)
        {
           if(ch == '-')
               System.out.println(min);
           else
               System.out.println(max);
        }
        for(int i=0;i<word.length();i++)
        {
          char c = word.charAt(i);
          int val = c-48;
          if(res>max || (res == (max/10) && val > 7)) {
              res = max;
              break;
          }
          res = res+val*pow;
          pow = pow/10;
        }

        if(ch == '-')
        {
          if(res == max)
              res = min;
          else
              res = -res;
        }

        System.out.println(res);



    }
}
