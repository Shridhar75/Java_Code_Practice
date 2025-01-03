package Array;

//Write a java program to find largest number is array
import java.util.Scanner;

public class LargestNumber {
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

        // Find the largest element in the array
        int largest = arr[0]; // Assume the first element is the largest initially

        for (int i = 1; i < size; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Output the largest element
        System.out.println("The largest element in the array is: " + largest);
    }
}

