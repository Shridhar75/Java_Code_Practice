package Today_13Nov;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        // Input rate of interest
        System.out.print("Enter the annual rate of interest (R) in %: ");
        double rate = scanner.nextDouble();

        // Input time period
        System.out.print("Enter the time period (T) in years: ");
        double time = scanner.nextDouble();

        // Input number of times interest is compounded per year
        System.out.print("Enter the number of times interest is compounded per year (n): ");
        int n = scanner.nextInt();

        // Calculate Compound Interest
        double amount = principal * Math.pow((1 + (rate / (n * 100))), n * time);
        double compoundInterest = amount - principal;

        // Display the results
        System.out.println("The total amount is: " + amount);
        System.out.println("The Compound Interest is: " + compoundInterest);

        scanner.close();
    }
}
