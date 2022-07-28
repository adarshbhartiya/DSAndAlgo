package com.problemsolving;

/**
 * This program is to find the longest common subsequence in the given two Strings.
 */
public class LCS {

    public int findLCS(String s1,String s2) {

        int l1 = s1.length();
        int l2 = s2.length();

        int[][] lcs=new int[l1+1][l2+1];


        for(int i=0;i<=l1;i++)
        {
          for(int j=0;j<=l2;j++)
          {
            if(i==0 || j==0)
                lcs[i][j] = 0;
            else{
               if(s1.charAt(i-1) == s2.charAt(j-1))
               {
                   lcs[i][j] = 1+lcs[i-1][j-1];
               }
               else
               {
                   lcs[i][j] = findMax(lcs[i-1][j],lcs[i][j-1]);
               }
            }
          }

        }
    return lcs[l1][l2];
    }

    public int findMax(int a ,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }

}

class LCSMain {
    public static void main(String[] args) {
        LCS lcs = new LCS();
        String s1 = "sunday";
        String s2 = "saturday";
        int common = lcs.findLCS(s1,s2);
        int minimum = (s1.length() >= s2.length()) ? (s1.length()-common):(s2.length()-common);
        System.out.println(minimum);
    }
}
