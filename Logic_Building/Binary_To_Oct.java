package Today_28Oct;
//Java Program to convert Binary to Octal

import java.util.Scanner;

class BToOct
{
    Scanner sc;
    int num;

    void getVal()
    {
        System.out.println("Binary to Octal ");
        sc= new Scanner(System.in);
        System.out.println("Enter the Binary number:  ");
        num = Integer.parseInt(sc.nextLine(), 2);
         }
         void convert()
         {
             String Octal = Integer.toOctalString(num);
             System.out.println("Octal value is:  "+Octal);
         }

}

public class Binary_To_Oct {
    public static void main(String[] args) {
        BToOct obj = new BToOct();
        obj.getVal();
        obj.convert();
    }
}
