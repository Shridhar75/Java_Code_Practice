//Java Program to convert Octal number to Deciaml
package Today_28Oct;

import java.util.Scanner;

class OctToDecimal
{
    Scanner sc ;
    int num;

    void getVal()
    {
        System.out.println("Conversion of Hexadecimal into Decimal number");
        sc = new Scanner(System.in);
        System.out.println("Enter Octal number:  ");
        num = Integer.parseInt(sc.nextLine(), 16);
    }

    void  convert()
    {
        String Decimal  = Integer.toString(num);
        System.out.println("Decimal value is:  "+Decimal);
    }
}

public class ConvertOctal_To_Decimal {
    public static void main(String[] args) {
        OctToDecimal obj = new OctToDecimal();

        obj.getVal();
        obj.convert();
    }
}
