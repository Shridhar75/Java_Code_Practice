package Today_6Nov;
/* Write a java program to print repetating pattern
A
B   B
C   C   C
D    D   D   D
E    E    E    E   E
F    F    F    F   F   F
G   G   G    G    G   G   G
H   H   H     H   H   H    H   H
I     I     I      I      I     I      I      I    I
J    J    J    J     J    J     J     J    J    J
 */
public class CharacterPattern_Two {
    public static void main(String[] args)
    {
        char letter = 'A';

        for (int i = 1; i <= 10; i++) {
            // Print leading spaces for alignment
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }

            // Print letters with spaces between them
            for (int k = 1; k <= i; k++) {
                System.out.print(letter + "   ");
            }

            System.out.println(); // Move to the next line
            letter++; // Move to the next letter in the alphabet
        }
    }
}
