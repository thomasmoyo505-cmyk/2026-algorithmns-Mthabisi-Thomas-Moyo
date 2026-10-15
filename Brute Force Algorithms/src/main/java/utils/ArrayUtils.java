package utils;

public class ArrayUtils {

    /**
     * Displays all elements in an integer array along with their index positions.
     * @param numbers the integer array whose elements will be printed
     */
    public static void displayArray(int[] numbers) {

        // Loop through the array from index 0 to the last element
        for (int i = 0; i < numbers.length; i++) {

            // Print the current index and the value stored at that index
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }

    /**
     * Displays all elements in a String array along with their index positions.
     * @param words the String array whose elements will be printed
     */
    public static void displayArray(String[] words) {

        // Loop through the array from index 0 to the last element
        for (int i = 0; i < words.length; i++) {

            // Print the current index and the value stored at that index
            System.out.println("Index " + i + ": " + words[i]);
        }
    }

    /**
     * Calculates the average value of all numbers in the array.
     *
     * @param numbers the integer array to calculate the average from
     * @return the average of all values in the array
     */
    public static double calcAverage(int[] numbers) {

        // Add up all the numbers in the array
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        // Divide the total by how many numbers are in the array
        return (double) total / numbers.length;
    }
}
