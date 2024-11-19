package Today_18Nov;

import java.util.Scanner;

public class Area_Perimeter {
    public static void main(String[] args)
    {
        int l, b, perimeter, area;
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter length of rectangle: ");
         l=sc.nextInt();
         System.out.print("Enter brdth of rectangle: ");
         b = sc.nextInt();
         perimeter = 2 * (l+b);
         System.out.println("Perimeter of rectangle: "+perimeter);
         area = l * b;
        System.out.println("Area of rectangle: "+area);
    }
}
