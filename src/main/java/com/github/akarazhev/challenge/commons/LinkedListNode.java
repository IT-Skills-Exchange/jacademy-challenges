package com.github.akarazhev.challenge.commons;

public class LinkedListNode {
    public int data;
    public LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
        next = null;
    }

    /**
     * Converts the linked list starting from the current node to a string representation.
     *
     * @return a string representation of the linked list starting from the current node,
     * with each node's data separated by "->"
     */
    public String asList() {
        StringBuilder list = new StringBuilder();
        list.append(data);
        LinkedListNode node = next;
        while (node != null) {
            list.append("->").append(node.data);
            node = node.next;
        }

        return list.toString();
    }
}
