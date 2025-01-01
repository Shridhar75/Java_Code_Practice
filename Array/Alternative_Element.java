package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Alternative_Element {
    static ArrayList<Integer> getAlternates(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();

        // Iterate over all alternate elements
        for (int i = 0; i < arr.length; i += 2) {
            res.add(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();  // Read the size of the array

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Read each element
        }

        ArrayList<Integer> res = getAlternates(arr);
        System.out.print("Alternate elements of the array are: ");
        for (int x : res) {
            System.out.print(x + " ");
        }

        sc.close();  // Close the scanner
    }
}
