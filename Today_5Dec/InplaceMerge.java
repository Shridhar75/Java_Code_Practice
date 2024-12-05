package Today_5Dec;

// Java Program to Merge Two Arrays Without Extra Space in Order
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InplaceMerge {
    // Function to merge the arrays in place
    static void inPlaceMerge(int[] arrayOne,int[] arrayTwo){
        int i,j,temp;
        for(i=arrayTwo.length - 1;i>=0;i--){
            temp = arrayOne[arrayOne.length-1];
            for(j=arrayOne.length-2; j>=0 && arrayTwo[i] < arrayOne[j];j--){
                arrayOne[j+1] = arrayOne[j];
            }

            if(j!=arrayOne.length-2 || temp > arrayTwo[i]){
                arrayOne[j+1] = arrayTwo[i];
                arrayTwo[i] = temp;
            }
        }
    }
    // Function to read input and display the output
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size,size1;
        System.out.println("Enter the size of the two arrays");
        try {
            size = Integer.parseInt(br.readLine());
            size1 = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        int[] arrayOne = new int[size];
        int[] arrayTwo = new int[size1];
        System.out.println("Enter the first array elements");
        int i;
        for (i = 0; i < arrayOne.length; i++) {
            try {
                arrayOne[i] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("An error occurred");
            }
        }
        System.out.println("Enter the second array elements");
        for (i = 0; i < arrayTwo.length; i++) {
            try {
                arrayTwo[i] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("An error occurred");
            }
        }
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        System.out.println("Initially arrays are");
        System.out.println("Array One");
        System.out.println(Arrays.toString(arrayOne));
        System.out.println("\nArray Two");
        System.out.println(Arrays.toString(arrayTwo));
        inPlaceMerge(arrayOne,arrayTwo);
        System.out.println("\nArrays after merging are");
        System.out.println("\nArray One");
        System.out.println(Arrays.toString(arrayOne));
        System.out.println("\nArray Two");
        System.out.println(Arrays.toString(arrayTwo));
    }
}