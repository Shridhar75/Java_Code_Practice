//Write a java program to print right down mirror star pattern
/*

                 ********
                 *******
                 ******
                 *****
                 ****
                 ***
                 **
                *

 */
package Today_31Oct;
import java.util.Scanner;
public class RightDown_MirrorStar_Pattern {
    public static void main(String[] args) {
        int rows;
        System.out.println("Enter rows which you want:  ");
        Scanner sc = new Scanner(System.in);
          rows=sc.nextInt();
          for(int  i=rows;  i>=1; i--)
          {
              for(int j=rows; j>i ; j--)
              {
                  System.out.print(" ");
              }
              for(int k=1; k<=i; k++)
              {
                  System.out.print("*");
              }
              System.out.println("");
          }

    }
}
