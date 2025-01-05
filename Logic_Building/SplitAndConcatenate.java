package Today_5Dec;

// Java Program to Split an Array and Concatenate First Part to the End.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SplitAndConcatenate {
    // Function concatenate the first and last part
    static int[] splitAndConcatenate(int[] array,int n){
        int size = (array.length/n);
        if(array.length%n == 0)
            size*=2;
        else
            size+=array.length%n;
        int[] output = new int[size];
        int i,j=0;
        for(i=0; i<array.length/n; i++){
            output[j++] = array[i];
        }
        for(i= (array.length%n == 0 ? array.length-array.length/n
                : array.length - array.length%n ); i<array.length; i++){
            output[j++] = array[i];
        }
        return output;
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
                return;
            }
        }
        int n;
        System.out.println("Enter the number of parts in" +
                " which array is to splitted");
        try {
            n = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println("The final array is");
        if(n==0){
            System.out.println(Arrays.toString(array));
        }
        else{
            int[] output = splitAndConcatenate(array,n);
            System.out.println(Arrays.toString(output));
        }
    }
}