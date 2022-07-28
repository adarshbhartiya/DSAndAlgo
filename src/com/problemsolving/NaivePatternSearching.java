package com.problemsolving;

public class NaivePatternSearching {

    public void findPattern(String txt, String pat) {
        int s1 = txt.length();
        int p1 = pat.length();

        for (int i = 0; i < s1 - p1 + 1;) {
            if (txt.substring(i, i + p1).equals(pat)) {
                System.out.println(i);
                i = i + p1;
            }
            else
                i++;
        }

    }
}
class NaivePatternMain
{

  public static void main(String[] args)
  {
      NaivePatternSearching nps = new NaivePatternSearching();
      nps.findPattern("AABAACAADAABAAABAA","AABA");
  }
}


