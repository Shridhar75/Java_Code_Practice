package Today_22Nov;

import java.util.Scanner;

public class Number_Of_Elements {
    public static void main(String[] args)
    {
         Scanner scanner = new Scanner(System.in);
        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Input the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find and print the number of elements in the array
        int numberOfElements = array.length;
        System.out.println("The number of elements in the array is: " + numberOfElements);

        scanner.close();
    }
    }
