package test_midterm;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // take input from user
        Scanner sc = new Scanner(System.in);
        String input_string;
        do {
            System.out.println("Please enter a string");
            input_string = sc.nextLine();
        } while (input_string.length() < 1); // only accept input when length greater than 0

        // print out the output of the method
        System.out.println(returnRandomChar(input_string));

        //testFunction(200, input_string); // method for testing output
    }

    private static char returnRandomChar(String input) {
        Random r = new Random();
        // get a random index in the strings length
        int random_index = r.nextInt((input.length() - 1) + 1) + 0;
        // return the character at that index
        return input.charAt(random_index);
    }

    private static void testFunction(int number_of_iterations, String input_string) {
        // method for testing over a large number of iterations
        for (int i = 0; i < number_of_iterations; i++) {
            char output = returnRandomChar(input_string);
            System.out.printf("%s ", output);
        }
    }
}
