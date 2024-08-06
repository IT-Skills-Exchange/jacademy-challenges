# JAcademy Challenges

## Two Pointers & Co.

This module groups together three of the most common patterns that may be used to solve problems where the input data
is linear: Two Pointers, Fast and Slow Pointers, and Modified Binary Search. Both the Two Pointers and the Modified
Binary Search patterns derive their power from their ability to efficiently reduce the size of the search space, that is,
both exemplify the divide-and-conquer approach to problem-solving. The Fast and Slow Pointers pattern may be considered
a variant of the Two Pointers pattern, where the two pointers move at different speeds in order to traverse the input
list in a way that solves the given problem. After completing this module, we will have learned how to use this set of
related patterns to solve a diverse range of problems.

**Objectives**:
- Hands-on experience with using the Two Pointers pattern
- A working knowledge of the Fast and Slow Pointers pattern
- Hands-on experience with using the Modified Binary Search pattern
- The ability to choose the most appropriate of these three patterns to solve a new problem

### Two Pointers

The **two pointers** pattern is a versatile technique used in problem-solving to efficiently traverse or manipulate 
sequential data structures, such as arrays or linked lists. As the name suggests, it involves maintaining two pointers 
that traverse the data structure in a coordinated manner, typically starting from different positions or moving in 
opposite directions. These pointers dynamically adjust based on specific conditions or criteria, allowing for the 
efficient exploration of the data and enabling solutions with optimal time and space complexity. Whenever there’s a 
requirement to find two data elements in an array that satisfy a certain condition, the two pointers pattern should be 
the first strategy to come to mind.

The pointers can be used to iterate through the data structure in one or both directions, depending on the problem 
statement. For example, to identify whether a string is a palindrome, we can use one pointer to iterate the string from 
the beginning and the other to iterate it from the end. At each step, we can compare the values of the two pointers and 
see if they meet the palindrome properties.

- [Two Pointers Tasks](doc/two_pointers.md "Two Pointers Tasks")

### Fast and Slow Pointers

Similar to the two pointers pattern, the **fast and slow pointers** pattern uses two pointers to traverse an iterable 
data structure, but at different speeds, often to identify patterns, detect cycles, or find specific elements. 
The speeds of the two pointers can be adjusted according to the problem statement. Unlike the two pointers approach, 
which is concerned with data values, the fast and slow pointers approach is often used to determine specific pattern or 
structure in the data.

The key idea is that the pointers start at the same location and then start moving at different speeds. Generally, 
the slow pointer moves forward by a factor of one, and the fast pointer moves by a factor of two. This approach enables 
the algorithm to detect patterns or properties within the data structure, such as cycles or intersections. If there 
is a cycle, the two are bound to meet at some point during the traversal. To understand the concept, think of two 
runners on a track. While they start from the same point, they have different running speeds. If the track is circular, 
the faster runner will overtake the slower one after completing a lap.

- [Fast and Slow Pointers Tasks](doc/fast_and_slow_pointers.md "Fast and Slow Pointers Tasks")