package apps;

import java.util.Arrays;
import java.util.Scanner;
import utils.ArrayUtils;

/**
 * Exercise 3.2
 * Tests and demonstrates the deduplication methods.
 */
public class DeduplicationProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many grades do you want to enter? ");
        int size = input.nextInt();

        int[] grades = new int[size];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }

        System.out.println("\nOriginal Array:");
        System.out.println(Arrays.toString(grades));

        // Method 1: Array Growth
        int[] result1 = ArrayUtils.deduplicate(grades);

        System.out.println("\nUsing deduplicate():");
        System.out.println(Arrays.toString(result1));

        int removed1 = grades.length - result1.length;
        System.out.println("Duplicates removed: " + removed1);

        // Method 2: Blank Deletion
        int[] result2 = ArrayUtils.filterDuplicates(grades);

        System.out.println("\nUsing filterDuplicates():");
        System.out.println(Arrays.toString(result2));

        int removed2 = grades.length - result2.length;
        System.out.println("Duplicates removed: " + removed2);

        // Method 3: Sorted Deduplication
        int[] sorted = Arrays.copyOf(grades, grades.length);
        Arrays.sort(sorted);

        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(sorted));

        int[] result3 = ArrayUtils.sortedDeduplicate(sorted);

        System.out.println("\nUsing sortedDeduplicate():");
        System.out.println(Arrays.toString(result3));

        // Additional Tests

        System.out.println("\n--- Additional Tests ---");

        int[] repeated = {5, 5, 5, 5};
        System.out.println("Repeated Values:");
        System.out.println(Arrays.toString(
                ArrayUtils.deduplicate(repeated)));

        int[] noDuplicates = {1, 2, 3, 4};
        System.out.println("No Duplicates:");
        System.out.println(Arrays.toString(
                ArrayUtils.deduplicate(noDuplicates)));

        int[] single = {10};
        System.out.println("Single Value:");
        System.out.println(Arrays.toString(
                ArrayUtils.deduplicate(single)));

        int[] empty = {};
        System.out.println("Empty Array:");
        System.out.println(Arrays.toString(
                ArrayUtils.deduplicate(empty)));

        input.close();
    }
}