package org.lessons.account;

public class App {
    public static void main() {

        Account giorgio = new Account(312048932);
        System.out.println(giorgio.getAmount());
        giorgio.deposit(203023020);
        System.out.println(giorgio.getAmount());
        giorgio.withdraw(32222182);
        System.out.println(giorgio.getAmount());
    }

}
