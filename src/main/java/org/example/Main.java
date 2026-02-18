package org.example;
class Wall{
    double width;
    double height;


    public Wall(double width, double height) {
        // validation
        this.width = (width < 0) ? 0 : width;
        this.height = (height < 0) ? 0 : height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return width * height;
    }

}

class Person {

     String firstName;
     String lastName;
     int age;


     String email;
     String phoneNumber;
     String gender;


    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, age, "unknown@example.com", "0000000000", "Unknown"); // ✅ chaining
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

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Person p1 = new Person("Ali", "Yılmaz", 15);
        Person p2 = new Person("Ayşe", "Demir", 22, "ayse@mail.com", "05551234567", "Female");
        Person p3 = new Person("Mehmet", "Kaya", 13);

        System.out.println(p1.getFirstName() + " teen mi? " + p1.isTeen());
        System.out.println(p2.getFirstName() + " teen mi? " + p2.isTeen());
        System.out.println(p3.getFirstName() + " teen mi? " + p3.isTeen());

        Wall wall = new Wall(5, 4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
}
