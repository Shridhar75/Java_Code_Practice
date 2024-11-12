package Today_12Nov;
import java.util.Scanner;

// Define the ComplexNumber class
class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor to initialize real and imaginary parts
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to represent the complex number as a string
    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }
}

// Main class
class ComplexNumberAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first complex number
        System.out.println("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();

        // Input for the second complex number
        System.out.println("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();

        // Create two complex numbers
        ComplexNumber num1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber num2 = new ComplexNumber(real2, imaginary2);

        // Add the two complex numbers
        ComplexNumber result = num1.add(num2);

        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);

        scanner.close();
    }
}























/*
// Define the ComplexNumber class

class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor to initialize real and imaginary parts
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to represent the complex number as a string
    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }
}

// Main class
class ComplexNumberAddition {
    public static void main(String[] args) {
        // Create two complex numbers
        ComplexNumber num1 = new ComplexNumber(3.5, 2.5);
        ComplexNumber num2 = new ComplexNumber(1.5, 4.5);

        // Add the two complex numbers
        ComplexNumber result = num1.add(num2);

        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
    }
}
*/