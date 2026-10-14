package apps;

import java.util.Scanner;
import java.util.Arrays;
import utils.ArrayUtils;

public class NumberMerging {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums1 = new int[5];
        int[] nums2 = new int[5];

        System.out.println("Enter 5 numbers for the first array:");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            nums1[i] = input.nextInt();
        }

        System.out.println("\nEnter 5 numbers for the second array:");
        for (int i = 0; i < nums2.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            nums2[i] = input.nextInt();
        }

        // -------------------------------
        // Exercise 2.2 - Unsorted merge
        // -------------------------------
        int[] merged = ArrayUtils.merge(nums1, nums2);

        System.out.println("\nMerged Array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.println("Position " + (i + 1) + ": " + merged[i]);
        }

        // -------------------------------
        // Exercise 2.4 - Sorted merge
        // -------------------------------
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] mergedSorted = ArrayUtils.orderedMerge(nums1, nums2);

        System.out.println("\nMerged Sorted Array:");
        for (int i = 0; i < mergedSorted.length; i++) {
            System.out.println("Position " + (i + 1) + ": " + mergedSorted[i]);
        }

        input.close();
    }
}


