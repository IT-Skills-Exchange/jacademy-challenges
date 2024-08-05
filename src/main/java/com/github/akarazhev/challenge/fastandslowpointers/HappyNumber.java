package com.github.akarazhev.challenge.fastandslowpointers;

public class HappyNumber {

    /**
     * Determines if a given number is a happy number. A happy number is a number that eventually reaches 1 when
     * repeatedly replacing it with the sum of the squares of its digits.
     *
     * @param n the number to check if it is a happy number
     * @return true if the number is a happy number, false otherwise
     */
    public static boolean isHappyNumber(int n) {
        int slow = n;
        int fast = SumOfSquaredDigits.sumOfSquaredDigits(n);
        while (fast != 1 && fast != slow) {
            slow = SumOfSquaredDigits.sumOfSquaredDigits(slow);
            fast = SumOfSquaredDigits.sumOfSquaredDigits(SumOfSquaredDigits.sumOfSquaredDigits(fast));
        }

        return fast == 1;
    }
}
