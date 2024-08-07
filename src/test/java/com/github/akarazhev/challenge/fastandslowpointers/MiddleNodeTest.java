package com.github.akarazhev.challenge.fastandslowpointers;

import com.github.akarazhev.challenge.commons.LinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Middle node test")
public class MiddleNodeTest {

    @Test
    @DisplayName("Test middle node in {1, 2, 3, 4, 5}")
    void testMiddleNodeIn12345() {
        LinkedList list = new LinkedList();
        list.createLinkedList(new int[]{1, 2, 3, 4, 5});

        assertEquals(3, MiddleNode.middleNode(list.head).data);
    }

    @Test
    @DisplayName("Test middle node in {1, 2, 3, 4, 5, 6}")
    void testMiddleNodeIn123456() {
        LinkedList list = new LinkedList();
        list.createLinkedList(new int[]{1, 2, 3, 4, 5, 6});

        assertEquals(4, MiddleNode.middleNode(list.head).data);
    }

    @Test
    @DisplayName("Test middle node in {3, 2, 1}")
    void testMiddleNodeIn321() {
        LinkedList list = new LinkedList();
        list.createLinkedList(new int[]{3, 2, 1});

        assertEquals(2, MiddleNode.middleNode(list.head).data);
    }

    @Test
    @DisplayName("Test middle node in {10}")
    void testMiddleNodeIn10() {
        LinkedList list = new LinkedList();
        list.createLinkedList(new int[]{10});

        assertEquals(10, MiddleNode.middleNode(list.head).data);
    }

    @Test
    @DisplayName("Test middle node in {1, 2}")
    void testMiddleNodeIn12() {
        LinkedList list = new LinkedList();
        list.createLinkedList(new int[]{1, 2});

        assertEquals(2, MiddleNode.middleNode(list.head).data);
    }
}
