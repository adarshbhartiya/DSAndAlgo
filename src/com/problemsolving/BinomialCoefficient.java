package com.problemsolving;

public class BinomialCoefficient {


    public int findCoefficient(int n,int k)
    {
      if(k==0 || n == 0)
          return 0;
      else
      return (factorial(n))/(factorial(n-k)*factorial(k));
    }

    public int factorial(int n)
    {
      if(n == 1)
          return 1;
      else
          return n * factorial(n-1);
    }

}

class BinomialMain
{

  public static void main(String[] args)
  {
      BinomialCoefficient bcof = new BinomialCoefficient();
      System.out.println(bcof.findCoefficient(4,2));
  }
}
