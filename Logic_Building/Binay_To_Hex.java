package Today_28Oct;
//Java program convert Binary to Hexadecimal
import java.util.Scanner;

class BToX
{
    Scanner sc;
   int num;

   void getVal()
   {
       System.out.println("Conversion of Binay to HexaDecimal.");
       sc= new Scanner(System.in);

       System.out.println("Enter a binary number ");
       num = Integer.parseInt(sc.nextLine(), 2);
    }

    void convert()
    {
        String hexa = Integer.toHexString(num);
        System.out.println("Hexadecimal Value is:    "+hexa);
    }
}
public class Binay_To_Hex {
    public static void main(String[] args) {
        BToX obj = new BToX();
        obj.getVal();
        obj.convert();
    }
}
