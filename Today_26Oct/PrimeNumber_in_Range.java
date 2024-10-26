package Today_26Oct;

import java.util.Scanner;

//Java Program to Find Prime Numbers in a Given Range
public class PrimeNumber_in_Range {
    public static void main(String[] args) {
        int s1, s2, s3, flag = 0, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit:  ");
        s1 = sc.nextInt();

        System.out.print("Enter Upper limit: ");
        s2 = sc.nextInt();

        System.out.println("The prime numbers in  between  the entered  limit are: ");
        for (i = s1; i <= s2; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println(i);
            }
        }
    }
}