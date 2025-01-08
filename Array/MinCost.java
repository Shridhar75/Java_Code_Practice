package Array;

    // Java program to find minimum cost to reduce array size to 1,
import java.lang.*;
import java.util.Scanner;

public class MinCost {
    // Function to calculate the minimum cost
    static int cost(int[] a, int n) {
        int min = a[0];

        // Find the minimum using a for loop
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }

        // Minimum cost is (n-1) multiplied by the minimum element.
        return (n - 1) * min;
    }

    // Main method to take user input and test the function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the size of the array as input
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] a = new int[n];

        // Take array elements as input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Call the cost function and print the result
        System.out.println("The minimum cost is: " + cost(a, n));

        scanner.close();
    }
}