package Today_14Nov;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Series81 {
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int n;
        try
        {
            System.out.println("Enter the number of the terms in the series");
            n = Integer.parseInt(br.readLine());
        }catch(Exception e)
        {
            System.out.println("Error Occurred");
             return;
        }
        double sum=0;
        double i;
        for(i=1; i<=n; i++)
        {
            sum +=(1/Math.pow(i,2));
        }
        System.out.println("The sum is  "+sum);
    }
}
