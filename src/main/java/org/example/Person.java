package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private String email;
    private String phoneNumber;
    private String gender;

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, age, "unknown@example.com", "0000000000", "Unknown");
    }

    public Person(String firstName, String lastName, int age,
                  String email, String phoneNumber, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
