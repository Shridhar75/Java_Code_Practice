package Today_20Nov;

import java.util.Scanner;

//Array's length to be determined by the user
public class ArrayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user to specify the array length
        System.out.print("Enter the length of the array: ");
        int size = sc.nextInt();

        // Step 2: Create the array with the specified length
        int[] array = new int[size];
        int n = 0; // Current number of elements in the array

        while (true) {
            System.out.println("\nArray Operations Menu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Insert
                    if (n < size) {
                        System.out.print("Enter the element to insert: ");
                        int element = sc.nextInt();
                        array[n++] = element;
                        System.out.println("Element inserted successfully!");
                    } else {
                        System.out.println("Array is full! Cannot insert more elements.");
                    }
                    break;

                case 2: // Delete
                    if (n > 0) {
                        System.out.print("Enter the element to delete: ");
                        int element = sc.nextInt();
                        boolean found = false;

                        for (int i = 0; i < n; i++) {
                            if (array[i] == element) {
                                // Shift elements to the left
                                for (int j = i; j < n - 1; j++) {
                                    array[j] = array[j + 1];
                                }
                                n--;
                                found = true;
                                System.out.println("Element deleted successfully!");
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Element not found in the array!");
                        }
                    } else {
                        System.out.println("Array is empty! No elements to delete.");
                    }
                    break;

                case 3: // Search
                    if (n > 0) {
                        System.out.print("Enter the element to search: ");
                        int element = sc.nextInt();
                        boolean found = false;

                        for (int i = 0; i < n; i++) {
                            if (array[i] == element) {
                                System.out.println("Element found at index: " + i);
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Element not found in the array!");
                        }
                    } else {
                        System.out.println("Array is empty! No elements to search.");
                    }
                    break;

                case 4: // Display
                    if (n > 0) {
                        System.out.println("Array elements are:");
                        for (int i = 0; i < n; i++) {
                            System.out.print(array[i] + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Array is empty! No elements to display.");
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

}
