package apps;

import java.util.Scanner;
import utils.ArrayUtils;

public class NumberPartitioning {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] grades = new int[10];

        System.out.println("Enter 10 grades:");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }

        System.out.print("\nEnter the pass mark (pivot): ");
        int pivot = input.nextInt();

        // Partition the grades using your ArrayUtils method
        int[] partitioned = ArrayUtils.partition(grades, pivot);

        System.out.println("\nPartitioned Grades (higher values first):");
        for (int i = 0; i < partitioned.length; i++) {
            System.out.println("Position " + (i + 1) + ": " + partitioned[i]);
        }

        // Count how many subjects were passed (values > pivot)
        int passCount = 0;
        for (int grade : grades) {
            if (grade > pivot) {
                passCount++;
            }
        }

        System.out.println("\nNumber of subjects passed: " + passCount);

        input.close();
    }
}

