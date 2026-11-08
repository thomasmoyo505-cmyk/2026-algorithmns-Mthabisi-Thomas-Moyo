package apps;
package apps;

import java.util.Scanner;
import java.util.Arrays;
import utils.NumberUtilities;

public class NumberDuplicateRemoval {

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

        int[] filtered = NumberUtilities.sortedDeduplicate(nums);

        System.out.println("\nOriginal array (sorted):");

        for (int number : nums) {
            System.out.print(number + " ");
        }

        System.out.println("\n\nWithout duplicates:");

        for (int number : filtered) {
            System.out.print(number + " ");
        }

        System.out.println("\n\nDuplicates removed: "
                + (nums.length - filtered.length));

        scanner.close();
    }
}