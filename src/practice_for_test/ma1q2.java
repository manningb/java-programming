package practice_for_test;

import java.time.YearMonth;
import java.util.Scanner;

public class ma1q2 {
    public static void main(String[] args) {
        int year = positiveIntegerInput("Please input the year: ");
        int month = integerRangeInput("Please input the month number (1-12 incl.)", 1, 12);
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        System.out.printf("There are %d days in that month", daysInMonth);

    }
    private static int integerRangeInput(String message, int lower_bound, int upper_bound) {
        Scanner sc = new Scanner(System.in);
        int number_input;
        do {
            System.out.println(message);
            while (!sc.hasNextInt()) {
                String invalid_input = sc.next();
                System.out.printf("\"%s\" is not valid input, please try again\n" ,invalid_input);
            }
            number_input = sc.nextInt();
        } while (number_input < lower_bound || number_input > upper_bound);
        return number_input;
    }
    private static int positiveIntegerInput(String message) {
        Scanner sc = new Scanner(System.in);
        int number_input;
        do {
            System.out.println(message);
            while (!sc.hasNextInt()) {
                String invalid_input = sc.next();
                System.out.printf("\"%s\" is not valid input, please try again\n" ,invalid_input);
            }
            number_input = sc.nextInt();
        } while (number_input < 0);
        return number_input;
    }

}
