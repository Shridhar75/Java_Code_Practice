package Today_23Oct;

import java.util.Scanner;

//Number Swapping Using Third Variable
public class Number_Swap {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a value of P and Q: ");
         a=sc.nextInt();
         b= sc.nextInt();
        System.out.println("Before swapping two numbers: "+a+" "+b);

        //Swapping logic
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping: "+a +"   " + b);
    }
}
