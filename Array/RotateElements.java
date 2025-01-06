package Array;

    import java.util.Scanner;
public class RotateElements {
         // Function to right rotate array by d positions
        static void rotateArr(int[] arr, int d) {
            int n = arr.length;

            // Repeat the rotation d times
            for (int i = 0; i < d; i++) {

                // Right rotate the array by one position
                int last = arr[n - 1];
                for (int j = n - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = last;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the size of the array
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            // Initialize the array
            int[] arr = new int[size];

            // Input the elements of the array
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            // Input the number of positions to rotate
            System.out.print("Enter the number of positions to rotate: ");
            int d = scanner.nextInt();

            // Rotate the array
            rotateArr(arr, d);

            // Print the rotated array
            System.out.println("Array after right rotation:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }


