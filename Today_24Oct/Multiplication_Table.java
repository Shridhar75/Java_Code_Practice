package Today_24Oct;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+ " * " + i + " = " + num * i);
        }
    }
}
