package Today_2Nov;
/* Write a java program to print below pattern
  1
  212
 32123
4321234
 32123
  212
   1
    */

public class NumberPattern_Four {
    public static void main(String[] args) {
        int n = 4;
        // Top half of the pattern
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // Print decreasing sequence
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }

                // Print increasing sequence
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }

                // Move to the next line
                System.out.println();
            }

            // Bottom half of the pattern
            for (int i = n - 1; i >= 1; i--) {
                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // Print decreasing sequence
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }

                // Print increasing sequence
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }

                // Move to the next line
                System.out.println();
            }
        }
    }
