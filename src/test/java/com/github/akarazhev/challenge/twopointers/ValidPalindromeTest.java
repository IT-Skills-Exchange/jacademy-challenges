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
}
