package Today_25Oct;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of n:  ");
        int n = sc.nextInt();

        int result = Fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
        private static int Fib(int n) {
            if (n <= 1) {
                return n;
            } else {
                return Fib(n - 1) + Fib(n - 2);
            }
        }
    }

