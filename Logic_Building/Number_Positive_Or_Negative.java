package Today_23Oct;

import java.util.Scanner;

public class Number_Positive_Or_Negative {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print(" Enter any number: ");
        int num = sc.nextInt();
        if(num==0)
        {
            System.out.println(num+" is neither Positive nor Negative ");
        }
        else if(num>0 )
        {
            System.out.print(num +"  is positive integer");
        }
        else {
            System.out.print(num+" is negative integer");
        }
    }
}
