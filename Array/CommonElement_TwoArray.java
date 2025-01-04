package Array;

import java.util.Scanner;
 import java.util.HashSet;

//Write a java program to findout common elements between array
public class CommonElement_TwoArray {
        public static void main(String[] args) {
            // Call the method to get the two arrays from the user
            int[] array1 = getUserInput("first");
            int[] array2 = getUserInput("second");

            // Find and print common elements
            System.out.println("Common elements between the two arrays:");
            findCommonElements(array1, array2);
        }

        // Method to get an array input from the user
        public static int[] getUserInput(String arrayName) {
            Scanner scanner = new Scanner(System.in);

            // Get the size of the array from the user
            System.out.print("Enter the number of elements in the " + arrayName + " array: ");
            int n = scanner.nextInt();

            // Initialize the array
            int[] array = new int[n];

            // Get the array elements from the user
            System.out.println("Enter the elements of the " + arrayName + " array:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            return array; // Return the user-input array
        }

        // Method to find and print common elements
        public static void findCommonElements(int[] array1, int[] array2) {
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> commonElements = new HashSet<>();

            // Add elements of the first array to the set
            for (int num : array1) {
                set1.add(num);
            }

            // Check for common elements in the second array
            for (int num : array2) {
                if (set1.contains(num)) {
                    commonElements.add(num);
                }
            }

            // Print the common elements
            if (commonElements.isEmpty()) {
                System.out.println("No common elements found.");
            } else {
                for (int element : commonElements) {
                    System.out.println(element);
                }
            }
        }
    }














