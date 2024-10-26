package Today_26Oct;

import java.util.Scanner;

//Working of ATM machine
public class Working_Of_ATM {
    public static void main(String[] args) {
        int balance=500000, withdraw, deposite;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Automatted trailer machine");
            System.out.println("Chose 1 for Check Balance");
            System.out.println("Chose 2 for  Withdraw");
            System.out.println("Chose 3 for Deposit ");
            System.out.println("Chose  4  for Exit");
            System.out.println("  ");
            System.out.print("Chose a option to perform operation: ");
            int n =sc.nextInt();

            switch(n)
            {
                case 1: System.out.println("Balance : "+balance);
                System.out.println("");
                break;

                case 2:
                    System.out.print("Enter money to withdraw:  ");
                    withdraw = sc.nextInt();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.print("Please collect your money... ");
                         System.out.println(" ");
                        System.out.println("Your account balance is: "+balance);
                    }
                    else{
                        System.out.print("Insufficient balance...");
                    }
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.print("Enter money to deposit: ");
                    deposite = sc.nextInt();
                    balance = balance + deposite;
                    System.out.print("Your money succssfully deposite ....");
                    System.out.println(" ");
                    System.out.println("Your account balance is : "+balance);
                    System.out.println(" ");


                    break;

                case 4:
                    System.exit(0);


            }
        }
    }
}
