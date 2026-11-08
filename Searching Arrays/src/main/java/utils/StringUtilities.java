package utils;

public class StringUtilities {

    public static int binarySearch(String[] text, String value) {

        int loops = 0;

        int low = 0;
        int high = text.length - 1;

        while (low <= high) {

            loops++;

            int middle = (low + high) / 2;

            int result = text[middle].compareTo(value);

            if (result == 0) {
                System.out.println("Loops performed: " + loops);
                return middle;
            }

            if (result < 0) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        System.out.println("Loops performed: " + loops);
        return -1;
    }
}
