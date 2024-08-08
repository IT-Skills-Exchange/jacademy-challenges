package com.github.akarazhev.challenge.fastandslowpointers;

public class ArrayLoopDetection {

    /**
     * Determines if there is a circular loop in the given array.
     *
     * @param nums the array to check for a circular loop
     * @return true if there is a circular loop, false otherwise
     */
    public static boolean circularArrayLoop(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int slow = i, fast = i;
            boolean forward = nums[i] > 0;
            while (true) {
                slow = nextStep(slow, nums[slow], size);
                if (isNotCycle(nums, forward, slow))
                    break;

                fast = nextStep(fast, nums[fast], size);
                if (isNotCycle(nums, forward, fast))
                    break;

                fast = nextStep(fast, nums[fast], size);
                if (isNotCycle(nums, forward, fast))
                    break;

                if (slow == fast)
                    return true;
            }
        }

        return false;
    }

    /**
     * Calculates the next step in a circular array loop.
     *
     * @param pointer the current position in the array
     * @param value   the value to add to the current position
     * @param size    the size of the array
     * @return the next position in the array loop
     */
    private static int nextStep(int pointer, int value, int size) {
        int result = (pointer + value) % size;
        if (result < 0) {
            result += size;
        }

        return result;
    }

    /**
     * Checks if the current pointer position is not part of a cycle in the given array.
     *
     * @param nums          the array to check for cycles
     * @param prevDirection the direction of the previous pointer position
     * @param pointer       the current pointer position
     * @return true if the current position is not part of a cycle, false otherwise
     */
    private static boolean isNotCycle(int[] nums, boolean prevDirection, int pointer) {
        boolean currDirection = nums[pointer] >= 0;
        return prevDirection != currDirection || Math.abs(nums[pointer] % nums.length) == 0;
    }
}
