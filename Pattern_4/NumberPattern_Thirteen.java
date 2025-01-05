package Today_4Nov;
/* Write a java program to print below pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
public class NumberPattern_Thirteen {
    public static void main(String[] args)
    {
        int rows=8;
        //Print upper half pattern
        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //Prints lower half pattern
        for(int i=rows-1; i>=1; i--)
        {
            for(int j=1 ;j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
