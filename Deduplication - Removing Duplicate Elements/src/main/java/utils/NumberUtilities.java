package utils;

public class NumberUtilities {

    public static int[] deduplicate(int[] nums) {

        int[] filtered = new int[0];

        for (int i = 0; i < nums.length; i++) {

            boolean found = false;

            for (int j = 0; j < filtered.length; j++) {

                if (nums[i] == filtered[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {

                int[] temp = new int[filtered.length + 1];

                for (int j = 0; j < filtered.length; j++) {
                    temp[j] = filtered[j];
                }

                temp[temp.length - 1] = nums[i];

                filtered = temp;
            }
        }

        return filtered;
    }

    public static int[] filter(int[] nums) {

        int[] filtered = new int[nums.length];

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            boolean found = false;

            for (int j = 0; j < count; j++) {

                if (nums[i] == filtered[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                filtered[count] = nums[i];
                count++;
            }
        }

        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = filtered[i];
        }

        return result;
    }

    public static int[] sortedDeduplicate(int[] nums) {

        if (nums.length == 0) {
            return nums;
        }

        int[] temp = new int[nums.length];

        temp[0] = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                temp[count] = nums[i];
                count++;
            }
        }

        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

}