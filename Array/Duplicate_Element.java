package Array;
//Java program to check whether a duplicate element is present in array or not
import java.util.HashSet;
import java.util.Scanner;

public class Duplicate_Element {
           public static boolean hasDuplicates(int[] arr) {
            // Use a HashSet to track elements
            HashSet<Integer> seen = new HashSet<>();

            for (int num : arr) {
                // If the number is already in the set, a duplicate is found
                if (seen.contains(num)) {
                    return true;
                }
                // Otherwise, add the number to the set
                seen.add(num);
            }
            return false; // No duplicates found
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Take input for the array size
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();

            // Create an array and take input for its elements
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Check for duplicates and print the result
            if (hasDuplicates(arr)) {
                System.out.println("Yes, the array contains duplicate elements.");
            } else {
                System.out.println("No, the array does not contain any duplicate elements.");
            }
            scanner.close();
        }
    }
