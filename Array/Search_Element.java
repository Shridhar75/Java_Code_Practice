package Array;

import java.util.Scanner;

// Java program to check whether an entered element is present or not in a given array
public class Search_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();  // Read the size of the array

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Read each element
        }

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();  // Read the element to search

        boolean isPresent = false;
        int position = -1;  // To store the position of the target element

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                isPresent = true;
                position = i + 1;  // Storing position (1-based index)
                break;
            }
        }

        if (isPresent) {
            System.out.println("The element " + target + " is present at position " + position + ".");
        } else {
            System.out.println("The element " + target + " is not present in the array.");
        }

        sc.close();  // Close the scanner
    }
}
