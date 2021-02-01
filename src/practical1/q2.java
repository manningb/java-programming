package practical1;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner years = new Scanner(System.in);  // Create a Scanner object for radius
        System.out.println("Enter a number of years");
        int yearsIn = years.nextInt();  // Read user input

        final int currentPopulation = 312032486;
        int secondsPerYear = yearsIn * 365 * 24 * 60 * 60;
        int births = secondsPerYear/7;
        int deaths = secondsPerYear/13;
        int immigrants = secondsPerYear/45;
        int futurePopulation = currentPopulation + births + deaths + immigrants;
        System.out.println(futurePopulation);
    }
}
