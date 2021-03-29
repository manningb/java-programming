package practice_for_test;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int[] user_input = new int[10];
        int max_int = 0;
        for (int i = 0; i < 10; i++) {
            user_input[i] = integerInput("Please input integer for index " + i);
            if (i == 0) {
                max_int = user_input[i];
            } else if (user_input[i] > user_input[i-1]) {
                max_int = user_input[i];
            }
        }
        double[] doubles = new double[user_input.length];
        for (int i = 0; i < user_input.length; i++) {
            doubles[i] = user_input[i] / (double) max_int;
        }
        System.out.println(Arrays.toString(doubles));

    }

    private static int integerInput(String message) {
        Scanner sc = new Scanner(System.in);
        int number_input;
        System.out.println(message);
        while (!sc.hasNextInt()) {
            String invalid_input = sc.next();
            System.out.printf("\"%s\" is not valid input, please try again\n" ,invalid_input);
        }
        number_input = sc.nextInt();
        return number_input;
    }

}
