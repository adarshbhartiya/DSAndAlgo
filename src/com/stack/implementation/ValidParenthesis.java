package com.stack.implementation;
import java.util.*;


public class ValidParenthesis {
    
    public boolean isValid(String s)
    {
      Stack<Character> stack = new Stack<Character>();  
      int i=0;
      while(i < s.length())
      {
        char  c = s.charAt(i);
        if(c == '(' || c == '{' || c == '[')
            stack.push(c);
        else if(c == ')' && stack.peek() == '(')
          stack.pop();
        else if(c == '}' && stack.peek() == '{')
            stack.pop();
        else if(c == ']' && stack.peek() == '[')
            stack.pop();
        i++;
      }

      if(stack.isEmpty())
          return true;
      else
          return false;
    }
}
class ValidMain
{
 public static void main(String[] args)
 {
     ValidParenthesis valid = new ValidParenthesis();
     System.out.println(valid.isValid("{(()[]{})"));
 }

}