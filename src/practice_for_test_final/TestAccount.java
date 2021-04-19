package practice_for_test_final;

public class TestAccount {
    public static void main(String[] args) {
        Account testAc = new Account(101, 20000);
        testAc.setAnnualInterestRate(0.045);
        testAc.withdraw(2500);
        testAc.deposit(3000);
        System.out.println(testAc);
        System.out.println(testAc.getMonthlyInterest());
        SavingsAccount testSav = new SavingsAccount(101, 20000);
        testSav.withdraw(9999999);
        CheckingAccount testCheck = new CheckingAccount(101,20000);
        System.out.println(testCheck.getMonthlyInterest());
        System.out.println(testCheck.getBalance());

        testCheck.withdraw(20999);
        System.out.println(testCheck.getMonthlyInterest());
        System.out.println(testCheck.getBalance());

        testCheck.withdraw(1000);
        System.out.println(testCheck.getMonthlyInterest());
        System.out.println(testCheck.getBalance());

    }


}
