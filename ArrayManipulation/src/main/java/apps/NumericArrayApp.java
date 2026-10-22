package apps;

import utils.ArrayUtils;
import java.util.Scanner;
import java.util.Arrays;

public class NumericArrayApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Ask the user how large they want their array
        System.out.print("STEP 1: How large would you like your array? ");
        int size = input.nextInt();

        //Create the array with the chosen size
        int[] numbers = new int[size];
        int count = 0; // how many numbers have been added

        System.out.println("STEP 2: Created an array with " + size + " slots.");

        //Fill the array with user numbers
        while (count < numbers.length) {
            System.out.print("Enter a number: ");
            numbers[count] = input.nextInt();
            count++;
        }

        System.out.println("STEP 3: The array is now full.");

        //Ask if the user wants to add more numbers
        System.out.print("STEP 4: Do you want to add more numbers? (yes/no): ");
        String answer = input.next();

        //If yes, grow the array and continue adding numbers
        while (answer.equalsIgnoreCase("yes")) {

            System.out.println("Growing the array by 10 slots...");
            numbers = ArrayUtils.expandArray(numbers);

            System.out.println("New array size: " + numbers.length);

            // Fill the new slots
            while (count < numbers.length) {
                System.out.print("Enter a number: ");
                numbers[count] = input.nextInt();
                count++;
            }

            System.out.println("The array is full again.");

            System.out.print("Do you want to add more numbers? (yes/no): ");
            answer = input.next();
        }

        //Print the final array nicely
        System.out.println("\nSTEP 6: Final array contents:");
        System.out.println(Arrays.toString(numbers));

        System.out.println("Program finished.");
    }
}
