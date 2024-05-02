import java.util.Scanner;
public class week3_QN_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the alphabet
        System.out.println("Enter an alphabet:");
        char alphabet = scanner.next().charAt(0);

        // Check if the alphabet is a vowel or a consonant
        boolean isVowel = false;

        // Convert the alphabet to lowercase for simplicity
        char lowercaseAlphabet = Character.toLowerCase(alphabet);

        // Check if the alphabet is a vowel
        if (lowercaseAlphabet == 'a' || lowercaseAlphabet == 'e' || lowercaseAlphabet == 'i'
                || lowercaseAlphabet == 'o' || lowercaseAlphabet == 'u') {
            isVowel = true;
        }

        // Display the result
        if (isVowel) {
            System.out.println(alphabet + " is a vowel.");
        } else {
            System.out.println(alphabet + " is a consonant.");
        }

        scanner.close();
    }
}
