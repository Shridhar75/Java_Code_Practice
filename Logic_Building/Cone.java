package Today_17Nov;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Java Program to Find Volume and Surface Area of Cone
/*
Surface Area = (PI * radius * slant height) + (PI * radius2).
Volume = PI * radius2 * height/3.
*/
public class Cone {
    // Function to calculate and print the surface area and volume of a cone
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double radius,height;
        System.out.println("Enter the radius and  height of the right circular cone");
        try{
            radius=Double.parseDouble(br.readLine());
            height=Double.parseDouble(br.readLine());
        }catch (Exception e){
            System.out.println("An error occurred");
            return;
        }
        if(radius<=0 || height<=0){
            System.out.println("Wrong Input");
            return;
        }
        double slantheight = Math.sqrt(Math.pow(radius,2) + Math.pow(height,2));
        System.out.println("Volume = " + (Math.PI*Math.pow(radius,2)*height/3));
        System.out.println("Surface area = " + ((Math.PI*radius*slantheight)
                + (Math.PI*radius*radius)));
    }
}
