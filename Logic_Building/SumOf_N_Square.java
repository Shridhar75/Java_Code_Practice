package Today_27Oct;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumOf_N_Square {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter the value of n");
        try{
            n = Integer.parseInt(br.readLine());
        }catch (Exception e){
            System.out.println("An error occurred");
            return;
        }
        if(n<0){
            System.out.println("n cannot take negative values");
            return;
        }
        double sum = n*(n+1)*(2*n+1)/6;
        System.out.println("The sum of first " + n + " squared numbers is " + sum);
    }
    }

