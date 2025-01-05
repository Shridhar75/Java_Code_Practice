package Today_13Nov;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ImplementCos_Function {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       double x;
       try
       {
           System.out.println("Enter the angle whose cosine is to be calculated in degrees: ");
           x = Double.parseDouble(br.readLine());
       }catch(Exception e)
       {
           System.out.println("An error Occurred");
           return;
       }
       double y;
       y = x * Math.PI/180;
       int n = 10;
       int i, j, fac;
       double cosine = 0;
       for(i=0; i<=n; i++)
       {
           fac = 1;
           for(j=2; j<=2*i; j++)
           {
               fac*=j;

           }
           cosine +=Math.pow(-1.0,i)*Math.pow(y, 2*i)/fac;

       }
       System.out.format("The cosine of " + x + " is %f", cosine);
    }
}
