package Today_3Dec;

// Java program to print all the leaders in an array.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeaderInAnArray {
    //The main function to take input from the user
    //and display the leaders in an array
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the size of the array");
        try {
            size = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        int[] array = new int[size];
        System.out.println("Enter array elements");
        int i;
        for (i = 0; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("An error occurred. Exiting");
                return;
            }
        }
        System.out.println("The leaders of the array are");
        // max variable is used to keep track of the current maximum element
        int max = Integer.MIN_VALUE;

        //loop to print all the leaders of the array
        for (i = array.length - 1; i >= 0; i--) {
            if (array[i] > max) {
                System.out.print(array[i] + "  ");
                max = array[i];
            }
        }
    }
}
