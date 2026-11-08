package utils;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return firstName.compareTo(other.firstName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + ")";
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Person) {

            Person other = (Person) obj;

            return firstName.equals(other.firstName)
                    && lastName.equals(other.lastName)
                    && age == other.age;
        }

        return false;
    }
}