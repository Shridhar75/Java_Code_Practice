package Today_11Nov;
/*
Write a java program to print below pattern
A B C D E F G H I
A B C D E F G H
A B C D E F G
A B C D E F
A B C D E
A B C D
A B C
A B
A
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
public class KShapeAlphabet_Number {
    public static void main(String[]args)
    {
        for(int i=8; i>=0; i--)
        {
            int alphabet = 65;
            for(int j=0; j<=i; j++)
            {
                System.out.print((char) (alphabet +j)+" ");
            }
            System.out.println();
        }
        for(int i=0; i<=8; i++)
        {
            int alphabet = 65;
            for(int j=0; j<=i; j++)
            {
                System.out.print((char) (alphabet + j) +" ");
            }
            System.out.println();
        }
    }
}
