package Today_24Oct;

import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        int s,p,sum =0;
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        s=sc.nextInt();
         while(s>0)
         {
             p= s%10;
             sum = sum + p;
             s=s/10;
             }
        System.out.println("Sum of digit is: "+sum);
    }
}
