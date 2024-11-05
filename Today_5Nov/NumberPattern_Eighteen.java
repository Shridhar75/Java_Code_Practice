package Today_5Nov;
/* Write a java program to print below pattern
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
 */
public class NumberPattern_Eighteen {
    public static void main(String[] args)
    {
        int i, j, rows=9;
//Prints upper half  pattern
        for (i = rows; i >= 1; i--)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
//Prints lower half  pattern
        for (i = 2; i <= rows; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
