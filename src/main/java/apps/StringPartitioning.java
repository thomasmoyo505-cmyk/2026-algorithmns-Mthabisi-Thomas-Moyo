package apps;

import java.util.Scanner;
import utils.ArrayUtils;

public class StringPartitioning {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[10];

        System.out.println("Enter 10 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        System.out.print("\nEnter a pivot name: ");
        String pivot = input.nextLine();

        // Partition the names using your ArrayUtils method
        String[] partitioned = ArrayUtils.partition(names, pivot);

        System.out.println("\nPartitioned Names (alphabetical clusters):");
        for (int i = 0; i < partitioned.length; i++) {
            System.out.println("Position " + (i + 1) + ": " + partitioned[i]);
        }

        input.close();
    }
}
