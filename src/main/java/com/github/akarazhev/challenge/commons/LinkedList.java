package com.github.akarazhev.challenge.commons;

public class LinkedList {
    public LinkedListNode head;

    public LinkedList() {
        head = null;
    }

    /**
     * Inserts a new node at the head of the linked list.
     *
     * @param node the new node to be inserted
     */
    public void insertNodeAtHead(LinkedListNode node) {
        if (head != null) {
            node.next = head;
        } else {
            head = node;
        }
    }

    /**
     * Creates a linked list from the given array of integers.
     *
     * @param list the array of integers to create the linked list from
     */
    public void createLinkedList(int[] list) {
        for (int i = list.length - 1; i >= 0; i--) {
            insertNodeAtHead(new LinkedListNode(list[i]));
        }
    }

    /**
     * Returns the LinkedListNode at the specified position in the linked list starting from the given head.
     *
     * @param head the head of the linked list
     * @param pos  the position of the node to retrieve (0-indexed)
     * @return the LinkedListNode at the specified position, or null if pos is -1 or out of bounds
     */
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

    /**
     * Returns the length of a linked list starting from the given head node.
     *
     * @param head the head node of the linked list
     * @return the length of the linked list
     */
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
