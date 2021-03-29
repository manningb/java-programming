package practice_for_test;

import java.util.Random;
import java.util.Scanner;

public class ma1q3 {
    public static void main(String[] args) {
        int rand = getRandomNumberInRange(0,100);
        boolean check = false;
        while (!check) {
            int input = integerRangeInput("Please input a number between 0-100", 0, 100);
            if (input == rand) {
                System.out.println("correct");
                check = true;
            } else if (input < rand) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        }

    }

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
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

}
