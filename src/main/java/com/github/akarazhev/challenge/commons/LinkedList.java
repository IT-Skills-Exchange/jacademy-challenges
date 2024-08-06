package com.github.akarazhev.challenge.commons;

public class LinkedList {
    public LinkedListNode head;

    // constructor will be used to make a LinkedList type object
    public LinkedList() {
        head = null;
    }

    // insertNodeAtHead method will insert a LinkedListNode at head
    // of a linked list.
    public void insertNodeAtHead(LinkedListNode node) {
        if (head != null) {
            node.next = head;
        } else {
            head = node;
        }
    }

    // createLinkedList method will create the linked list using the
    // given integer array with the help of InsertAtHead method.
    public void createLinkedList(int[] list) {
        for (int i = list.length - 1; i >= 0; i--) {
            insertNodeAtHead(new LinkedListNode(list[i]));
        }
    }

    // returns the node at the specified position(index) of the linked list
    public LinkedListNode getNode(LinkedListNode head, int pos) {
        LinkedListNode ptr = head;
        if (pos != -1) {
            int p = 0;
            while (p < pos) {
                ptr = ptr.next;
                p += 1;
            }

            return ptr;
        }

        return ptr;
    }

    // returns the number of nodes in the linked list
    public int getLength(LinkedListNode head) {
        LinkedListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}
