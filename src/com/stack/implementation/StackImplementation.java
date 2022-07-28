package com.stack.implementation;

public class StackImplementation {

    private Node first = null;

    public void push(String item)
    {
        Node oldFirst = first;
        first = new Node();
        first.setItem(item);
        first.setNext(oldFirst);

    }
    public boolean isEmpty()
    {
      return (first == null);
    }

    public String pop() {
        String item = first.getItem();
        Node newFirst = first.getNext();
        first = newFirst;
        return item;
    }

}
