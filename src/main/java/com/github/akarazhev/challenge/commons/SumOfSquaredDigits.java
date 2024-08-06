package com.github.akarazhev.challenge.commons;

public class SumOfSquaredDigits {

    /**
     * Calculates the sum of the squares of the digits of a given number.
     *
     * @param number the number whose digits are to be squared and summed
     * @return the sum of the squares of the digits of the given number
     */
    public static int sumOfSquaredDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, 2);
            number = number / 10;
        }

        return sum;
    }
}
