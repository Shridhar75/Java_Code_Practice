package Today_2Nov;

import java.util.Scanner;

/*
Write a java program to print below pattern
Enter number of line which you want:  7
                 1
               1   1
             1   2   1
           1   3   3   1
         1   4   6   4   1
       1   5  10  10   5   1
     1   6  15  20  15   6   1
*/
public class NumberPattern_Three {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter number of line which you want:  ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");

            for (int j = 0; j <= i; j++)
            {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

