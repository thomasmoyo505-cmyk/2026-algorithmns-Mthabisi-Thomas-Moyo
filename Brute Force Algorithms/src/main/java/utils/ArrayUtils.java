package utils;

public class ArrayUtils {

    /**
     * Displays all elements in an integer array along with their index positions.
     *
     * @param numbers the integer array whose elements will be printed
     */
    public static void displayArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }

    /**
     * Displays all elements in a String array along with their index positions.
     *
     * @param words the String array whose elements will be printed
     */
    public static void displayArray(String[] words) {

        for (int i = 0; i < words.length; i++) {
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

        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        return (double) total / numbers.length;
    }

    /**
     * Finds and returns the highest number in the given integer array.
     *
     * @param numbers the integer array to search
     * @return the largest number found in the array
     */
    public static int findMax(int[] numbers) {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    /**
     * Finds and returns the lowest number in the given integer array.
     *
     * @param numbers the integer array to search
     * @return the smallest number found in the array
     */
    public static int findMin(int[] numbers) {

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    /**
     * Finds and returns the text that would appear last in the dictionary.
     *
     * @param words the String array to search
     * @return the text that appears last alphabetically
     */
    public static String maxText(String[] words) {

        String max = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].compareToIgnoreCase(max) > 0) {
                max = words[i];
            }
        }

        return max;
    }

    /**
     * Finds and returns the text that would appear first in alphabetical order.
     *
     * @param words the String array to search
     * @return the text that appears first alphabetically
     */
    public static String findMin(String[] words) {

        String min = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].compareToIgnoreCase(min) < 0) {
                min = words[i];
            }
        }

        return min;
    }

    /**
     * Counts how many times a value appears in an integer array.
     *
     * @param numbers the integer array to search
     * @param value the number to count
     * @return the number of times the value appears in the array
     */
    public static int count(int[] numbers, int value) {

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                count++;
            }
        }

        return count;
    }

    /**
     * Finds and returns the most frequent value in an integer array.
     *
     * @param numbers the integer array to search
     * @return the value with the highest frequency. If multiple values have
     * the same highest frequency, the first one encountered is returned.
     */
    public static int getMostFrequent(int[] numbers) {

        int mostFrequent = numbers[0];
        int highestCount = count(numbers, numbers[0]);

        for (int i = 1; i < numbers.length; i++) {

            int currentCount = count(numbers, numbers[i]);

            if (currentCount > highestCount) {
                highestCount = currentCount;
                mostFrequent = numbers[i];
            }
        }

        return mostFrequent;
    }

    /**
     * Counts how many elements in an array are greater than a given value.
     *
     * @param numbers the integer array to search
     * @param value the value to compare against
     * @return the number of elements greater than the supplied value
     */
    public static int countGreater(int[] numbers, int value) {

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > value) {
                count++;
            }
        }

        return count;
    }

    /**
     * Counts how many elements in an array are greater than the average value.
     *
     * @param numbers the integer array to search
     * @return the number of elements greater than the average of the array
     */
    public static int countGreaterThanAverage(int[] numbers) {

        double average = calcAverage(numbers);

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        return count;
    }
}

