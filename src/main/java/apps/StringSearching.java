package apps;

import java.util.Arrays;
import java.util.Scanner;
import utils.StringUtilities;

public class StringSearching {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many words? ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[size];

        for (int i = 0; i < words.length; i++) {

            System.out.print("Word " + (i + 1) + ": ");
            words[i] = scanner.nextLine();

        }

        Arrays.sort(words);

        System.out.println("\nSorted Array:");

        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.print("\n\nEnter value to find: ");
        String value = scanner.nextLine();

        long startTime = System.nanoTime();

        int position = StringUtilities.binarySearch(words, value);

        long endTime = System.nanoTime();

        long timeTaken = endTime - startTime;

        System.out.println("Search took " + timeTaken + " nanoseconds");

        if (position == -1) {
            System.out.println("Value not found.");
        } else {
            System.out.println("Value found at position " + position);
        }

        scanner.close();
    }
}