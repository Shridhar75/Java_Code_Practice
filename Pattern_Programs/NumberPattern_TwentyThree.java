package Today_6Nov;
/*Write a java program to print below pattern
Enter the value of n: 7
7 7 7 7 7 7 7 7 7 7 7 7 7
7 6 6 6 6 6 6 6 6 6 6 6 7
7 6 5 5 5 5 5 5 5 5 5 6 7
7 6 5 4 4 4 4 4 4 4 5 6 7
7 6 5 4 3 3 3 3 3 4 5 6 7
7 6 5 4 3 2 2 2 3 4 5 6 7
7 6 5 4 3 2 1 2 3 4 5 6 7
7 6 5 4 3 2 2 2 3 4 5 6 7
7 6 5 4 3 3 3 3 3 4 5 6 7
7 6 5 4 4 4 4 4 4 4 5 6 7
7 6 5 5 5 5 5 5 5 5 5 6 7
7 6 6 6 6 6 6 6 6 6 6 6 7
7 7 7 7 7 7 7 7 7 7 7 7 7
 */
import java.util.Scanner;

public class NumberPattern_TwentyThree {
    public static void main(String[] args)
    {
        int i, j, min, n;
        //n is the number up to you want to print.
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        //loop for upper left part
        for(i=1; i<=n; i++) {
            for (j = 1; j <= n; j++) {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }
            //Loop for upper right part
            for (j = n - 1; j >= 1; j--) {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }
            System.out.println();
        }
        //Loop for lower left part
        for(i=n-1; i>=1; i--)
        {
            for(j=1; j<=n; j++)
            {
                min =  i<j ? i:j;
                System.out.print(n-min+1+" ");
            }
            //Loop for lower right part
            for(j=n-1; j>=1; j--)
            {
                min = i<j ? i:j;
                System.out.print(n-min + 1 +" ");
            }
            System.out.println();
        }
    }
}
