package Today_3Dec;
//Java Program to Find a Pair of Elements with the Given Difference
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PairsHavingGivenDifference {
    //Function to print pair of elements having a given difference.
    static void printPairs(int[] array,int difference){
        HashMap<Integer,Integer> obj=new HashMap<>();
        int i;
        for(i=0;i<array.length;i++){
            obj.put(i,array[i]);
        }
        System.out.println("The pairs of elements having the difference "
                +difference+" are ");
        int search;
        for (i=0;i<array.length;i++){
            search=array[i]+difference;
            if(obj.containsValue(search)){
                System.out.println(array[i] + " and "+search);
            }
        }
    }
    // Function to read input
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the size of the array");
        try{
            size=Integer.parseInt(br.readLine());
        }
        catch(IOException e)
        {
            System.out.println("Invalid Input");
            return;
        }
        int[] array=new int[size];
        System.out.println("Enter array elements");
        int i;
        for(i=0;i<array.length;i++){
            try{
                array[i]=Integer.parseInt(br.readLine());
            }
            catch(IOException e)
            {
                System.out.println("Invalid element. Enter it again");
                i--;
            }
        }
        int difference;
        System.out.println("Enter the difference you want to look for");
        try{
            difference=Integer.parseInt(br.readLine());
        }
        catch(IOException e)
        {
            System.out.println("Invalid Input");
            return;
        }
        printPairs(array,difference);
    }
}