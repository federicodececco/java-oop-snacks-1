package org.lessons.ContoBancario;

public class ContoBancario {
    private int accountNumber;
    private long balance;

    public ContoBancario(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(long amount) {
        this.balance += amount;
    }

    public void withdraw(long amount) {
        this.balance -= amount;
    }

    public long getAmount() {
        return this.balance;
    }
}
