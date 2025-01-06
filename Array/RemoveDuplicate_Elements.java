package Array;
import java.util.HashSet;
import java.util.Scanner;
//
public class RemoveDuplicate_Elements {
      static int removeDuplicates(int[] arr)
      {
           //To track seen elements
          HashSet<Integer> s = new HashSet<>();
          //To maintain the new size of the array
          int idex=0;
          for (int i = 0; i < arr.length; i++) {
              if (!s.contains(arr[i])) {
                  s.add(arr[i]);
                  arr[idex++] = arr[i];
              }
          }
          // Return the size of the array
          // with unique elements
          return idex;
      }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        // Get the array elements from the user
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        // Call the removeDuplicates method
        int newSize = removeDuplicates(arr);

        // Print the unique elements of the array
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
