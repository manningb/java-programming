package ma1;

import java.text.DateFormatSymbols;
import java.time.YearMonth;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This program will return the number of days in the month");

        // receive input of year
        System.out.println("Please enter the year");
        int year = input.nextInt();

        // receive input of month, loop until appropriate integer entered
        System.out.println("Please enter the month number, 1-12");
        int month;
        while(true) {
            month = input.nextInt();
            if (month > 0 && month < 13) {
                break;
            }
            System.out.println("You must enter a number between 1 and 12 inclusive");
        };

        // use java YearMonth method to return days in the month
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();

        // get the name of that month number
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();

        // return days of month
        System.out.println("There are " + daysInMonth + " days in " + months[month-1] + " " + year + ".");
    }
}