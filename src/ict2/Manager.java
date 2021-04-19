package ict2;

public class Manager extends Employee {
    private double bonus = 1000;
    private String office = "Room 1";

    public Manager() {
    }

    public Manager(String name, int age, String email, double salary, double bonus, String office) {
        super(name, age, email, salary);
        this.bonus = bonus;
        this.office = office;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus < 0) {
            System.out.println("Incorrect bonus value of " + bonus + " received. Bonus must not be negative.");
            System.out.println("Bonus not changed: " + this.bonus);
        } else {
            this.bonus = bonus;
        }
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                ", office='" + office + '\'' +
                "} " + super.toString();
    }
}
