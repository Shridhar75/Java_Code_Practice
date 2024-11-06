package Today_6Nov;
/* Write a program to print  Right triangle alphabetic pattern
A
A B
A B C
A B C D
A B C D E
A B C D E F
A B C D E F G
A B C D E F G H
A B C D E F G H I

 */
public class CharacterPattern_One {
    public static void main(String[] args)
    {
        int alphabet=65; //ASCII value of capital A is 65;
        //Inner loop for rows
        for(int i=0; i<=8; i++)
        {
            //Outer loop for columns
            for(int j=0; j<=i; j++)
            {
                //Adds the value of j in the ASCII value of A and prints corresponding alphabet.
                System.out.print((char) (alphabet +j) +" ");
            }
            System.out.println();
        }
    }
}
