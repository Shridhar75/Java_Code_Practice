//Write a java program to print write pascal  triangle
/*

 *
 * *
 * * *
 * * * *
 * * * *
 * * *
 * *
 *

 */
package Today_31Oct;
import java.util.Scanner;
public class Right_PascalsTriangle_Pattern {
    public static void main(String[] args) {
        int i, j, rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows which you want to print:  ");
        rows = sc.nextInt();
        for (i = 0; i <= rows - 1; i++)
        {
            for (j = 0; j <= i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (i = rows-1; i >= 0; i--) {
            for (j = 0; j <= i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}