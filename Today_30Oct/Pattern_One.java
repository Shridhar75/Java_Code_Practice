package Today_30Oct;
/* Right Triangle Star Pattern

*
*  *
*   *     *
*    *    *    *
//Logic
for(int i=0; i<row; i++)
{
for(int j=0; j<=i; j++)
{
System.out.print("* ");
}
System.out.println();
 */

public class Pattern_One {
    public static void main(String[] args) {
               //i for rows and j for columns  row denotes the number of rows you  want to print
        int  i , j ,row=5;
        //Outer loop for rows
        for(i=0;i<row; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            //throws the cursor in a new line after printing each line
            System.out.println();
        }

    }
}
