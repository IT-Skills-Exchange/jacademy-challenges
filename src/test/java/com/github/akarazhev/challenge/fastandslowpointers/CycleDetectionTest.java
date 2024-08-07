package com.github.akarazhev.challenge.fastandslowpointers;

import com.github.akarazhev.challenge.commons.LinkedList;
import com.github.akarazhev.challenge.commons.LinkedListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Cycle detection test")
public class CycleDetectionTest {

    @Test
    @DisplayName("Test detect cycle in {2, 4, 6, 8, 10, 12}")
    void testDetectCycleIn24681012() {
        LinkedList list = new LinkedList();
        list.createLinkedList(new int[]{2, 4, 6, 8, 10, 12});

        int length = list.getLength(list.head);
        LinkedListNode lastNode = list.getNode(list.head, length - 1);
        lastNode.next = list.getNode(list.head, 0);

        assertTrue(CycleDetection.detectCycle(list.head));
    }

    @Test
    @DisplayName("Test detect cycle in {1, 3, 5, 7, 9, 11}")
    void testDetectCycleIn1357911() {
        LinkedList list = new LinkedList();
        list.createLinkedList(new int[]{1, 3, 5, 7, 9, 11});

        assertFalse(CycleDetection.detectCycle(list.head));
    }

    @Test
    @DisplayName("Test detect cycle in {0, 1, 2, 3, 4, 6}")
    void testDetectCycleIn012346() {
        LinkedList list = new LinkedList();
        list.createLinkedList(new int[]{0, 1, 2, 3, 4, 6});

        int length = list.getLength(list.head);
        LinkedListNode lastNode = list.getNode(list.head, length - 1);
        lastNode.next = list.getNode(list.head, 1);

        assertTrue(CycleDetection.detectCycle(list.head));
    }

    @Test
    @DisplayName("Test detect cycle in {3, 4, 7, 9, 11, 17}")
    void testDetectCycleIn34791117() {
        LinkedList list = new LinkedList();
        list.createLinkedList(new int[]{3, 4, 7, 9, 11, 17});

        assertFalse(CycleDetection.detectCycle(list.head));
    }

    @Test
    @DisplayName("Test detect cycle in {5, 1, 4, 9, 2, 3}")
    void testDetectCycleIn514923() {
        LinkedList list = new LinkedList();
        list.createLinkedList(new int[]{5, 1, 4, 9, 2, 3});

        int length = list.getLength(list.head);
        LinkedListNode lastNode = list.getNode(list.head, length - 1);
        lastNode.next = list.getNode(list.head, 2);

        assertTrue(CycleDetection.detectCycle(list.head));
    }
}
