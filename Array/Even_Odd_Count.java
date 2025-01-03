package Array;

import java.util.Scanner;

//Write a java program to count even and odd number in array
public class Even_Odd_Count {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the size of the array
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            // Declare the array
            int[] arr = new int[size];

            // Prompt the user to enter array elements
            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            // Initialize counters for even and odd numbers
            int evenCount = 0;
            int oddCount = 0;

            // Iterate through the array and count even and odd numbers
            for (int num : arr) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            // Output the result
            System.out.println("Even numbers count: " + evenCount);
            System.out.println("Odd numbers count: " + oddCount);
        }
    }
