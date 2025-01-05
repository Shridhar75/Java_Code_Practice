package Today_6Dec;

//Java Program to Shift the 0's in an Array to the End

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShiftZeroesEnd {
    // Function to shift the zeroes in the end
    static void inTheEnd(int[] array){
        int startIndex = 0;
        int i,j,temp;
        for(i=0;i<array.length;i++){
            if(array[i] != 0){
                for(j=i; j>startIndex;j--){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
                startIndex++;
            }
        }
    }
    // Function to read user input and display the output
    public static void main(String[] args){
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
        inTheEnd(array);
        System.out.println("The array after shifting the zeroes in the end is");
        for(i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}