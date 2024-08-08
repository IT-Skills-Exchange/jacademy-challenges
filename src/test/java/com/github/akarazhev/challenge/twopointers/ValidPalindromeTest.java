package com.github.akarazhev.challenge.twopointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Valid palindrome test")
public class ValidPalindromeTest {

    @Test
    @DisplayName("Test is palindrome")
    void testIsPalindrome() {
        assertTrue(ValidPalindrome.isPalindrome("kayak"));
        assertFalse(ValidPalindrome.isPalindrome("hello"));
        assertFalse(ValidPalindrome.isPalindrome("RACEACAR"));
        assertTrue(ValidPalindrome.isPalindrome("A"));
        assertFalse(ValidPalindrome.isPalindrome("ABCDABCD"));
    }

    @Test
    @DisplayName("Test is palindrome with pointers")
    void testIsPalindromeWithPointers() {
        assertTrue(ValidPalindrome.isPalindromeWithPointers("kayak"));
        assertFalse(ValidPalindrome.isPalindromeWithPointers("hello"));
        assertFalse(ValidPalindrome.isPalindromeWithPointers("RACEACAR"));
        assertTrue(ValidPalindrome.isPalindromeWithPointers("A"));
        assertFalse(ValidPalindrome.isPalindromeWithPointers("ABCDABCD"));
    }
}
