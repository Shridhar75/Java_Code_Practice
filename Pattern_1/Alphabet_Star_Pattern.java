package Today_1Nov;
//Java program to print pattern B
public class Alphabet_Star_Pattern {
    public static void main(String[] args) {
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height / 2; j++) {
                if (i == 0 || i == height - 1 || i == height / 2 || j == 0 || j == height / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*        int i, j, n=4;
// Outer for loop for number of lines
        for (i = 0; i<=n; i++)
        {
// Inner for loop for logic execution
            for (j = 0; j<= n / 2; j++)
            {
// prints two vertical lines
                if ((j == 0 || j == n / 2) && i != 0 ||
// print first line of alphabet
                        i == 0  && j != n / 2 ||
// prints middle line
                        i == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
*/