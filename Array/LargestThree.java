package Array;

import java.util.*;

public class LargestThree {
    // Function to return three largest elements
    public static List<Integer> get3largest(int[] arr) {
        int fst = Integer.MIN_VALUE, sec = Integer.MIN_VALUE, thd = Integer.MIN_VALUE;

        for (int x : arr) {
            // If current element is greater than fst
            if (x > fst) {
                thd = sec;
                sec = fst;
                fst = x;
            }
            // If x is between fst and sec
            else if (x > sec && x != fst) {
                thd = sec;
                sec = x;
            }
            // If x is between sec and thd
            else if (x > thd && x != sec && x != fst) {
                thd = x;
            }
        }

        List<Integer> res = new ArrayList<>();
        if (fst == Integer.MIN_VALUE) return res;
        res.add(fst);
        if (sec == Integer.MIN_VALUE) return res;
        res.add(sec);
        if (thd == Integer.MIN_VALUE) return res;
        res.add(thd);

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array
        int[] arr = new int[size];

        // Prompt the user to enter array elements
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get the three largest elements
        List<Integer> res = get3largest(arr);

        // Output the result
        System.out.println("The three largest elements are:");
        for (int x : res) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
