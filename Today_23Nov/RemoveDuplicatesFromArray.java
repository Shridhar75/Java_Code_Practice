package Today_23Nov;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array
        int[] array = new int[size];

        // Input elements for the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Remove duplicates
        int[] uniqueArray = removeDuplicates(array);

        // Display the result
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }

    // Method to remove duplicates
    public static int[] removeDuplicates(int[] array) {
        Arrays.sort(array); // Sort the array to bring duplicates together
        int[] temp = new int[array.length];
        int j = 0;

        // Traverse the sorted array and store unique elements in temp
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        // Add the last element
        temp[j++] = array[array.length - 1];

        // Create a new array with the size of unique elements
        return Arrays.copyOf(temp, j);
    }
}
