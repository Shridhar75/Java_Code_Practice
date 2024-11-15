package Today_15Nov;

import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {

            // Create Scanner object to take input from user
            Scanner sc = new Scanner(System.in);

            // Input the sides of the triangle
            System.out.print("Enter the first side (a): ");
            double a = sc.nextDouble();
            System.out.print("Enter the second side (b): ");
            double b = sc.nextDouble();
            System.out.print("Enter the third side (c): ");
            double c = sc.nextDouble();

            // Calculate semi-perimeter
            double s = (a + b + c) / 2;

            // Calculate the area using Heron's formula
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            // Output the area
            System.out.println("The area of the triangle is: " + area);
        }
    }



