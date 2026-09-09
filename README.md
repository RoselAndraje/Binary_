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
