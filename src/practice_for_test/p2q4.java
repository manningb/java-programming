package practice_for_test;

import java.util.Scanner;

public class p2q4 {
    public static void main(String[] args) {
        int input = integerRangeInput("Please input a number between 0 and 15 inclusive", 0, 15);
        String hex_out = Integer.toHexString(input);
        System.out.printf("The output is %s", hex_out);
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
