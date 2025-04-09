package org.lessons.ContoBancario;

public class App {
    public static void main() {

        ContoBancario giorgio = new ContoBancario(312048932);
        System.out.println(giorgio.getAmount());
        giorgio.deposit(203023020);
        System.out.println(giorgio.getAmount());
        giorgio.withdraw(32222182);
        System.out.println(giorgio.getAmount());
    }

}
