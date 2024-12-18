package Today_13Nov;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        // Input rate of interest
        System.out.print("Enter the rate of interest (R) in %: ");
        double rate = scanner.nextDouble();

        // Input time period
        System.out.print("Enter the time period (T) in years: ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is: " + simpleInterest);

        scanner.close();
    }
}