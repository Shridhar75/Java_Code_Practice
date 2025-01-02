package Array;

import java.util.Scanner;

//Write a java program to find out largest element in given array
import java.util.Scanner;

class GfG {
    static int largest(int[] arr) {
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output the largest element in the array
        System.out.println("The largest element in the array is: " + largest(arr));

        sc.close();
    }
}

