package Today_15Nov;

import java.util.Scanner;

public class ParallelogramArea {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Input base and height of the parallelogram
        System.out.print("Enter the base of the parallelogram: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the parallelogram: ");
        double height = sc.nextDouble();

        // Calculate the area using the formula: Area = base * height
        double area = base * height;

        // Output the area
        System.out.println("The area of the parallelogram is: " + area);
    }
}

