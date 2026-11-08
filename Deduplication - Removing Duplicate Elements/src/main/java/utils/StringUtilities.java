package utils;
package utils;

public class StringUtilities {

    public static String[] deduplicate(String[] text) {

        String[] filtered = new String[0];

        for (int i = 0; i < text.length; i++) {

            boolean found = false;

            for (int j = 0; j < filtered.length; j++) {

                if (text[i].equals(filtered[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {

                String[] temp = new String[filtered.length + 1];

                for (int j = 0; j < filtered.length; j++) {
                    temp[j] = filtered[j];
                }

                temp[temp.length - 1] = text[i];

                filtered = temp;
            }
        }

        return filtered;
    }
}