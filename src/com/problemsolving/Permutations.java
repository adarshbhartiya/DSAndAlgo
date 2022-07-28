package com.problemsolving;
import java.util.*;

public class Permutations
{
   public String swap(String str, int i, int j)
   {
     char[] arr  = str.toCharArray();
     char first = arr[i];
     arr[i] = arr[j];
     arr[j] = first;
     return String.valueOf(arr);
   }


   public void permute(String txt,int l,int r)
   {
     if(l == r)
         System.out.println(txt);
     for(int i=l;i<=r;i++)
     {
       String str = swap(txt,l,i);
       permute(str,l+1,r);
     }

   }


}

class PermMain
{
    public static void main(String[] args)
    {
      Permutations pe = new Permutations();
      pe.permute("ABC",0,2);
    }
}