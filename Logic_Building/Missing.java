package Today_1Dec;

import java.util.Scanner;

//Java Program to Find Missing Numbers in Array
public class Missing {
    static int getMissingNo(int a[], int n) {
        int i, total;
        total = (n + 1) * (n + 2) / 2; // Sum of first n+1 natural numbers
        for (i = 0; i < n; i++)
            total -= a[i]; // Subtract all elements of the array from the total
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int missingNumber = getMissingNo(a, n);
        System.out.println("The number missing is: " + missingNumber);

        sc.close();
    }
}
