package Today_29Oct;

import java.util.Scanner;

public class Integer_to_binary {
    public static void main(String[] args) {
        int n, m;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Decimal Number:");
        n = s.nextInt();
        while(n > 0)
        {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        System.out.println(x);
    }
}
