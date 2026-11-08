package utils;

public class ArrayUtils {

    public static int[] expandArray(int[] nums) {
        int originalSize = nums.length;
        int increaseAmount = 10;
        int newSize = originalSize + increaseAmount;

        int[] expanded = new int[newSize];

        for (int index = 0; index < originalSize; index++) {
            int currentValue = nums[index];
            expanded[index] = currentValue;
        }

        return expanded;
    }

    // -------------------------------
    // Exercise 1.2 - Resize String array
    // -------------------------------
    public static String[] resize(String[] text, int newSize) {

        int originalSize = text.length;
        String[] resized = new String[newSize];

        int elementsToCopy;

        if (newSize < originalSize) {
            elementsToCopy = newSize;
        } else {
            elementsToCopy = originalSize;
        }

        for (int i = 0; i < elementsToCopy; i++) {
            resized[i] = text[i];
        }

        return resized;
    }

    // -------------------------------
    // Exercise 2.1 - Merge two int arrays (unsorted)
    // -------------------------------
    public static int[] merge(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i];
        }

        return merged;
    }

    // -------------------------------
    // Exercise 2.3 - Merge two sorted int arrays (ascending)
    // -------------------------------
    public static int[] orderedMerge(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        return merged;
    }

    // -------------------------------
    // Exercise 2.5 - Merge two sorted String arrays (ascending, ignore case)
    // -------------------------------
    public static String[] orderedMerge(String[] text1, String[] text2) {

        String[] merged = new String[text1.length + text2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < text1.length && j < text2.length) {
            if (text1[i].compareToIgnoreCase(text2[j]) <= 0) {
                merged[k] = text1[i];
                i++;
            } else {
                merged[k] = text2[j];
                j++;
            }
            k++;
        }

        while (i < text1.length) {
            merged[k] = text1[i];
            i++;
            k++;
        }

        while (j < text2.length) {
            merged[k] = text2[j];
            j++;
            k++;
        }

        return merged;
    }

    // -------------------------------
    // Exercise 3.1 - Partition numeric array using pivot
    // -------------------------------
    public static int[] partition(int[] nums, int pivot) {

        int[] lower = new int[nums.length];
        int[] higher = new int[nums.length];

        int lowerIndex = 0;
        int higherIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= pivot) {
                lower[lowerIndex] = nums[i];
                lowerIndex++;
            } else {
                higher[higherIndex] = nums[i];
                higherIndex++;
            }
        }

        reverseArray(lower);
        reverseArray(higher);

        int[] merged = merge(higher, lower);

        return merged;
    }

    private static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // -------------------------------
    // Exercise 3.3 - Partition String array using pivot
    // -------------------------------
    public static String[] partition(String[] text, String pivot) {

        String[] lower = new String[text.length];
        String[] higher = new String[text.length];

        int lowerIndex = 0;
        int higherIndex = 0;

        // Partition the data
        for (int i = 0; i < text.length; i++) {
            if (text[i].compareToIgnoreCase(pivot) <= 0) {
                lower[lowerIndex] = text[i];
                lowerIndex++;
            } else {
                higher[higherIndex] = text[i];
                higherIndex++;
            }
        }

        // Merge back in ascending order using your orderedMerge(String[], String[])
        String[] merged = orderedMerge(lower, higher);

        return merged;
    }
}




