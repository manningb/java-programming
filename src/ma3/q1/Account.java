package ma3.q1;

import java.util.Date;

public class Account {
    // initialise default values
    private int id = 0;
    private double balance = 0;
    private Date dateCreated = new Date();
    private double annualInterestRate = 0;

    public Account() {
        // no-arg constructor
        // initialises to default values
    }

    public Account(int id, double balance) {
        // arg constructor,
        this.id = id;
        this.balance = balance;
    }

    // various getters and setters
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

    // other methods
    public double getMonthlyInterest() {
        return balance * annualInterestRate / 12;
    }

    public void withdraw(int withdrawAmount) {
        // reduces balance by specified withdraw amount
        this.balance = this.balance - withdrawAmount;
        System.out.println(withdrawAmount + " has been withdrawn.\nYour new balance is " + this.balance + "\n");
    }

    public void deposit(int depositAmount) {
        // increases balance by specified deposit amount
        this.balance = this.balance + depositAmount;
        System.out.println(depositAmount + " has been deposited.\nYour new balance is " + this.balance + "\n");
    }

    @Override
    public String toString() {
        // returns string representation of an account
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
