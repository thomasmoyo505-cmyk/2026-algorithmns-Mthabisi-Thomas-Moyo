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

        //Get the original size
        int originalSize = text.length;

        //Create the new array with the requested size
        String[] resized = new String[newSize];

        //Decide how many elements to copy
        int elementsToCopy;

        if (newSize < originalSize) {
            elementsToCopy = newSize;   // copy fewer elements
        } else {
            elementsToCopy = originalSize; // copy all elements
        }

        //Copy elements manually
        for (int i = 0; i < elementsToCopy; i++) {
            resized[i] = text[i];
        }

        //Return the resized array
        return resized;
    }
}

