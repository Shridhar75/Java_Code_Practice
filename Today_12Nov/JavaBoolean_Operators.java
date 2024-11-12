package Today_12Nov;

import java.util.Scanner;

public class JavaBoolean_Operators {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        boolean a = sc.nextBoolean();
        System.out.print("Enter b: ");
        boolean b=sc.nextBoolean();

        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a &!b);

        boolean g = !a;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("a|b = "+c);
        System.out.println("a & b = "+d);
        System.out.println("a ^ b= "+e);
        System.out.println("!a & b | a & !b = "+f);
        System.out.println("!a = "+g);


    }
}
