package com.dynamicprogramming;

public class EditDistance {

    public static void main(String[] args)
    {
      String word1 = "Horse";
      String word2 = "ros";

      System.out.println(minDistance(word1,word2));

    }
    public static int minDistance(String word1, String word2) {

        int len1 = word1.length();
        int len2 = word2.length();

        int minimum=0;
        int diff =0;
        String word="";
        int w2 = len2-1;
        int w1 = len1-1;
        if(len1>len2)
        {
            while(w1>=0 && w2>=0)
            {
                if(word1.charAt(w1)!=word2.charAt(w2))
                {
                    minimum++;
                    w1--;
                }
                else
                {
                    w2--;
                    word1 = word1.substring(0,w1);
                    w1--;

                }
            }
            minimum = minimum+w1+1;
        }
        else if(len1 == len2)
        {
            while(w1>=0)
            {
                if(word1.charAt(w1) != word2.charAt(w2))
                {
                    minimum++;
                    w1--;
                    w2--;
                }
            }
        }
        else
        {
            while(w1>=0 && w2>=0)
            {
                if(word1.charAt(w1)!=word2.charAt(w2))
                {
                    w2--;
                    minimum++;
                }
                else
                {
                    w1--;
                    if(w1 == 0)
                        word2 = word2.substring(0,w2);
                    w2--;
                }
            }

            minimum = minimum+w2+1;
        }


        return minimum;







    }
}
