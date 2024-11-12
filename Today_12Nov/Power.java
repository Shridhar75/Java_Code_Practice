package Today_12Nov;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int x;
        double y, z;
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y =  Math.pow(x, 2);
        z = Math.pow(x, 3);
        System.out.println("Square of : " +x+ ":  "+y);
        System.out.println("Cube of :   " +x+ ": "+z);

    }
}
