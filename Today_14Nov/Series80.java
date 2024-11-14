package Today_14Nov;
//Java program to find the sum of the series 1/1+1/2+1/3...1/N
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Series80 {
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        try
        {
            System.out.println("Enter the number of terms in the series: ");
            n= Integer.parseInt(br.readLine());

        }catch(Exception e)
        {
            System.out.println("An error Occurred");
            return;
        }
        double sum=0;
        double i;
        for(i=1; i<=n; i++)
        {
            sum +=(1/i);
        }
        System.out.println("The sum is "+sum);
    }
}
