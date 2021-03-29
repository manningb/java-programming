package practice_for_test;

import java.util.Scanner;

public class p2q2 {
    public static void main(String[] args) {
        int number = positiveIntegerInput("Please input a positive integer,\nto reflect the length from the center of a pentagon to a vertex:");
        double pentagonArea = getPentagonArea(number);
        System.out.println(number + " " + pentagonArea);
    }

    private static double getPentagonArea(int length) {
        return (5 * Math.pow(length, 2)) / (4 * Math.tan(Math.PI/5));
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
