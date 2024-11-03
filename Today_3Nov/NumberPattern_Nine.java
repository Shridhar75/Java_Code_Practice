package Today_3Nov;
/*Write a java program to print below pattern
1
10
101
1010
10101
101010
1010101
10101010
101010101
 */
public class NumberPattern_Nine {
    public static void main(String[] args)
    {
        int i,  j, rows=9;

        for(i=1; i<=rows; i++)
        {
            for(j=1; j<=i; j++)
            {
                if(j%2==0)
                {
                    System.out.print(0);
                }
                else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
