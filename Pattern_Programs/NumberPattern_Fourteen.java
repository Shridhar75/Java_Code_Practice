package Today_4Nov;
/* Write a java program to print below pattern
9 8 7 6 5 4 3 2 1
9 8 7 6 5 4 3 2
9 8 7 6 5 4 3
9 8 7 6 5 4
9 8 7 6 5
9 8 7 6
9 8 7
9 8
9
 */

public class NumberPattern_Fourteen {
    public static void main(String[] args)
    {
        int rows=9;
        for(int i=1; i<=rows;i++)
        {
            for(int j=rows; j>=i; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
