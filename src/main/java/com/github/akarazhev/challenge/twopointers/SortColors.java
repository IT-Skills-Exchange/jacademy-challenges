package com.github.akarazhev.challenge.twopointers;

public class SortColors {

    /**
     * Sorts an array of integers in-place, where all zeros are placed at the beginning,
     * all ones in the middle, and all twos at the end.
     *
     * @param colors the array of integers to be sorted
     * @return the sorted array of integers
     */
    public static int[] sortColors(int[] colors) {
        int start = 0;
        int current = 0;
        int end = colors.length - 1;
        int temp;
        while (current <= end) {
            if (colors[current] == 0) {
                if (colors[start] != 0) {
                    temp = colors[start];
                    colors[start] = colors[current];
                    colors[current] = temp;
                }

                current++;
                start++;
            } else if (colors[current] == 1) {
                current++;
            } else {
                temp = colors[current];
                colors[current] = colors[end];
                colors[end] = temp;
                end--;
            }
        }

        return colors;
    }
}
