package Today_31Oct;
import java.util.Scanner;
public class LeftPascals_Tringle_Pattern {
    public static void main(String[] args) {
         int i, j, k, rows;

         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print: ");
       rows = sc.nextInt();
       for(i=1; i<=rows; i++)
       {
           for(j=i; j<rows; j++)
           {
               System.out.print(" ");
           }
           for(k=1; k<=i; k++)
           {
               System.out.print("*");
           }
           System.out.println("");
       }
    for(i=rows; i>=1; i--)
    {
        for(j=i; j<=rows; j++)
        {
            System.out.print(" ");
        }
        for(k=1; k<i; k++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    sc.close();

    }
}
