package Today_27Oct;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        int m,n, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter anu number: ");
        m= sc.nextInt();
        while(m>0)
        {
            n = m%10;
            sum = sum * 10  + n;
            m=m/10;
          }
        System.out.println("Reverse of number is:  "+sum);
    }
}
