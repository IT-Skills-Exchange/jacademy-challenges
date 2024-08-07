package com.github.akarazhev.challenge.fastandslowpointers;

import com.github.akarazhev.challenge.commons.LinkedListNode;

public class MiddleNode {

    /**
     * Finds the middle node of a linked list using the slow and fast pointer approach.
     *
     * @param head the head of the linked list
     * @return the middle node of the linked list
     */
    public static LinkedListNode middleNode(LinkedListNode head) {
        LinkedListNode slow = head;
        LinkedListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
