package Today_23Nov;

import java.util.Scanner;
public class InsertElement_In_Array {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);

    // Get the size of the array
        System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();

    // Create an array
    int[] array = new int[size + 1]; // Extra space for the new element

    // Input elements for the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
        array[i] = scanner.nextInt();
    }

    // Get the element to be inserted
        System.out.print("Enter the element to be inserted: ");
    int element = scanner.nextInt();

    // Get the position to insert the element
        System.out.print("Enter the position (1 to " + (size + 1) + ") where the element should be inserted: ");
    int position = scanner.nextInt();

    // Check if the position is valid
        if (position < 1 || position > size + 1) {
        System.out.println("Invalid position! Please run the program again.");
    } else {
        // Shift elements to the right
        for (int i = size; i >= position; i--) {
            array[i] = array[i - 1];
        }

        // Insert the new element
        array[position - 1] = element;

        // Display the updated array
        System.out.println("Array after insertion:");
        for (int i = 0; i <= size; i++) {
            System.out.print(array[i] + " ");
        }
    }
        scanner.close();
}
}
