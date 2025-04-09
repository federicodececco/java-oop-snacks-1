package org.lessons.register;

import org.lessons.studente.Studente;

class RegistroStudenti {
    protected Studente[] students;

    public RegistroStudenti() {
        this.students = new Studente[0];
    }

    public void addStudent(String firstName, String lastName, int age) {

        Studente[] newStudents = new Studente[this.students.length + 1];
        int i = 0;

        while (i < students.length) {
            newStudents[i] = students[i];
            i++;
        }
        newStudents[i] = new Studente(firstName, lastName, age);
        this.students = newStudents;
    }

    public void printArray() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].Chain());

        }

    }
}