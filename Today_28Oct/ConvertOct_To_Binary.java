package Today_28Oct;

//Java program to Convert number Octal to binary
import java.util.Scanner;
class OctToBinary
{
    Scanner sc;
    int num;

    void getVal()
    {
        System.out.println("Convert Octal to Binary");
        sc= new Scanner(System.in);

        System.out.println("Enter Octal number: ");
        num = Integer.parseInt(sc.nextLine(), 8);
    }

    void convert()
    {
        String Binary  = Integer. toBinaryString(num);
        System.out.println("Binary Value is:  "+Binary);
    }
}
public class ConvertOct_To_Binary {
    public static void main(String[] args) {
        OctToBinary obj = new OctToBinary();

        obj.getVal();
         obj.convert();

    }
}
