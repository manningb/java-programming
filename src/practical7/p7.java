package practical7;
import ma3.q1.Account;

class SavingsAccount extends Account {
    public void withdraw(int withdrawAmount) {
        // reduces balance by specified withdraw amount
        if (withdrawAmount > this.getBalance()) {
            System.out.println("Your current balance is\n$" + this.getBalance() +
                    ". You have attempted to withdraw $" + withdrawAmount + " This transaction cannot be completed. Your\n" +
                    "balance is unchanged.");
        } else {
            this.setBalance(this.getBalance() - withdrawAmount);
            System.out.println(withdrawAmount + " has been withdrawn.\nYour new balance is " + this.getBalance() + "\n");
        }
    }
}

class ClassCheckingAccount extends Account {
    private int overdraftLimit = 1000;

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return "ClassCheckingAccount{" +
                "overdraftLimit=" + overdraftLimit +
                "} " + super.toString();
    }

    @Override
    public void withdraw(int withdrawAmount) {
        // reduces balance by specified withdraw amount
        if (this.getBalance() - withdrawAmount < - overdraftLimit ) {
            System.out.println("Your current balance is\n$" + this.getBalance() + ". Your overdraft limit is $" + this.overdraftLimit +
                    ". You have attempted to withdraw $" + withdrawAmount + " This transaction cannot be completed. Your\n" +
                    "balance is unchanged.");
        } else {
            this.setBalance(this.getBalance() - withdrawAmount);
            System.out.println(withdrawAmount + " has been withdrawn.\nYour new balance is " + this.getBalance() + "\n");
        }
    }

    public double getMonthlyInterest() {
        if (this.getBalance() < 0) {
            return 0;
        }
        return super.getMonthlyInterest();
    }

}