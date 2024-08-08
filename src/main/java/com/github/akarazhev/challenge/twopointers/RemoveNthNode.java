package com.github.akarazhev.challenge.twopointers;

import com.github.akarazhev.challenge.commons.LinkedListNode;

public class RemoveNthNode {

    /**
     * Removes the nth node from the end of a linked list.
     *
     * @param  head	the head of the linked list
     * @param  n		the position of the node to remove from the end
     * @return         	the head of the modified linked list
     */
    public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {
        LinkedListNode right = head;
        LinkedListNode left = head;

        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        if (right == null) {
            return head != null ? head.next : null;
        }

        while (right.next != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;
        return head;
    }
}
