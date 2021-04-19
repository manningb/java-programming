package practice_for_test_final;

public class SavingsAccount extends Account {
    @Override
    public void withdraw(double amount) {
        if (amount < super.getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw that much");
        }
    }

    public SavingsAccount() {
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }
}
