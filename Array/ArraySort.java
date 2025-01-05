package Array;
import java.util.Scanner;

//WAP to check given array is sorted or not

public class ArraySort {
     //Function that returns true if array is sorted in non-decreasing order
    static boolean arraySortedOrNot(int arr[], int n)
    {
        //Array has one or no element
        if(n==0 || n==1)
            return true;

        for(int i=1; i<n; i++){
            //Unsorted pair found
            if(arr[i-1]>arr[i])
                return false;
        }
        //No unsorted pair found
          return true;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter How many elements in array which you want: ");
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();

           //Create an array and take its elements as input
        int arr[]=new int[n];
        System.out.println("Enter "+n+"elements of the array: ");
        for(int i=0;i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        //Check if the array is sorted
        if(arraySortedOrNot(arr,n))
        {
          System.out.println("Yes, the array is sorted");
        }
        else {
            System.out.println("No, array is not sorted");
        }
        sc.close();
    }
}
