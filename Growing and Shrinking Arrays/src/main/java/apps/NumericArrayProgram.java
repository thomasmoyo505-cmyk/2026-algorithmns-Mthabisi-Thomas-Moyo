package apps;
import java.util.Scanner;

/**
 * Exercise 1.3
 * Uses the grow() method to increase the size
 * of an integer array when it becomes full.
 */
public class NumericArrayProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How large would you like your array? ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        int count = 0;
        String answer;

        do {

            while (count < numbers.length) {
                System.out.print("Enter a number: ");
                numbers[count] = input.nextInt();
                count++;
            }

            System.out.print("Array is full. Add more numbers? (yes/no): ");
            answer = input.next();

            if (answer.equalsIgnoreCase("yes")) {
                numbers = ArrayUtils.grow(numbers);
            }

        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("\nContents of the array:");

        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}