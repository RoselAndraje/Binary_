import java.util.Arrays;
import java.util.Scanner;

/* Description: Performs a recursive binary search on a user-provided array.
   The user enters the number of elements, the elements themselves, and the
   target value. The array is sorted ascending before the search runs, and
   each recursive call prints the current low, high, and mid values so the
   shrinking search interval can be traced. The program prints the index of
   the target if found, or -1 if not found.

   Programmed by: <ZYRELL KENT REYES OLOROSO> <BSIT> <DATA STRUCTURES AND ALGORITHM>
   Last Modified: <SEPT 4, 2026>
   Version: 1.0
   Acknowledgements: <list any sites/sources or generative AI tools used, with the prompt, per your lab requirements>
*/
public class BinarySearchLab {

    // Recursive binary search: prints low/high/mid on every call
    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) {
            // Base case: interval is empty, target is not in the array
            System.out.println("binarySearch(" + low + ", " + high + ", target) -> not found");
            return -1;
        }

        int mid = (low + high) / 2;
        System.out.println("binarySearch(" + low + ", " + high + ", " + target + ") -> mid=" + mid + ", array[mid]=" + arr[mid]);

        if (arr[mid] == target) {
            // Base case: target found at mid
            return mid;
        } else if (arr[mid] > target) {
            // Target must be in the left half
            return binarySearch(arr, low, mid - 1, target);
        } else {
            // Target must be in the right half
            return binarySearch(arr, mid + 1, high, target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements one at a time:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(sc.nextLine().trim());
        }

        // Binary search requires a sorted array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.print("Enter the target value: ");
        int target = Integer.parseInt(sc.nextLine().trim());

        System.out.println("\n--- Recursive trace ---");
        int result = binarySearch(arr, 0, arr.length - 1, target);

        System.out.println("\n--- Result ---");
        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found. Output: -1");
        }

        sc.close();
    }
}
