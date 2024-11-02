package Today_2Nov;
/*  Write a java program to print below pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */
import java.util.Scanner;
public class NumberPatter_One {
    public static void main(String[] args) {
        int i, j, number, n;
        System.out.print("Enter number of line which you want to print:  ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        //loop for rows
        for(i=0; i<n; i++)
        {
            number=1;
//loop for columns
            for(j=0; j<=i; j++)
            {
//prints num
                System.out.print(number+ " ");
//incrementing the value of number
                number++;
            }
//throws the cursor at the next line after printing each row
            System.out.println();
        }
    }
}

