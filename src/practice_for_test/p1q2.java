package practice_for_test;

import java.util.Scanner;

public class p1q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number of years: ");
        int numYears = input.nextInt();
        long currentPop = 312032486;
        int secondsPerYear = 365 * 24 * 60 * 60;
        int birthsPerYear = 7 * secondsPerYear;
        int deathsPerYear = 13 * secondsPerYear;
        int immigrantsPerYear = 45 * secondsPerYear;
        for (int i = 0; i < numYears; i++) {
            currentPop = currentPop + birthsPerYear - deathsPerYear + immigrantsPerYear;
        }
        System.out.printf("After %d years, the population will be %d", numYears, currentPop);
    }
}
