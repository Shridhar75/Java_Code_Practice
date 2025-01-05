package Today_5Nov;
/* Write a java program to print below pattern
11111111
11111122
11111333
11114444
11155555
11666666
17777777
88888888

 */
public class NumberPattern_Twenty {
    public static void main(String[] args)
    {
        int rows=8;
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= rows-i; j++)
            {
                System.out.print(1);
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
