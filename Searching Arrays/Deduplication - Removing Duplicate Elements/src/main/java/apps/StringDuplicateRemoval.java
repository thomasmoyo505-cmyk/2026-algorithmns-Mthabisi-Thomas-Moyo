package apps;
package apps;

import java.util.Scanner;
import utils.StringUtilities;

public class StringDuplicateRemoval {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String[] filtered = StringUtilities.deduplicate(words);

        System.out.println("\nWithout duplicates:");

        for (int i = 0; i < filtered.length; i++) {
            System.out.print(filtered[i] + " ");
        }

        scanner.close();
    }
}
