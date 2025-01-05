package Today_26Oct;

import java.util.Scanner;

public class User_Authentication {
    public static void main(String[] args) {
        int password=143;

        System.out.print("If you want to enter your system then please enter your password: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter your password:  ");
        password =sc.nextInt();
       if(password == 143)
       {
           System.out.println("Welcome to your system...");
       }
       else {
           System.out.println("Please enter correct password...");
           System.out.println(" ");
       }

    }
}
