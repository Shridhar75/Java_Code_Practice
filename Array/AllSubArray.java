import java.util.Scanner;

public class AllSubArray{
    // Recursive method to print subarrays
    public static void printSubarrays(int[] array, int start, int end) {
        // Base case: If end index reaches the end of the array, stop recursion
        if (end == array.length) {
            return;
        }
        // If start index is greater than end, move to the next subarray starting point
        else if (start > end) {
            printSubarrays(array, 0, end + 1);
        } else {
            // Print the current subarray
            printSubarray(array, start, end);
            // Recursive call to process the next start index
            printSubarrays(array, start + 1, end);
        }
    }

    // Helper method to print a subarray
    private static void printSubarray(int[] array, int start, int end) {
        System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.print(array[i]);
            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initializing the array
        int[] array = new int[size];

        // Taking array elements as input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Printing all possible subarrays
        System.out.println("All possible subarrays:");
        printSubarrays(array, 0, 0);

        scanner.close();
    }
}
