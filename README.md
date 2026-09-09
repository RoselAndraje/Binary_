# Laboratory Activity: Recursion

## Description
A Java program that performs a recursive binary search on a user-entered
array. The user provides the number of elements, the array elements, and a
target value. The array is sorted in ascending order before searching. Each
recursive call prints the current `low`, `high`, and `mid` values so the
shrinking search interval can be traced. The program outputs the index of
the target if found, or `-1` if the target is not in the array.

## PTask 1 – Recursion Trace
<img width="756" height="368" alt="image" src="https://github.com/user-attachments/assets/ce100bb2-98bc-4914-b06e-077efbf9cd88" />
## How to Compile and Run
```
javac BinarySearchLab.java
java BinarySearchLab
```

## Sample Input
```
9
25
10
3
7
17
2
40
1
15
25
```

## Sample Output
```
Sorted array: [1, 2, 3, 7, 10, 15, 17, 25, 40]

--- Recursive trace ---
binarySearch(0, 8, 25) -> mid=4, array[mid]=10
binarySearch(5, 8, 25) -> mid=6, array[mid]=17
binarySearch(7, 8, 25) -> mid=7, array[mid]=25

--- Result ---
Target 25 found at index: 7
```

## AI Disclosure
<Fill in per your instructor's requirements — e.g. "Used Claude (Anthropic)
to help write and explain the recursive binary search implementation."
Include the prompt used, if required by your instructor.>
