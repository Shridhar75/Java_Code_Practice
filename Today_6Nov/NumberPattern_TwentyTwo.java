package Today_6Nov;
/* Write a java program to print below pattern
1 2 3 4 5 6 7 8 9
2 3 4 5 6 7 8 9 1
3 4 5 6 7 8 9 1 2
4 5 6 7 8 9 1 2 3
5 6 7 8 9 1 2 3 4
6 7 8 9 1 2 3 4 5
7 8 9 1 2 3 4 5 6
8 9 1 2 3 4 5 6 7
 */

public class NumberPattern_TwentyTwo {
    public static void main(String[] args)
    {
        int i, j, k, rows=9;
        for(i=1; i<rows; i++)
        {
            for(j=i; j<rows+1; j++)
            {
                System.out.print(j+" ");
            }
            for(k=1; k<i; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
