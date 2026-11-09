package utils;

public class ArrayUtils {

    /**
     * Removes duplicates from an unsorted array using array growth.
     *
     * @param nums The original integer array
     * @return A new array containing each distinct value once
     */
    public static int[] deduplicate(int[] nums) {

        if (nums.length == 0) {
            return new int[0];
        }

        int[] result = new int[0];

        for (int i = 0; i < nums.length; i++) {

            boolean found = false;

            for (int j = 0; j < result.length; j++) {
                if (nums[i] == result[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {

                int[] temp = new int[result.length + 1];

                for (int k = 0; k < result.length; k++) {
                    temp[k] = result[k];
                }

                temp[result.length] = nums[i];
                result = temp;
            }
        }

        return result;
    }

    /**
     * Removes duplicates using blank deletion.
     * Grades are between 0 and 100 so -1 is used as a marker.
     *
     * @param grades The array of grades
     * @return A new array with duplicates removed
     */
    public static int[] filterDuplicates(int[] grades) {

        if (grades.length == 0) {
            return new int[0];
        }

        int[] temp = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            temp[i] = grades[i];
        }

        for (int i = 0; i < temp.length; i++) {

            for (int j = i + 1; j < temp.length; j++) {

                if (temp[i] == temp[j]) {
                    temp[j] = -1;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != -1) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != -1) {
                result[index] = temp[i];
                index++;
            }
        }

        return result;
    }

    /**
     * Removes duplicates from a sorted array.
     * Input array must already be sorted in ascending order.
     *
     * @param nums A sorted integer array
     * @return A new array containing unique values
     */
    public static int[] sortedDeduplicate(int[] nums) {

        if (nums.length == 0) {
            return new int[0];
        }

        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                count++;
            }
        }

        int[] result = new int[count];

        result[0] = nums[0];
        int index = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                result[index] = nums[i];
                index++;
            }
        }

        return result;
    }
}