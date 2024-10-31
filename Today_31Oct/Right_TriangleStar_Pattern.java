//Write a java program to print right triangle star pattern
/*

 *
 **
 ***
 ****
 *****
 ******
 *******
 ********
 *********

 */
package Today_31Oct;
import java.util.Scanner;
public class Right_TriangleStar_Pattern {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number of rows which you want to print: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        //Inner loop
        for(int i=0;i<=n;i++)
        {
            //Outer loop
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
