package com.stack.implementation;
import java.util.Stack;
public class SpecialStack {


    public int getMinimum(Stack<Integer> s1)
    {
        if(s1.isEmpty())
            System.exit(0);
        else
        {




        }


        return -1;
    }
}


class SpecialMain
{

public static void main(String[] args)
 {
     Stack<Integer> s1 = new Stack<>();
     s1.push(12);
     s1.push(20);
     s1.push(13);
     s1.push(15);
     s1.push(30);

     SpecialStack specialStack = new SpecialStack();
     System.out.println(specialStack.getMinimum(s1));
 }

}