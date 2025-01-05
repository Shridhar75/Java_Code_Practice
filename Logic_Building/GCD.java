package Today_18Nov;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Initialize scanner
        System.out.print("Enter First Number: ");
        int a = s.nextInt(); // Input first number
        System.out.print("Enter Second Number: ");
        int b = s.nextInt(); // Input second number

        int gcd = findGCD(a, b); // Call method to calculate GCD
        System.out.println("Greatest Common Divisor: " + gcd);

        s.close(); // Close scanner to prevent resource leak
    }

    // Method to find GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) { // Repeat until b becomes 0
            int temp = b;
            b = a % b; // Update b to remainder of a / b
            a = temp; // Update a to old value of b
        }
        return a; // Return GCD
    }
}
