package org.lessons.account;

public class Account {
    private int accountNumber;
    private long balance;

    public Account(int accountNumber) {
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
