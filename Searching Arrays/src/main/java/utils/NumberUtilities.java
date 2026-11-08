package utils;

public class NumberUtilities {

    public static int linearSearch(int[] nums, int value) {

        int loops = 0;
        int position = -1;

        for (int i = 0; i < nums.length; i++) {

            loops++;

            if (nums[i] == value) {
                position = i;
            }
        }

        System.out.println("Loops performed: " + loops);

        return position;
    }

    public static int optimisedLinearSearch(int[] nums, int value) {

        int loops = 0;

        for (int i = 0; i < nums.length; i++) {

            loops++;

            if (nums[i] == value) {
                System.out.println("Loops performed: " + loops);
                return i;
            }

            if (nums[i] > value) {
                System.out.println("Loops performed: " + loops);
                return -1;
            }
        }

        System.out.println("Loops performed: " + loops);
        return -1;
    }

    public static int binarySearch(int[] nums, int value) {

        int loops = 0;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            loops++;

            int middle = (low + high) / 2;

            if (nums[middle] == value) {
                System.out.println("Loops performed: " + loops);
                return middle;
            }

            if (nums[middle] < value) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        System.out.println("Loops performed: " + loops);
        return -1;
    }

}