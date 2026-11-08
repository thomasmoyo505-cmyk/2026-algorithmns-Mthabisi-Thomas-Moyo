package apps;

import utils.ArrayUtils;
import java.util.Scanner;
import java.util.Arrays;

public class StringArrayApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Create an initial String array with a small size
        String[] words = new String[3];
        int count = 0;

        System.out.println("STEP 1: Starting the word entry program.");

        //Repeatedly ask the user if they want to enter a word
        System.out.print("Do you want to enter a word? (yes/no): ");
        String answer = input.next();

        while (answer.equalsIgnoreCase("yes")) {

            // If array is full, grow it
            if (count == words.length) {
                System.out.println("Array is full — growing the array by 10 slots...");
                words = ArrayUtils.resize(words, words.length + 10);
                System.out.println("New array size: " + words.length);
            }

            // Take in the new word
            System.out.print("Enter your word: ");
            words[count] = input.next();
            count++;

            // Ask again
            System.out.print("Do you want to enter another word? (yes/no): ");
            answer = input.next();
        }

        //Print the full array (only filled elements)
        System.out.println("\nSTEP 3: Final list of words entered:");
        System.out.println(Arrays.toString(words));

        //Ask how many words they want to keep
        System.out.print("\nSTEP 4: How many words do you want to keep? ");
        int keepAmount = input.nextInt();

        //Create a resized array using your resize() method
        String[] trimmedArray = ArrayUtils.resize(words, keepAmount);

        //Print the trimmed array
        System.out.println("\nSTEP 6: Trimmed array with only " + keepAmount + " words:");
        System.out.println(Arrays.toString(trimmedArray));

        System.out.println("\nProgram finished.");
    }
}
