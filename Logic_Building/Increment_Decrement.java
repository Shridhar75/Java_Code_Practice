package Today_12Nov;

import java.util.Scanner;

public class Increment_Decrement {
    public static void main(String[] args)
    {
        int a,  b,  c, d, e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer a: ");
        a=sc.nextInt();
        b= ++a;
        System.out.println("Result after pre increment a: "+a);
        System.out.println("Result after pre increment b: "+b);
        c = a++;
        System.out.println("Result after pre increment a: "+a);
        System.out.println("Result after pre increment c: "+c);
        d = --a;
        System.out.println("Result after pre increment a: "+a);
        System.out.println("Result after pre increment d: "+d);
        e=a--;
        System.out.println("Result after pre increment a: "+a);
        System.out.println("Result after pre increment e: "+e);
    }
}
