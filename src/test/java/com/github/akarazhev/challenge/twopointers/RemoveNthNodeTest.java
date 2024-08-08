package com.github.akarazhev.challenge.twopointers;

import com.github.akarazhev.challenge.commons.LinkedList;
import com.github.akarazhev.challenge.commons.LinkedListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Remove nth node test")
public class RemoveNthNodeTest {

    @Test
    @DisplayName("Test remove 1th last node")
    void testRemove1thLastNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        LinkedListNode node = RemoveNthNode.removeNthLastNode(linkedList.head, 1);
        assertNotNull(node);
        assertEquals("1->2->3->4->5->6->7->8", node.asList());
    }

    @Test
    @DisplayName("Test remove 2th last node")
    void testRemove2thLastNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{23, 28, 10, 5, 67, 39, 70, 28});
        LinkedListNode node = RemoveNthNode.removeNthLastNode(linkedList.head, 2);
        assertNotNull(node);
        assertEquals("23->28->10->5->67->39->28", node.asList());
    }

    @Test
    @DisplayName("Test remove 3th last node")
    void testRemove3thLastNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{34, 53, 6, 95, 38, 28, 17, 63, 16, 76});
        LinkedListNode node = RemoveNthNode.removeNthLastNode(linkedList.head, 3);
        assertNotNull(node);
        assertEquals("34->53->6->95->38->28->17->16->76", node.asList());
    }

    @Test
    @DisplayName("Test remove 4th last node")
    void testRemove4thLastNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{288, 224, 275, 390, 4, 383, 330, 60, 193});
        LinkedListNode node = RemoveNthNode.removeNthLastNode(linkedList.head, 4);
        assertNotNull(node);
        assertEquals("288->224->275->390->4->330->60->193", node.asList());
    }

    @Test
    @DisplayName("Test remove 6th last node")
    void testRemove6thLastNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{69, 8, 49, 106, 116, 112});
        LinkedListNode node = RemoveNthNode.removeNthLastNode(linkedList.head, 6);
        assertNotNull(node);
        assertEquals("8->49->106->116->112", node.asList());
    }
}
