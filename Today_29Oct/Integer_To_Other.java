package Today_29Oct;
//Java Program to to Convert Integer Values into Byte, Character, Float.
import java.util.Scanner;

public class Integer_To_Other {
    public static void main(String[] args) {
        int a;
        byte b;
        char c;
        float d;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer:");
        a = s.nextInt();
        b = (byte) a;
        System.out.println("Conversion into byte:"+b);
        c = (char) a;
        System.out.println("Conversion into char:"+c);
        d = a;
        System.out.println("Conversion into float:"+d);
    }
}
