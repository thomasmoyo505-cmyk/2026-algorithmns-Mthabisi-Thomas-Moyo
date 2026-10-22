package apps;

import utils.ArrayUtils;
import utils.InputUtility;

public class ArrayManipulation {

    public static void main(String[] args) {

        // Create an array to hold the 10 grades
        int[] grades = new int[10];

        // Ask the user to enter each grade
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = InputUtility.getValidInteger();
        }

        // Count how many grades are above the GPA
        int count = ArrayUtils.countGreaterThanAverage(grades);

        // Display the result
        System.out.println("The number of grades above the GPA is: " + count);
    }
}