package Today_2Dec;
//Java Program to Print Elements Which Occurs Even Number of Times

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenFrequencyElements {
    // Function to print even frequency elements
    static void printEvenFrequencyElements(int[] array){
        boolean[] check = new boolean[array.length];
        int i,j,count;
        for(i=0; i<array.length; i++){
            if(!check[i]){
                count=1;
                for(j=i+1;j<array.length;j++){
                    if(array[j] == array[i]){
                        count++;
                        check[j]=true;
                    }
                }
                if(count%2==0){
                    System.out.println(array[i]);
                }
            }
        }
    }
    // Main function to read input
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
        System.out.println("The even frequency elements are");
        printEvenFrequencyElements(array);
    }
}