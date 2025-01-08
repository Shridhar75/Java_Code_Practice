package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctElement {

        // Function to find distinct elements in the array
        static ArrayList<Integer> findDistinct(int[] arr) {
            ArrayList<Integer> res = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                // Check if this element is already included in the result
                int j;
                for (j = 0; j < i; j++)
                    if (arr[i] == arr[j])
                        break;

                // Include this element if not included previously
                if (i == j)
                    res.add(arr[i]);
            }
            return res;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Take the size of the array as input
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();

            // Initialize the array
            int[] arr = new int[n];

            // Take array elements as input
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Call the findDistinct function
            ArrayList<Integer> res = findDistinct(arr);

            // Print the distinct elements
            System.out.println("Distinct elements in the array:");
            for (int val : res) {
                System.out.print(val + " ");
            }

            scanner.close();
        }
    }

