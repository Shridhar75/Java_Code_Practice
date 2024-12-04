package Today_4Dec;
//Java Program to Print the Longest Sub-Array that is Increasing

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LongestIncreasingSubarray {
    // Function to calculate the longest increasing subarray
    static int[] longestIncreasingSubarray(int[] array){
        int[] index = new int[2];
        int i,j,start = 0;
        int max = 0;
        for(i=0; i<array.length-1; i++){
            if(array[i] < array[i+1]){
                start = i;
                max++;
                for(j = i+1; j<array.length-1; j++){
                    if(array[j] > array[j+1])
                        break;
                    else
                        max++;
                }
                if(max > index[1] - index[0] + 1){
                    index[0] = start;
                    index[1] = j--;
                }
                i = j;
            }
        }
        return index;
    }
    // Function to read input and display the output
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
                System.out.println("An error occurred");
            }
        }
        int[] index = longestIncreasingSubarray(array);
        System.out.println("The longest increasing subarray is");
        for(i=index[0];i<=index[1];i++){
            System.out.print(array[i] + " ");
        }
    }
}