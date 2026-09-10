## Description
A Java program that performs a recursive binary search on a user-entered
array. The user provides the number of elements, the array elements, and a
target value. The array is sorted in ascending order before searching. Each
recursive call prints the current `low`, `high`, and `mid` values so the
shrinking search interval can be traced. The program outputs the index of
the target if found, or `-1` if the target is not in the array.

## Task 1 – Recursion Trace
<img width="756" height="368" alt="image" src="https://github.com/user-attachments/assets/ce100bb2-98bc-4914-b06e-077efbf9cd88" />

## Task 2 – Modified Binary Search Program
/ Description: Performs a recursive binary search on a user-supplied array of
integers. The program accepts the number of elements, the array elements.
and a target value: sorts the array in ascending order; then recursively
searches for the target and displays its Index, or 1 if not found.
Programmed by: [Your Name] [Course] [Section/CN] [Subject]
Last Modified: September 9, 2026
Version: 1.0
Acknowledgements: Discussed and refined with Claude (Anthropic AI
assistant) for guidance on accepting user input, sorting the array,
and formatting program output.
/
import java.util.Arrays:
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

/* Description: Performs a recursive binary search on a user-provided array.
   The user enters the number of elements, the elements themselves, and the
   target value. The array is sorted ascending before the search runs, and
   each recursive call prints the current low, high, and mid values so the
   shrinking search interval can be traced. The program prints the index of
   the target if found, or -1 if not found.

   Programmed by: <ROSEL LOU E. ANDRAJE> <BSIT> <DATA STRUCTURES AND ALGORITHM>
   Last Modified: <SEPT 4, 2026>
   Version: 1.0
   Acknowledgements: <list any sites/sources or generative AI tools used, with the prompt, per your lab requirements>

    public static int bSearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return bSearch(arr, target, low, mid - 1);
        }
        return bSearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        System.out.print("Enter the target value to search for: ");
        int target = sc.nextInt();

        int result = bSearch(
                numbers,
                target,
                0,
                numbers.length - 1
        );

        if (result == -1) {
            System.out.println("Element not found.");
            System.out.println(-1);
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close(); 
    }
}

<img width="538" height="320" alt="image" src="https://github.com/user-attachments/assets/69b40ad1-b817-4b48-82bc-80d92d520caa" />

<img width="553" height="305" alt="image" src="https://github.com/user-attachments/assets/e8e33578-82d6-4752-82ad-c330556d6e80" />


## Task 3 – Search Trace
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

Portions of this submission were developed with the assistance of Claude (Anthropic), an AI assistant, used within a chat conversation. Claude helped:

modify the original recursive binary search program to accept user input and automatically sort the array before searching,
add a recursive-call trace (low, high, mid) to visualize how the search interval narrows at each step,
construct and verify a recursion-trace table against manual tracing, and
draft written explanations for the accompanying reflection questions.



## Task 4 – Explanation
1. What are the three laws of recursion? Briefly describe each law.
Law 1-A recursive algorithm must have a base case. This is the condition under which the function. stops calling itself and returns a result directly, rather than recursing further. In binary search, there are two base cases: finding the target (arrinidae) and exhausting the search interval (sow high).
Law 2-A recursive algorithm must change its state and move toward the base case. Each call must bring the problen closer to a base case, usually by shrinking the input. In binary search, this is done by narrowing the law, high interval after every call.
Law 3-A recursive algorithm must call itself, recursively. The function must invoke itself (directly, or indirectly through another function) to solve a smaller version of the same problem, asach does when it calls aarchlarz, target, low, nid 11 of hisarchirr, targit, 1, highi
2. In the recursive binary search algorithm, what are the purposes of the variables low, high, and mid?
I and high mark the boundaries (inclusive) of the current search interval within the array the range of Indices that might still contain the target. is the index computed from me and high (specifically thigh low) /2) that identifies the middle element of that interval; the algorithm compares the target against amid to decide whether to stop (if it matches), or which half of the interval to search next (updating either high to mid or tov to mid 1).
3. What are the two conditions that can cause the recursive binary search to stop? Explain what happens in each condition.
Condition 1-arr[mid] target: the element at the midpoint matches the target value. The search stops successfully and the function returns, the index of the found element
Condition 2-low hight the search interval has become empty, meaning every element has been eliminated without finding a match. The search stops unsuccessfully and the function returns to Indicate the target is not present in the array.
4. Why must the array be sorted before performing binary search? What could happen if an unsorted array is provided?
Binary search relies on comparing the target to the middle element and using that single comparison to eliminate an entire half of the array it assumes that if the target is greater than sreinidl, it can only be to the right, and if smaller, only to the left. This assumption is only valid when the array is sorted in ascending order. If the array is unsorted, the target could actually lie in the half being discarded, so the algorithm may skip over the correct element entirely. This can cause binary search to report "not found" (return -1) even when the target does exist in the array, or to return the wrong index.
5. In Java, what is the difference between an array's index and its position? Give an example using the following array: ( 10, 20, 30, 40, 50)
An array's index is the zero-based numeric location used in code to access an element (sr), etc.), starting at 0 for the first element. An element's position usually refers to its ordinal place in the sequence as a person would count it, starting at 1 (1st, 2nd, 3rd....). For the array 110, 30, 30, 40, 50). the value 20 is stored at index 2 (121), but it is the 3rd (3rd position) element in the array when counted naturally starting from one.
6. A student modifies the recursive binary search program but accidentally writes the recursive call without changing low or high. Explain why this can cause a program to repeatedly call itself without reaching the base case. Which of the three laws has been violated?to help write and explain the recursive binary search implementation."
Include the prompt used, if required by your instructor.>
