package Today_22Nov;

import java.util.Scanner;

//Java program to find the second largest and smallest elements in an array
public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Ensure the array has at least two elements
        if (size < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Create an array and input elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Initialize variables for smallest and second smallest
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Initialize variables for largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the array to find the required elements
        for (int num : array) {
            // Find the smallest and second smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }

            // Find the largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Display the results
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("All elements in the array are the same for smallest values.");
        } else {
            System.out.println("The smallest element is: " + smallest);
            System.out.println("The second smallest element is: " + secondSmallest);
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("All elements in the array are the same for largest values.");
        } else {
            System.out.println("The largest element is: " + largest);
            System.out.println("The second largest element is: " + secondLargest);
        }

        scanner.close();
    }
}
