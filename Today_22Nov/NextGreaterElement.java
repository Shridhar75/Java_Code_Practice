package Today_22Nov;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array and input elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Array to store the next greater elements
        int[] nextGreater = new int[size];
        Stack<Integer> stack = new Stack<>();

        // Traverse the array in reverse order
        for (int i = size - 1; i >= 0; i--) {
            // Pop elements from the stack until the top of the stack is greater than the current element
            while (!stack.isEmpty() && stack.peek() <= array[i]) {
                stack.pop();
            }

            // If the stack is empty, no greater element exists
            nextGreater[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push the current element onto the stack
            stack.push(array[i]);
        }

        // Display the result
        System.out.println("Next greater elements for each array element:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " -> " + nextGreater[i]);
        }

        scanner.close();
    }
}
