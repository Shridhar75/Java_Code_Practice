package Today_11Nov;

import java.util.Scanner;
/*
If size = 5, the output will be:
A A A A A
A            A
A            A
A            A
A A A A A

 */
public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square (minimum 2): ");
        int size = scanner.nextInt();
        scanner.close();

        char ch = 'A';

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Print border characters for the first and last rows and columns
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print(ch + " ");
                } else {
                    System.out.print("  "); // Print spaces for the hollow part
                }
            }
            System.out.println();
        }
    }
}
