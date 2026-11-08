package utils;

public class PersonUtilities {

    public static int countBlank(Person[] people) {

        int count = 0;

        for (int i = 0; i < people.length; i++) {

            if (people[i] == null) {
                count++;
            }

        }

        return count;
    }

    public static Person[] removeBlanks(Person[] people) {

        int blanks = countBlank(people);

        Person[] result = new Person[people.length - blanks];

        int index = 0;

        for (int i = 0; i < people.length; i++) {

            if (people[i] != null) {
                result[index] = people[i];
                index++;
            }

        }

        return result;
    }

    public static Person[] filter(Person[] people) {

        Person[] filtered = new Person[people.length];

        for (int i = 0; i < people.length; i++) {

            boolean found = false;

            for (int j = 0; j < filtered.length; j++) {

                if (filtered[j] != null
                        && people[i] != null
                        && filtered[j].equals(people[i])) {

                    found = true;
                    break;
                }
            }

            if (!found) {
                filtered[i] = people[i];
            }
        }

        return removeBlanks(filtered);
    }

    public static Person[] sortedDeduplicate(Person[] people) {

        if (people.length == 0) {
            return people;
        }

        Person[] temp = new Person[people.length];

        temp[0] = people[0];
        int count = 1;

        for (int i = 1; i < people.length; i++) {

            if (!people[i].getFirstName()
                    .equals(people[i - 1].getFirstName())) {

                temp[count] = people[i];
                count++;
            }
        }

        Person[] result = new Person[count];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}