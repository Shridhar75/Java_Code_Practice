package Today_5Nov;
/*
Write a java program to print below pattern
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

 */
public class NumberPattern_Seventeen {
    public static void main(String[] args) {
        int i, j, rows=9;
        for (i = 1; i <= rows; i++)
        {
//Prints first half of the row
            for (j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
//Prints second half of the row
            for (j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
