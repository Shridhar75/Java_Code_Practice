package Today_2Nov;
/* Write a java program to print below pattern
Enter number of rows which you want to print:  9
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9

 */


import java.util.Scanner;
public class NumberPattern_Five {
    public static void main(String[] args) {
        int i, j, rows;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows which you want to print:  ");
        rows = sc.nextInt();

        for(i=1; i<=rows; i++)
        {
            for(j=1 ; j<=i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
