package ict2;

public class Employee extends Person {
    private double salary = 20000;

    public Employee() {
    }

    public Employee(String name, int age, String email, double salary) {
        super(name, age, email);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Incorrect salary value of " + salary + " received. Salary must not be negative.");
            System.out.println("Salary not changed: " + this.salary);
        } else {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}
