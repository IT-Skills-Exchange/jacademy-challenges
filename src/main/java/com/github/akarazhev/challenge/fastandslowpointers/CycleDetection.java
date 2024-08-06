package com.github.akarazhev.challenge.fastandslowpointers;

import com.github.akarazhev.challenge.commons.LinkedListNode;

public class CycleDetection {

    /**
     * Detects if a cycle exists in a linked list.
     *
     * @param head the head of the linked list
     * @return true if a cycle exists, false otherwise
     */
    public static boolean detectCycle(LinkedListNode head) {
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
