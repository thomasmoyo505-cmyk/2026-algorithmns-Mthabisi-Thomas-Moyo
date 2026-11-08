import java.util.Scanner;

public class CalcMax {

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

    /**
     * Finds and returns the largest of three numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @param num3 The third number.
     * @return The largest of the three numbers.
     */
    public static int findMax(int num1, int num2, int num3) {

        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }

    /**
     * Finds and returns the largest number in an array.
     *
     * @param numbers The array of numbers.
     * @return The largest number in the array.
     */
    public static int findMax(int[] numbers) {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }

        }

        return max;
    }

    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = getValidInteger("Enter first number: ");
        numbers[1] = getValidInteger("Enter second number: ");
        numbers[2] = getValidInteger("Enter third number: ");

        int largest = findMax(numbers);

        System.out.println("Largest number = " + largest);
    }
}