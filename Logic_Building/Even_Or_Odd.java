package Today_23Oct;

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       System.out.print(" Enter any number:   ");
        int  num = sc.nextInt();
         if(num==0)
        {
            System.out.println(num+ "  is neither Even nor Odd");
        }
         else if(num%2==0)
         {
             System.out.print(num +  "   is even number");
         }
        else
         {
            System.out.println(num+  "   is Odd number");
        }

    }
}
