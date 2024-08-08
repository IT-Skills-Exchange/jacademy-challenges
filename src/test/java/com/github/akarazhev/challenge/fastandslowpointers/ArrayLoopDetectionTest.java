package com.github.akarazhev.challenge.fastandslowpointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayLoopDetectionTest {

    @Test
    @DisplayName("Test circular array loop in {1, 3, -2, -4, 1}")
    void testCircularArrayLoopIn13minus2minus41() {
        assertTrue(ArrayLoopDetection.circularArrayLoop(new int[]{1, 3, -2, -4, 1}));
    }

    @Test
    @DisplayName("Test circular array loop in {2, 1, -1, -2}")
    void testCircularArrayLoopIn21minus1minus2() {
        assertFalse(ArrayLoopDetection.circularArrayLoop(new int[]{2, 1, -1, -2}));
    }

    @Test
    @DisplayName("Test circular array loop in {5, 4, -2, -1, 3}")
    void testCircularArrayLoopIn54minus2minus13() {
        assertFalse(ArrayLoopDetection.circularArrayLoop(new int[]{5, 4, -2, -1, 3}));
    }

    @Test
    @DisplayName("Test circular array loop in {1, 2, -3, 3, 4, 7, 1}")
    void testCircularArrayLoopIn12minus3minus34() {
        assertTrue(ArrayLoopDetection.circularArrayLoop(new int[]{1, 2, -3, 3, 4, 7, 1}));
    }

    @Test
    @DisplayName("Test circular array loop in {3, 3, 1, -1, 2}")
    void testCircularArrayLoopIn331minus12() {
        assertTrue(ArrayLoopDetection.circularArrayLoop(new int[]{3, 3, 1, -1, 2}));
    }
}
