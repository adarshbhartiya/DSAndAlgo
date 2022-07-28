package com.string.problems;

public class ZigZagConversion {

    public String convert(String s, int numRows) {

            int len = s.length();
            if(numRows == 1)
                return s;
            int columns = len/2;
            if(columns == 0)
                columns = 1;
            int rows = numRows;
            char[][] dp = new char[rows][columns];

            int k = 0;
            int pos = 0;
            for(int i=0;i<columns;i++)
            {
                for(int j=0;j<rows;j++)
                {
                    if((i == 0 || i%(numRows-1) == 0) && k!=len)
                    {
                        dp[j][i] = s.charAt(k);
                        k++;
                    }
                    else
                    {
                        int mod = pos%numRows;
                        if(j == (numRows-mod-1) && k!=len)
                        {
                            dp[j][i] = s.charAt(k);
                            k++;
                            break;
                        }
                    }
                }
                pos++;
                if((pos+1)%numRows == 0)
                    pos=0;
            }
            String res="";
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<columns;j++)
                {
                    if((int)dp[i][j] == 0)
                        continue;
                    else
                        res = res+dp[i][j];
                }
            }

            return res;
        }
    }

class ZigZagMain
{
public static void main(String[] args)
{
  ZigZagConversion zigZagConversion = new ZigZagConversion();
  zigZagConversion.convert("A",2);

}


}


