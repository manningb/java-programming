package practice_for_test_final;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private Date dateCreated = new Date();
    private double annualInterestRate = 0;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterest() {
        return (balance * annualInterestRate) / 12;
    }

    public void withdraw (double amount) {
        this.balance -= amount;
    }

    public void deposit (double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
