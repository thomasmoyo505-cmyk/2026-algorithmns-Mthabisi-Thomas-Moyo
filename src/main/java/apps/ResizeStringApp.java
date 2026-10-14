package apps;

import utils.ArrayUtils;
import java.util.Arrays;

public class ResizeStringApp {

    public static void main(String[] args) {

        //Create a sample String array
        String[] words = {"apple", "banana", "cherry", "date"};

        //Display the original array
        System.out.println("STEP 2: Original String array:");
        System.out.println(Arrays.toString(words));

        //Show the original size
        int originalSize = words.length;
        System.out.println("STEP 3: Original size = " + originalSize);

        //Choose a new size (smaller)
        int newSizeSmall = 2;
        System.out.println("STEP 4: Resizing to a SMALLER size (" + newSizeSmall + ")");

        //Call resize() for smaller size
        String[] smallerArray = ArrayUtils.resize(words, newSizeSmall);

        //Display the smaller array
        System.out.println("STEP 6: Result of resizing to smaller size:");
        System.out.println(Arrays.toString(smallerArray));

        //Choose a new size (larger)
        int newSizeLarge = 7;
        System.out.println("\nSTEP 7: Resizing to a LARGER size (" + newSizeLarge + ")");

        //Call resize() for larger size
        String[] largerArray = ArrayUtils.resize(words, newSizeLarge);

        //Display the larger array
        System.out.println("STEP 9: Result of resizing to larger size:");
        System.out.println(Arrays.toString(largerArray));

        //Final explanation
        System.out.println("\nSTEP 10: Smaller resize copies fewer elements.");
        System.out.println("Larger resize copies all elements and leaves empty slots as null.");
    }
}
