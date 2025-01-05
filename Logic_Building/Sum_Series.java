package Today_14Nov;
//Write a java program to find sum of series 1/1!   +  2/2!  +  3/3! + ....+N/N!1/1!   +  2/2!  +  3/3! + ....+N/N!
import java.util.Scanner;

public class Sum_Series {
    public static void main(String[] args) {
        double sum = 0;
        int n;
        System.out.println("1/1!   +  2/2!  +  3/3! + ....+N/N!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms inn series...");
        n = sc.nextInt();

        Sum_Series ob = new Sum_Series();
        for (int i = 1; i <= n; i++) {
            sum = sum + (double) i / (ob.fact(i));
        }
        System.out.println("Sum of series : " + sum);
    }
    int fact(int x)
    {
        int mul = 1;
        while(x>0)
        {
            mul = mul * x;
            x--;
        }
        return mul;
    }
}
