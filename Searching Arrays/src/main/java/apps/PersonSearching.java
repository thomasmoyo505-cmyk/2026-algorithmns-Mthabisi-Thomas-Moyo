package apps;

import java.util.Arrays;
import java.util.Scanner;
import utils.Person;
import utils.PersonUtilities;

public class PersonSearching {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person[] people = {
                new Person("Smith", "John", 20),
                new Person("Jones", "Mary", 25),
                new Person("Brown", "Alex", 30),
                new Person("Wilson", "Sarah", 22),
                new Person("Taylor", "James", 28)
        };

        Arrays.sort(people);

        System.out.println("Sorted Array:");

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.print("\nEnter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        Person searchPerson =
                new Person(lastName, firstName, age);

        long startTime = System.nanoTime();

        Person result =
                PersonUtilities.optimisedLinearSearch(
                        people, searchPerson);

        long endTime = System.nanoTime();

        long timeTaken = endTime - startTime;

        System.out.println(
                "Search took " + timeTaken + " nanoseconds");

        if (result == null) {
            System.out.println("Person not found.");
        } else {
            System.out.println("Found: " + result);
        }

        scanner.close();
    }
}