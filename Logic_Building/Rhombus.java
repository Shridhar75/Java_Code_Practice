package Today_15Nov;
//Java program to calculate area of Rhombus

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Input the diagonals of the rhombus
        System.out.print("Enter the first diagonal (d1): ");
        double d1 = sc.nextDouble();

        System.out.print("Enter the second diagonal (d2): ");
        double d2 = sc.nextDouble();

        // Calculate the area using the formula: Area = (d1 * d2) / 2
        double area = (d1 * d2) / 2;

        // Output the area
        System.out.println("The area of the rhombus is: " + area);
    }
}

