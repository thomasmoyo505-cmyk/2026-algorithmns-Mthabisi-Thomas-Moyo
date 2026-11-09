package utils;
/**
 * ArrayUtils
 * Utility class containing methods for resizing arrays.
 */
public class ArrayUtils {

    /**
     * Exercise 1.1
     * Creates a new integer array that is 10 elements larger
     * than the original array and copies all values into it.
     *
     * @param nums The original integer array
     * @return A new array that is 10 elements larger
     */
    public static int[] grow(int[] nums) {
        int[] newArray = new int[nums.length + 10];

        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[i];
        }

        return newArray;
    }

    /**
     * Exercise 1.2
     * Creates a new String array of the requested size and
     * copies the appropriate number of elements from the
     * original array.
     *
     * @param text The original String array
     * @param newSize The size of the new array
     * @return The resized array
     */
    public static String[] resize(String[] text, int newSize) {
        String[] newArray = new String[newSize];

        int limit;

        if (newSize < text.length) {
            limit = newSize;
        } else {
            limit = text.length;
        }

        for (int i = 0; i < limit; i++) {
            newArray[i] = text[i];
        }

        return newArray;
    }
}