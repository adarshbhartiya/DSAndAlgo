package com.linkedlist.implementation;

/**
This class implements the single linked list data structure.
The following implementations has been done on the single linked list.

1.Insert Node After
2.Insert Node Before
3.Insert Node After A Given Specific Node
4.Delete a given node.
5.Delete a node at a given position

 */

public class LinkedList {

    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void addElementsAfter(int data)
    {
       Node new_node = new Node(data);
      if(isEmpty()) {
          head = new_node;
      }
       else {
           Node last_node = head;
           while(last_node.next != null)
           {
               last_node = last_node.next;
           }
           last_node.next = new_node;
       }
    }

    public void addElementsBefore(int data)
    {
       Node new_node = new Node(data);
        if (head == null)
            head = new_node;
        else {
            Node temp = head;
            new_node.next = temp;
            head = new_node;
        }
    }

    public void addElementAfterSpecificNode(int data, int key)
    {
        if(head == null)
          return;
      else
      {
       Node new_node = new Node(data);
       Node temp = head;
       while(temp.data != key)
       {
           temp = temp.next;
       }
       Node after=temp.next;
       temp.next = new_node;
       new_node.next = after;
      }
    }
    public void deleteNode(int data)
    {
       if(isEmpty())
         return;
       else if(head.data == data)
           head = head.next;
       else
       {
           Node temp = head;
           Node prev = null;
           while(temp!=null && temp.data!=data) {
               prev = temp;
               temp = temp.next;
           }
           if(temp == null)
               return;
           prev.next = temp.next;
       }

    }
    public void deleteNodeAtPos(int pos) {
        if (pos == 0)
            head = head.next;
        else
        {
          Node temp= head;
          int i=0;
          while(i!=pos)
          {
           temp = temp.next;
           i++;
          }
          deleteNode(temp.data);
        }
    }
    public void printLinkedList()
    {
        Node temp =head;
        while(temp.next != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }
    public boolean isEmpty()
    {
        if (head == null)
            return true;
        else
            return false;
    }
    class Node{

        int data;
        Node next;
        public Node(int d)
        {
           this.data = d;
           next = null;
        }
    }
}
class LinkedListMain
{
    public static void main(String[] args)
    {
     LinkedList linkedList = new LinkedList();
     linkedList.addElementsBefore(10);
     linkedList.addElementsBefore(12);
     linkedList.addElementsBefore(14);
     linkedList.addElementsBefore(18);
     linkedList.addElementsBefore(20);
     linkedList.addElementsBefore(5);
     linkedList.addElementAfterSpecificNode(15,18);
     linkedList.printLinkedList();
     linkedList.deleteNode(5);
     linkedList.deleteNodeAtPos(5);
     linkedList.printLinkedList();
    }
}