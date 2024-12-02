package Today_2Dec;
//Java Program to Increment All Elements of an Array by One
import java.util.Scanner;
public class Increment_Array {
    public static void main(String[] args)
    {
        int n,  i=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            a[i]++;
        }
        System.out.print("Elements of array after increment by 1:");
        for(i = 0; i < n - 1; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n-1]);
    }
}
