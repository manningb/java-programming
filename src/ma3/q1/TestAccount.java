package ma3.q1;

public class TestAccount {
    public static void main(String[] args) {
//        test Account class
        Account testAccount = new Account(101, 20000);
        testAccount.setAnnualInterestRate(0.045);
        testAccount.withdraw(2500);
        testAccount.deposit(3000);

//        get various account details
        System.out.println("Balance: $" + testAccount.getBalance());
        System.out.println("Monthly Interest: $" + testAccount.getMonthlyInterest());
        System.out.println("Date Created: " + testAccount.getDateCreated());
    }
}
