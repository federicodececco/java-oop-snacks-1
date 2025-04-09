package org.lessons.studente;

public class Studente {
    String firstName;
    String lastName;
    int age;

    public Studente(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String Chain() {
        return firstName + " " + lastName + "," + age + " anni";
    }
}
