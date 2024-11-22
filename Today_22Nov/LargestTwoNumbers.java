package Today_22Nov;

import java.util.Scanner;

public class LargestTwoNumbers {
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

        // Initialize variables to find the largest and second-largest numbers
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the array to find the two largest numbers
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Display the result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("All elements in the array are the same.");
        } else {
            System.out.println("The largest number is: " + largest);
            System.out.println("The second-largest number is: " + secondLargest);
        }
        scanner.close();
    }
}
