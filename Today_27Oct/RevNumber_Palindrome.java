package Today_27Oct;

import java.util.Scanner;

public class RevNumber_Palindrome {
    public static void main(String[] args) {
        int n, a, m = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = sc.nextInt();
        do {
            a = n % 10;
            m = m * 10 + a;
            sum = sum + a;
            n = n / 10;
        }
        while (n > 0);
        {
            System.out.println("Reverse:" + m);
            System.out.println("Sum of digits:" + sum);
        }

    }
}
