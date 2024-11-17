package Today_17Nov;

import java.util.Scanner;

public class Perimeter {
    int r, l, b, s1, s2, s3; // Dimensions for different shapes
    double perimeter; // Variable to store calculated perimeter
    Scanner s = new Scanner(System.in); // Scanner for user input

    // Method to calculate perimeter of a circle
    void circle() {
        System.out.print("Enter radius of the circle: ");
        r = s.nextInt(); // Accept radius input
        perimeter = 2 * Math.PI * r; // Use Math.PI for precision
        System.out.println("Perimeter of the circle: " + perimeter);
    }

    // Method to calculate perimeter of a rectangle
    void rectangle() {
        System.out.print("Enter length of the rectangle: ");
        l = s.nextInt(); // Accept length input
        System.out.print("Enter breadth of the rectangle: ");
        b = s.nextInt(); // Accept breadth input
        perimeter = 2 * (l + b); // Calculate perimeter
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    // Method to calculate perimeter of a triangle
    void triangle() {
        System.out.print("Enter length of the first side of the triangle: ");
        s1 = s.nextInt(); // Accept first side input
        System.out.print("Enter length of the second side of the triangle: ");
        s2 = s.nextInt(); // Accept second side input
        System.out.print("Enter length of the third side of the triangle: ");
        s3 = s.nextInt(); // Accept third side input
        perimeter = s1 + s2 + s3; // Calculate perimeter
        System.out.println("Perimeter of the triangle: " + perimeter);
    }

    // Main method
    public static void main(String[] args) {
        Perimeter obj = new Perimeter(); // Create object of Perimeter class
        obj.circle(); // Call circle method
        obj.rectangle(); // Call rectangle method
        obj.triangle(); // Call triangle method
        obj.s.close(); // Close Scanner to avoid resource leaks
    }
}

