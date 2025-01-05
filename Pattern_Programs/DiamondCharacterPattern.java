package Today_11Nov;

import java.util.Scanner;

public class DiamondCharacterPattern {
    public static void main(String[] args) {
        char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        int alphabetNumber = 0;
        String[] diamond = new String[26]; // Array of strings for the diamond pattern
        System.out.print("Enter a Character between A to Z: ");
        Scanner reader = new Scanner(System.in);

        try {
            char userAlphabet = reader.next("[A-Z]").charAt(0);

            // Find the index of the user-specified character in the alphabet array
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] == userAlphabet) {
                    alphabetNumber = i;
                    break;
                }
            }

            // Construct the diamond pattern
            for (int i = 0; i <= alphabetNumber; i++) {
                diamond[i] = "";

                // Add initial spaces
                for (int j = 0; j < alphabetNumber - i; j++) {
                    diamond[i] += " ";
                }

                // Add the alphabet character
                diamond[i] += alphabet[i];

                // Add spaces between letters if it's not 'A'
                if (alphabet[i] != 'A') {
                    for (int j = 0; j < 2 * i - 1; j++) {
                        diamond[i] += " ";
                    }
                    diamond[i] += alphabet[i];
                }

                // Print the first part of the diamond
                System.out.println(diamond[i]);
            }

            // Print the second part of the diamond in reverse
            for (int i = alphabetNumber - 1; i >= 0; i--) {
                System.out.println(diamond[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
