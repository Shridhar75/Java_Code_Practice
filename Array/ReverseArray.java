package Array;

//Write a Java program to reverse array
import java.util.Scanner;
  import java.util.Arrays;

    public class ReverseArray {
        // Method to reverse the array in-place
        public static void reverseArray(int[] array) {
            int start = 0;
            int end = array.length - 1;

            while (start < end) {
                // Swap elements
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;

                // Move pointers
                start++;
                end--;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the size of the array
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            // Declare the array
            int[] numbers = new int[size];

            // Prompt the user to enter array elements
            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }

            System.out.println("Original Array: " + Arrays.toString(numbers));

            // Call the method to reverse the array
            reverseArray(numbers);

            System.out.println("Reversed Array: " + Arrays.toString(numbers));
        }
    }

