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

    /**
     * Checks if a given string is a palindrome using two pointers technique.
     *
     * @param s the string to be checked
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindromeWithPointers(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
