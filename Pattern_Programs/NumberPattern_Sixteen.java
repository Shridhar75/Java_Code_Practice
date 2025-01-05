package Today_5Nov;
/* Write a java program to print below pattern
7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
 */
public class NumberPattern_Sixteen {
    public static void main(String[] args) {
        int rows=7, i, j;
        for (i = rows; i >= 1; i--)
        {
            for (j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
