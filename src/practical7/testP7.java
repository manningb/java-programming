package practical7;

public class testP7 {
    public static void main(String[] args) {
        SavingsAccount testSave = new SavingsAccount();
        testSave.withdraw(100);

        ClassCheckingAccount testCheck = new ClassCheckingAccount();
        System.out.println(testCheck.getMonthlyInterest());

        System.out.println(testCheck.getMonthlyInterest());

        testCheck.setAnnualInterestRate(1.5);
        testCheck.withdraw(100);
        System.out.println(testCheck.getMonthlyInterest());
        testCheck.deposit(1000);
        System.out.println(testCheck.getMonthlyInterest());
    }
}
