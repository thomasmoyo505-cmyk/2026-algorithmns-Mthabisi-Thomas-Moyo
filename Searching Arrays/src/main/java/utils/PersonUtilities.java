package utils;

public class PersonUtilities {

    public static Person linearSearch(Person[] people, Person value) {

        int loops = 0;

        for (int i = 0; i < people.length; i++) {

            loops++;

            if (people[i].getLastName().equals(value.getLastName())) {

                System.out.println("Loops performed: " + loops);
                return people[i];
            }
        }

        System.out.println("Loops performed: " + loops);
        return null;
    }

    public static Person optimisedLinearSearch(Person[] people, Person value) {

        int loops = 0;

        for (int i = 0; i < people.length; i++) {

            loops++;

            int result = people[i].getFirstName()
                    .compareTo(value.getFirstName());

            if (result == 0) {
                System.out.println("Loops performed: " + loops);
                return people[i];
            }

            if (result > 0) {
                System.out.println("Loops performed: " + loops);
                return null;
            }
        }

        System.out.println("Loops performed: " + loops);
        return null;
    }
}