# Fast and Slow Pointers

## Happy Number

### Statement

Write an algorithm to determine if a number n is a happy number.

We use the following process to check if a given number is a happy number:

- Starting with the given number n, replace the number with the sum of the squares of its digits.
- Repeat the process until:
    - The number equals 1, which will depict that the given number n is a happy number.
    - It enters a cycle, which will depict that the given number n is not a happy number.

Return TRUE if n is a happy number, and FALSE if not.

#### Constraints

- 1 ≤ n ≤ 2^31 - 1

### Solution

The solution is here: [HappyNumber.java](../src/main/java/com/github/akarazhev/challenge/fastandslowpointers/HappyNumber.java "HappyNumber.java").
Tests are here: [HappyNumberTest.java](../src/test/java/com/github/akarazhev/challenge/fastandslowpointers/HappyNumberTest.java "HappyNumberTest.java").

### Complexity

#### Time complexity

To estimate the count of numbers in a cycle, let’s consider the following two cases:

1. Numbers with three digits: The largest three-digit number is 999. The sum of the squares of its digits is 243.
   Therefore, the time complexity in this case is given as O(243 * 3), where 243 is the maximum count of numbers in a cycle
   and 3 is the number of digits in a three-digit number. This is why the time complexity in the case of numbers with
   three digits comes out to be O(1).
2. Numbers with more than three digits: Any number with more than three digits will lose at least one digit at
   every step until it becomes a three-digit number. For example, the first four-digit number that we can get in the cycle is
   1053, which is the sum of the square of the digits in 9999999999999. Therefore, the time complexity of any number with
   more than three digits can be expressed as O(log n + log log n + log log log n + ...). Since O(log n) is the
   dominating term, we can write the time complexity as O(log n).

Therefore, the total time complexity comes out to be O(1 + log n), which is O(log n).

#### Space complexity

The space complexity for this algorithm is O(1).

## Linked List Cycle

### Statement

Check whether or not a linked list contains a cycle. If a cycle exists, return TRUE. Otherwise, return FALSE. 
The cycle means that at least one node can be reached again by traversing the next pointer.

#### Constraints

Let n be the number of nodes in a linked list.

- 0 <= n <= 500
- -10^5 <= Node.data <= 10^5

### Solution

The solution is here: [CycleDetection.java](../src/main/java/com/github/akarazhev/challenge/fastandslowpointers/CycleDetection.java "CycleDetection.java").
Tests are here: [CycleDetectionTest.java](../src/test/java/com/github/akarazhev/challenge/fastandslowpointers/CycleDetectionTest.java "CycleDetectionTest.java").

### Complexity

#### Time complexity

The time complexity of the algorithm is O(n), where n is the number of nodes in the linked list.

#### Space complexity

The space complexity of the algorithm above is O(1).

## Middle of the Linked List

### Statement

Given the head of a singly linked list, return the middle node of the linked list. If the number of nodes in the linked 
list is even, there will be two middle nodes, so return the second one.

#### Constraints

Let n be the number of nodes in a linked list.

- 1 <= n <= 100
- 1 <= node.data <= 100
- head != NULL

### Solution

The solution is here: [MiddleNode.java](../src/main/java/com/github/akarazhev/challenge/fastandslowpointers/MiddleNode.java "MiddleNode.java").
Tests are here: [MiddleNodeTest.java](../src/test/java/com/github/akarazhev/challenge/fastandslowpointers/MiddleNodeTest.java "MiddleNodeTest.java").

### Complexity

#### Time complexity

The time complexity of the solution above is O(n), where n is the number of nodes in the linked list.

#### Space complexity

The space complexity of this solution is constant, that is, O(1).

## Circular Array Loop

### Statement

We are given a circular array of non-zero integers, nums, where each integer represents the number of steps to be 
taken either forward or backward from its current index. Positive values indicate forward movement, while negative 
values imply backward movement. When reaching either end of the array, the traversal wraps around to the opposite end.

The input array may contain a cycle, which is a sequence of indexes characterized by the following:

- The sequence starts and ends at the same index.
- The length of the sequence is at least two.
- The loop must be in a single direction, forward or backward.

>> Note: A cycle in the array does not have to originate at the beginning. It may begin from any point in the array.

Your task is to determine if nums has a cycle. Return TRUE if there is a cycle. Otherwise return FALSE.

#### Constraints

- 1 <= nums.length <= 10^3
- -10^5 <= nums[i] <= 5000
- nums[i] != 0

### Solution

The solution is here: [ArrayLoopDetection.java](../src/main/java/com/github/akarazhev/challenge/fastandslowpointers/ArrayLoopDetection.java "ArrayLoopDetection.java").
Tests are here: [ArrayLoopDetectionTest.java](../src/test/java/com/github/akarazhev/challenge/fastandslowpointers/ArrayLoopDetectionTest.java "ArrayLoopDetectionTest.java").

### Complexity

#### Time complexity

The outer loop iterates through each element in the input array, contributing O(n) to the time complexity. Within this 
loop, there is a while loop that may iterate up to O(n) times in the worst case. This is because it advances pointers
until a cycle is detected or the end of the array is reached. Therefore, in the worst-case scenario, where the while
loop iterates through the entire array to detect a cycle, the total time complexity of this solution becomes O(n^2).

#### Space complexity

We are not using any extra space in this algorithm. Therefore, the space complexity of the provided solution is O(1).

<hr>

Go to [README](../README.md "README.me")