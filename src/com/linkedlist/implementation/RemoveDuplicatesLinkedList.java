package com.linkedlist.implementation;

import sun.awt.image.ImageWatched;

/**
 * This program removes the duplicated from the single linked list based on below condtions
 *
 * 1.The list should be traversed only once
 * 2.The list is in non - decreasing order.
 *
 *
 */
public class RemoveDuplicatesLinkedList {

    public void removeDuplicatesFromList(LinkedList linkedList) {
        if (linkedList != null) {
            LinkedList.Node temp = linkedList.getHead();
            while (temp.next != null) {
                if (temp.data == temp.next.data) {
                    linkedList.deleteNode(temp.data);

                }
                temp = temp.next;
            }
            linkedList.printLinkedList();
        }
    }
}

class RemoveDuplicatesMain
{

    public static void main(String[] args)
    {
        RemoveDuplicatesLinkedList removeDuplicatesLinkedList = new RemoveDuplicatesLinkedList();
        LinkedList linkedList = new LinkedList();
        linkedList.addElementsAfter(1);
        linkedList.addElementsAfter(1);
        linkedList.addElementsAfter(2);
        linkedList.addElementsAfter(3);
        linkedList.addElementsAfter(3);
        removeDuplicatesLinkedList.removeDuplicatesFromList(linkedList);


    }
}
