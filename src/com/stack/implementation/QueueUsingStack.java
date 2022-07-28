package com.stack.implementation;
import java.util.*;

/**
 *  This class implements queue using two stack data structure.
 *
 * 1.Enqueue operation is costly as it takes O(n) time.
 * 2.Dequeue operation is done at O(1) time.
 *
 */

public class QueueUsingStack {


    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();



    public void push(int element)
    {
     if(stack1.isEmpty())
         stack1.push(element);
     else
     {
        stack1.stream().forEach(x -> {
            stack2.push(x);
        });
        stack1.push(element);
        stack2.stream().forEach(x -> stack1.push(x));
     }
    }

    public int pop()
    {
        if(!stack1.isEmpty())
            return stack1.pop();
        else
            return -1;
    }
}
class Main
{

    public static void main(String[] args)
    {
     QueueUsingStack queueUsingStack = new QueueUsingStack();
        queueUsingStack.push(1);
        queueUsingStack.push(2);
     queueUsingStack.push(4);
     System.out.println(queueUsingStack.pop());



    }
}