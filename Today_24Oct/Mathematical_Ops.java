package Today_24Oct;
import java.util.Scanner;
public class Mathematical_Ops {
    public static void main(String[] args) {
        int a, b, c, ch;
        System.out.print(" Enter any two numbers:  ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("   ");
        System.out.println("Addition Operation Enter 1 ");
        System.out.println("Subtraction Operation Enter 2 ");
        System.out.println("Multiplication  Operation Enter 3 ");
        System.out.println("Division Operation Enter 4 ");
        System.out.println("Modulus  Operation Enter 5");
        System.out.println("   ");
        System.out.println("Enter your choice: ");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                c = a + b;
                System.out.print(" Addition  of two number is:  " + c);
                break;
            case 2:
                c = a - b;
                System.out.print(" Subtraction of two number is:   " + c);
                break;
            case 3:
                c = a * b;
                System.out.print("Multiplication of two number is:   " + c);
                break;
            case 4:
                c = a / b;
                System.out.print("Division of two number is:  " + c);
                break;
            case 5:
                c = a % b;
                System.out.println("Mod of two number is:   " + c);
                break;
            default:
                System.out.println("Please select valid choice......");
        }

    }
}
