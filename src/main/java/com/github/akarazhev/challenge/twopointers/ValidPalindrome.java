package com.github.akarazhev.challenge.twopointers;

public class ValidPalindrome {

    /**
     * Checks if a given string is a palindrome.
     *
     * @param s the string to be checked
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
