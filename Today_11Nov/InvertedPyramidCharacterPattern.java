package Today_11Nov;

import java.util.Scanner;
/*
If startChar = E, the output will be:
A B C D E D C B A
 A B C D C B A
  A B C B A
   A B A
    A

 */
public class InvertedPyramidCharacterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character between A to Z: ");
        char startChar = scanner.next().charAt(0);
        scanner.close();

        int rows = startChar - 'A' + 1;

        for (int i = rows; i >= 1; i--) {
            // Print leading spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            // Print characters in the row
            char ch = 'A';
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

