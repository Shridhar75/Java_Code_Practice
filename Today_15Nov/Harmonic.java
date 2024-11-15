package Today_15Nov;

import java.util.Scanner;

public class Harmonic {
    public static void main(String...a) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("The Harmonic series is: ");
        double result = 0.0;

        // Corrected the 'while' loop condition
        while (num > 0) {
            result = result + (double) 1 / num;
            num--;
            System.out.print(result + " ");
        }

        System.out.println(" ");
        System.out.println("Output of harmonic series is " + result);
    }
}
