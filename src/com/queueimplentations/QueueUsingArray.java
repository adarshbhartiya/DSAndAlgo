package com.queueimplentations;

import com.stack.implementation.QueueUsingStack;

public class QueueUsingArray {

    private int[] arr;
    private int cursize;
    private int front,rear;

    public QueueUsingArray(int N)
    {
      arr = new int[N];
      cursize =0;
      front = rear = N-1;
    }

    public void enqueue(int data)
    {
      if(cursize == arr.length) {
          System.out.println("Queue is full");
          System.exit(0);
      }
      else
      {
       arr[rear--] = data;
       cursize++;
      }
    }
    public int dequeue()
    {
        int element=0;
        if(cursize == 0){
            System.out.println("Queue is empty");
            System.exit(0);
        }
        else
        {
           element = arr[front--];
           cursize--;
        }
        return element;
    }
}

class QueueMain
{

    public static void main(String[] args)
    {
        QueueUsingArray queueUsingArray = new QueueUsingArray(10);
        queueUsingArray.enqueue(3);
        queueUsingArray.enqueue(4);
        System.out.println(queueUsingArray.dequeue());
        queueUsingArray.enqueue(5);
        System.out.println(queueUsingArray.dequeue());
    }}

