//Write a  java program to print reverse pyramid pattern.
/*

 * * * * * * * *
 * * * * * * *
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

 */


package Today_31Oct;
import java.util.Scanner;
public class Pattern_Riverse_Pyramid {
    public static void main(String[] args) {
        int rows;
        System.out.println("Enter number of rows which you want:  ");
        Scanner sc = new Scanner(System.in);
        rows=sc.nextInt();

        for(int i=0; i<=rows-1; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for(int k=0; k<=rows-1-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

}
