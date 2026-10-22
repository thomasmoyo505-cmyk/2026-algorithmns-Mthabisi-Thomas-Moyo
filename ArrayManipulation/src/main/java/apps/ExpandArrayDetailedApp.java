package apps;

import utils.ArrayUtils;
import java.util.Arrays;

public class ExpandArrayDetailedApp {

    public static void main(String[] args) {

        //Create several arrays to test the expandArray() method
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {10, 20, 30, 40, 50};
        int[] arrayC = {7};

        //Display the arrays before expansion
        System.out.println("STEP 2: Displaying original arrays:");
        System.out.println("Array A: " + Arrays.toString(arrayA));
        System.out.println("Array B: " + Arrays.toString(arrayB));
        System.out.println("Array C: " + Arrays.toString(arrayC));

        //Expand each array using ArrayUtils.expandArray()
        System.out.println("\nSTEP 3: Expanding each array by 10 slots...");

        int[] expandedA = ArrayUtils.expandArray(arrayA);
        int[] expandedB = ArrayUtils.expandArray(arrayB);
        int[] expandedC = ArrayUtils.expandArray(arrayC);

        //Display expanded arrays
        System.out.println("\nSTEP 4: Expanded arrays:");
        System.out.println("Expanded A: " + Arrays.toString(expandedA));
        System.out.println("Expanded B: " + Arrays.toString(expandedB));
        System.out.println("Expanded C: " + Arrays.toString(expandedC));

        //Show size comparisons
        System.out.println("\nSTEP 5: Size comparisons:");
        System.out.println("Array A: original = " + arrayA.length + ", expanded = " + expandedA.length);
        System.out.println("Array B: original = " + arrayB.length + ", expanded = " + expandedB.length);
        System.out.println("Array C: original = " + arrayC.length + ", expanded = " + expandedC.length);

        //Final explanation
        System.out.println("\nSTEP 6: All arrays have been expanded by exactly 10 slots.");
        System.out.println("Notice the extra zeros at the end of each expanded array.");
    }
}
