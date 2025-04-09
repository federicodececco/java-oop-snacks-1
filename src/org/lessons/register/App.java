package org.lessons.register;

public class App {
    public static void main() {
        RegistroStudenti registroTest = new RegistroStudenti();
        registroTest.addStudent("Anselmo", "Bitta", 24);
        registroTest.addStudent("Anselmo", "Bitta", 24);
        registroTest.addStudent("Anselmo", "Bitta", 24);

        registroTest.printArray();

    }
}
