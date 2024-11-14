package Today_14Nov;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Series82 {
    public static void main(String[] args)
    {
        //Function to calculate and display the sum of the series
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n;
        try
        {
            System.out.println("Enter the number of terms in the series:   ");
            n = Integer.parseInt(br.readLine());
        }catch(Exception e)
        {
            System.out.println("An error Occurred");
            return;
        }
        double sum=0;
        double i;
        int j;
        long fac;
        for(i=1; i<=n; i++)
        {
            fac = 1;
            for(j=2; j<=i; j++)
            {
                fac *=j;
            }
            sum +=(1.0d/fac);
        }
        System.out.println("The sum is "+sum);
    }
}
