package com.github.akarazhev.challenge.twopointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Valid Palindrome Test")
public class ValidPalindromeTest {

    @Test
    @DisplayName("Test Valid Palindrome")
    void testValidPalindrome() {
        assertTrue(ValidPalindrome.isPalindrome("kayak"));
        assertFalse(ValidPalindrome.isPalindrome("hello"));
        assertFalse(ValidPalindrome.isPalindrome("RACEACAR"));
        assertTrue(ValidPalindrome.isPalindrome("A"));
        assertFalse(ValidPalindrome.isPalindrome("ABCDABCD"));
    }

    @Test
    @DisplayName("Test Valid Palindrome With Pointers")
    void testValidPalindromeWithPointers() {
        assertTrue(ValidPalindrome.isPalindromeWithPointers("kayak"));
        assertFalse(ValidPalindrome.isPalindromeWithPointers("hello"));
        assertFalse(ValidPalindrome.isPalindromeWithPointers("RACEACAR"));
        assertTrue(ValidPalindrome.isPalindromeWithPointers("A"));
        assertFalse(ValidPalindrome.isPalindromeWithPointers("ABCDABCD"));
    }
}
