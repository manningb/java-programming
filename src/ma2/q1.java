package ma2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // uses try catch to see if input is valid
        try {
            System.out.println("Please enter an investment amount:");
            int investment_in = input.nextInt();
            System.out.println("Please enter an annual interest rate:");
            double interest_in = input.nextDouble();
            futureValue(investment_in, interest_in/1200, 5);
        } catch (Exception e) {
            // if input invalid print this message
            System.out.println("Please enter integer values for the inputs");
        }

    }

    public static void futureValue(int investment_amount, double monthlyRate, int years) {
        // print out user input
        System.out.println("The amount invested: " + investment_amount);
        System.out.println("Annual interest rate: " + (int) (monthlyRate*1200));

        // print out table of years and values
        // NOTE: values round up
        System.out.println("Years\tValue");

        // current_investment is a temp variable here used to calculate the investment at each year
        double current_investment = investment_amount;
        for (int i = 1; i <= years; i++) {
            current_investment = investment_amount * (Math.pow(1 + monthlyRate,i*12));
            System.out.println(i + String.format("\t\t%.2f", current_investment));
        }
    }
}
