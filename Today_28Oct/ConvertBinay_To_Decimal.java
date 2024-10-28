//Java Program convert Binary number system to Decimal
package Today_28Oct;

import java.util.Scanner;
class Binary_Decimal
{
    Scanner sc;
    int num;
    void getVal()
    {
        System.out.print(" Convert number Binary to Decimal...");
        sc = new Scanner(System.in);
        System.out.println("\n Enter any number: ");
        num = Integer.parseInt(sc.nextLine(), 2);
    }
    void convert()
    {
        String decimal = Integer.toString(num);
        System.out.println(" Decimal Value is " +decimal);
    }
}
public class ConvertBinay_To_Decimal {
    public static void main(String[] args) {
        Binary_Decimal sc = new Binary_Decimal();
        sc.getVal();
        sc.convert();

    }
}