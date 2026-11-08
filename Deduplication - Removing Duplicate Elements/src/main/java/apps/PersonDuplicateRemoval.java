package apps;

import java.util.Scanner;
import java.util.Arrays;
import utils.Person;
import utils.PersonUtilities;

public class PersonDuplicateRemoval {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many persons? ");
        int size = scanner.nextInt();
        scanner.nextLine();

        Person[] people = new Person[size];

        for (int i = 0; i < people.length; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            people[i] = new Person(firstName, lastName, age);
        }

        Arrays.sort(people);

        System.out.println("\nSorted Array:");

        for (Person person : people) {
            System.out.println(person);
        }

        Person[] filtered = PersonUtilities.sortedDeduplicate(people);

        System.out.println("\nWithout Duplicates:");

        for (Person person : filtered) {
            System.out.println(person);
        }

        scanner.close();
    }
}