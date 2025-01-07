package Array;
//Minimum increment by k operations to make all equal
import java.util.Scanner;
import java.util.Arrays;

public class MakeArrayEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Taking input for the array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sorting the array
        Arrays.sort(arr);

        // Finding the median of the array
        int median = arr[n / 2]; // Median minimizes the cost of making elements equal.

        // Calculating the total operations required
        int operations = 0;
        for (int num : arr) {
            operations += Math.abs(num - median);
        }

        // Printing the result
        System.out.println("Minimum number of operations to make all elements equal: " + operations);
        System.out.println("Array values after making all elements equal: ");
        for (int i = 0; i < n; i++) {
            arr[i] = median;
            System.out.print(arr[i] + " ");
        }
    }
}
