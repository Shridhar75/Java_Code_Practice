package Today_11Nov;
/* Write a java program to print below TriangleCharacter_Pattern
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
public class TriangleCharacter_Pattern {
    public static void main(String[]args)
    {
        for(int i=0; i<=8; i++)
        {
            int alphabet = 65;
            for(int j=8; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++)
            {
                System.out.print((char)(alphabet+k)+" ");
            }
            System.out.println();
        }
    }
}
