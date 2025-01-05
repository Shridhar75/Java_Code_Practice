package Array;

import java.util.Scanner;

//Write a java program to find sum  of array elemet
public class SumOfArray_Element {
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter "+ size + " integers: ");
        for(int i=0;  i<size; i++)
        {
            numbers[i] = sc.nextInt();
        }

        // Call the method to calculate the sum\
        int sum = calculateSum(numbers);
        System.out.println("Sum of array elements: " + sum);
    }
    }


