package apps;

import java.util.Scanner;
import java.util.Arrays;
import utils.ArrayUtils;

public class StringMerging {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] text1 = new String[5];
        String[] text2 = new String[5];

        System.out.println("Enter 5 words for the first array:");
        for (int i = 0; i < text1.length; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            text1[i] = input.nextLine();
        }

        System.out.println("\nEnter 5 words for the second array:");
        for (int i = 0; i < text2.length; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            text2[i] = input.nextLine();
        }

        // Sort both arrays alphabetically
        Arrays.sort(text1, String.CASE_INSENSITIVE_ORDER);
        Arrays.sort(text2, String.CASE_INSENSITIVE_ORDER);

        // Merge sorted arrays using your orderedMerge(String[], String[])
        String[] merged = ArrayUtils.orderedMerge(text1, text2);

        System.out.println("\nMerged Sorted Words:");
        for (int i = 0; i < merged.length; i++) {
            System.out.println("Position " + (i + 1) + ": " + merged[i]);
        }

        input.close();
    }
}

