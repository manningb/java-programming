package practice_for_test_final;

public class CheckingAccount extends Account{
    private double overdraftLimit = 1000;

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount() {
    }

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "overdraftLimit=" + overdraftLimit +
                "} " + super.toString();
    }

    @Override
    public void withdraw(double amount) {
        if (amount < super.getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw that much check");
        }
    }

    @Override
    public double getMonthlyInterest() {
        if (super.getBalance() < 0) {
            return 0;
        } else {
            return super.getMonthlyInterest();
        }
    }
}
