package ma1;

import java.text.DateFormatSymbols;
import java.time.YearMonth;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This program will return the number of days in the month");
        int year = 0, month = 0;
        try {
            // receive input of year
            System.out.println("Please enter the year");
            year = input.nextInt();

            // receive input of month, loop until appropriate integer entered
            System.out.println("Please enter the month number, 1-12");
            while (true) {
                month = input.nextInt();
                if (month > 0 && month < 13) {
                    break;
                }
                System.out.println("You must enter a number between 1 and 12 inclusive");
            }
        } catch(Exception e) {
            System.out.println("Unexpected input, exiting the program.");
            System.out.println("Error: " + e);
            System.exit(1);
        }

        // use java YearMonth method to return days in the month
        // also could have used a series of if else ifs/ a dictionary here if this method was unavailable
        YearMonth yearMonth = YearMonth.of(year, month);
        int days = yearMonth.lengthOfMonth();

        // get the name of that month number using DateFormatSymbols
        // also could have used a dictionary to store this information if this was unavailable
        DateFormatSymbols dateFormat = new DateFormatSymbols();
        String[] months = dateFormat.getMonths();

        // return days of month
        System.out.println("There are " + days + " days in " + months[month-1] + " " + year + ".");
    }
}