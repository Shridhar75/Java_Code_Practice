package Array;

import java.util.HashSet;
import java.util.Scanner;

//Write a java program to find duplicate element in array
public class DuplicateElement {
    public static void findDuplicate(int[] array){
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int num: array){
            if(!seen.add(num)){// If add() returns false, it's a duplicate
                duplicates.add(num);
            }
        }
        if(duplicates.isEmpty()){
            System.out.println("No duplicate found");
        }else{
            for(int duplicate: duplicates){
                System.out.println(duplicate);
            }
        }
    }
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    //Get size of the array from the User
    System.out.print("enter the number of elements in the array: ");
    int n = sc.nextInt();
    //Initialize the array
   int  numbers [] = new int[n];

   //Get the array elements from the User
    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<n; i++)
    {
         numbers[i] = sc.nextInt();
    }
    //Find  and print duplicates
    System.out.println("Duplicate value in the array: ");
    findDuplicate(numbers);
    sc.close();
}
}
