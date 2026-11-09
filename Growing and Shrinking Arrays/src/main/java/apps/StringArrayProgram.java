package apps;
import java.util.Scanner;

/**
 * Exercise 1.4
 * Uses the resize() method to grow and shrink a String array.
 */
public class StringArrayProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] words = new String[5];
        int count = 0;
        String answer;

        do {

            System.out.print("Do you want to enter a word? (yes/no): ");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {

                if (count == words.length) {
                    words = ArrayUtils.resize(words, words.length + 5);
                }

                System.out.print("Enter a word: ");
                words[count] = input.nextLine();
                count++;
            }

        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("\nOriginal Array:");

        for (int i = 0; i < count; i++) {
            System.out.println(words[i]);
        }

        System.out.print("\nHow many words do you want to keep? ");
        int keep = Integer.parseInt(input.nextLine());

        String[] newWords = ArrayUtils.resize(words, keep);

        System.out.println("\nNew Array:");

        for (int i = 0; i < newWords.length; i++) {
            if (newWords[i] != null) {
                System.out.println(newWords[i]);
            }
        }

        input.close();
    }
}
