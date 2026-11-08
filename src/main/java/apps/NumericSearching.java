package apps;

import java.util.Arrays;
import java.util.Scanner;
import utils.NumberUtilities;

public class NumericSearching {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int size = scanner.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();

        }

        Arrays.sort(nums);

        System.out.println("\nSorted Array:");

        for (int number : nums) {
            System.out.print(number + " ");
        }

        System.out.print("\n\nEnter value to find: ");
        int value = scanner.nextInt();

        long startTime = System.nanoTime();

        int position = NumberUtilities.binarySearch(nums, value);

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