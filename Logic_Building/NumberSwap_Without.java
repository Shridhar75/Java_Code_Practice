package Today_23Oct;

import java.util.Scanner;

//Swapping  without using third variable
public class NumberSwap_Without {
    public static void main(String[] args) {
        System.out.println("Enter the value of x and y");
        Scanner sc = new Scanner(System.in);
        /*Define variables*/
        int m= sc.nextInt();
        int s= sc.nextInt();
        System.out.println("before swapping numbers: "+m +" "+ s);


        /*Swapping without using third variable*/
        m = m + s;
        s = m - s;
        m = m - s;
        System.out.println("After swapping: "+m +"  " + s);
    }
}
