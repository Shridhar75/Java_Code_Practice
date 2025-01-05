package Today_3Nov;

import java.util.Scanner;
/*
Write a java program to below pattern
Enter the number of rows you want to print: 8
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
7 6 5 4 3 2 1
8 7 6 5 4 3 2 1
*/
public class NumberPattern_Seven {
    public static void main(String[] args)
    {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        n=sc.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=i; j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
