//Java Program to Check Armstrong Number
//An Armstrong Number in Java is a unique integer where the
// sum of the cubes of its individual digits equals the number itself.
// Examples of Armstrong numbers include 0, 1, 153, 370, 371, 407, and more.

package Today_26Oct;
import java.util.Scanner;
public class Armstrong_Number {
    public static void main(String[] args) {
        int num, count=0,a,b,c,sum=0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter any number:  ");
        num=sc.nextInt();

            a=num;
            c=num;
            while(a>0)
            {
                a=a/10;
                count++;
            }
            while(num>0)
            {
                b=num%10;
                sum=(int) (sum+Math.pow(b, count));
                num=num/10;
            }
         if(sum == c)
         {
             System.out.print(c+" is an armstrong number");
         }
         else {
             System.out.print(c+" is not an armstrong number ");
         }
    }
}

/*
 Armstrong Number in Java using For Loop

import java.util.Scanner;
public class ArmStrong
{
    public static void main(String[] args)
    {
        int n, count = 0, a, b, c, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = s.nextInt();
        a = n;
        c = n;

        // Calculate the number of digits in 'n' using a for loop
        for (; a > 0; a /= 10)
        {
            count++;
        }

        // Reset 'a' and 'sum' for the following loop
        a = n;
        sum = 0;

        // Calculate the sum of cubes of digits using a for loop
        for (; n > 0; n /= 10)
        {
            b = n % 10;
            sum += Math.pow(b, count);
        }

        if (sum == c)
        {
            System.out.println(c + " is an Armstrong number");
        }
        else
        {
            System.out.println(c + " is not an Armstrong number");
        }
    }
}
 */