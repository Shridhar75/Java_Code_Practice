package Today_3Dec;
//Java Program to Print Even Elements at Even Index Number
import java.io.BufferedReader;
import java.io.InputStreamReader;
    public class EvenIndexedOddElements {
        // Function to even numbers present at even index
        static void printEvenIndexedElements(int[] array) {
            int i = 0;
            for (i = 0; i < array.length; i++) {
                if (i % 2 == 0 && array[i] % 2 == 0) {
                    System.out.print(array[i] + " ");
                }
            }
        }

        // Function to read input
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
            System.out.println("Output");
            printEvenIndexedElements(array);
        }
    }

