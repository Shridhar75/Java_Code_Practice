package Today_30Oct;
/*    Pyramid Star Pattern
                *
            *     *
         *    *    *
    *    *    *     *
*   *     *     *   *



 */
public class Pattern_Three {
    public static void main(String[] args) {
        // i for rows and j for columns
        //row denotes the number of rows want to print
        int i, j, row = 5;
        //Outer loop work for rows
        for (i = 0; i < row; i++) {
            //inner loop work for space
            for (i = 0; i < row; i++) {
                //inner loop work for space
                for (j = row - i; j > 1; j--) {
                    //print space between two stars
                    System.out.print(" ");
                }
                //inner loop for columns
                for (j = 0; j <= i; j++) {
                    //prints star
                    System.out.print("* ");
                }
                //throws the cursor in a new line after printing each line
                System.out.println();
            }
        }
    }
}
