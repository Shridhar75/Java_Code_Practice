package Array;
//Write a java program to find Second Largest number in array

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest_Element {
    static int getSecondLargest(int[] arr) {
        int n = arr.length;
        // Sort the array in non-decreasing order
        Arrays.sort(arr);
        //start from second last element  as last element is the largest
        for (int i = n - 2; i >= 0; i--) {
            // return the first element which is not equal to the
            // largest element
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        // If no second largest element was found, return -1
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array which you want: ");
        int n = sc.nextInt();

        int[] arr = new int [n];
        //Taking input for array elements
        System.out.print("Enter the elements if the array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
       }
        //Output the largest  element int the array
        System.out.println("The largest element in the array is: "+getSecondLargest(arr));


    }


}
