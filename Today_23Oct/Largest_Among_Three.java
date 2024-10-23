package Today_23Oct;

import java.util.Scanner;

public class Largest_Among_Three {
    public static void main(String[] args) {
        System.out.println("Enter any three number: ");
        Scanner sc = new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c = sc.nextInt();

        if(a >= b) {
            if(a>= c)
                System.out.println(a + " : a1  is the largest number.");
            else
                System.out.println(c + "  :c is the largest number.");
        } else {
            if(b >= c)
                System.out.println(b + "  :b is the largest number.");
            else
                System.out.println(c + "   :c  is the largest number.");
        }
    }
}
