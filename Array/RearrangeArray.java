package Array;
//Java program to Rearrange array such that even positioned are greater than odd
import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArray {

    // Function to rearrange the array
    public static void rearrangeEvenOddPositions(int[] arr) {
        int n = arr.length;

        // Sort the array
        Arrays.sort(arr);

        // Create a temporary array to hold rearranged elements
        int[] temp = new int[n];

        int evenIndex = n - 1; // Start filling even positions from the largest element
        int oddIndex = 0;     // Start filling odd positions from the smallest element

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                temp[i] = arr[evenIndex--]; // Fill even positions
            } else {
                temp[i] = arr[oddIndex++]; // Fill odd positions
            }
        }

        // Copy rearranged elements back to the original array
        System.arraycopy(temp, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Take input for the elements of the array
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        // Call the function to rearrange the array
        rearrangeEvenOddPositions(arr);

        // Print the rearranged array
        System.out.println("Rearranged array: " + Arrays.toString(arr));

        scanner.close();
    }
}
