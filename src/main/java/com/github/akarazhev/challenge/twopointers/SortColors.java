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
        int temp;
        int red = 0;
        int white = 0;
        int blue = colors.length - 1;
        while (white <= blue) {
            if (colors[white] == 0) {
                if (colors[red] != 0) {
                    temp = colors[white];
                    colors[white] = colors[red];
                    colors[red] = temp;
                }

                white++;
                red++;
            } else if (colors[white] == 1) {
                white++;
            } else {
                temp = colors[white];
                colors[white] = colors[blue];
                colors[blue] = temp;
                blue--;
            }
        }

        return colors;
    }
}
