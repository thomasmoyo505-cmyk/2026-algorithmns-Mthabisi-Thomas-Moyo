package org.example;
import java.util.Scanner;

public class InputUtility {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Gets a valid integer from the user.
     * If the user enters something that is not a number,
     * they will be informed and asked to try again using the same prompt.
     *
     * @param prompt The message shown to the user.
     * @return A valid integer entered by the user.
     */
    public static int getValidInteger(String prompt) {

        while (true) {

            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }

    /**
     * Gets a valid integer from the user within a specified range.
     * If the user enters a value that is not a number, or enters
     * a value outside the allowed range, they will be informed and
     * asked to try again. The range is inclusive.
     *
     * @param prompt The message shown to the user.
     * @param min The minimum allowed value.
     * @param max The maximum allowed value.
     * @return A valid integer within the specified range.
     */
    public static int getValidInteger(String prompt, int min, int max) {

        while (true) {

            System.out.print(prompt);

            if (scanner.hasNextInt()) {

                int number = scanner.nextInt();

                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.out.println("Number must be between "
                            + min + " and " + max + ".");
                }

            } else {

                System.out.println("Invalid input. Please enter a number.");
                scanner.next();

            }
        }
    }
}
