package test_midterm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // get user input of number of times
        Scanner sc = new Scanner(System.in);
        int number_input;
        do {
            System.out.println("Enter number of times: ");
            while (!sc.hasNextInt()) {
                String invalid_input = sc.next();
                System.out.printf("\"%s\" is not valid input, please try again\n" ,invalid_input);
            }
            number_input = sc.nextInt();
        } while (number_input < 1); // only accept input greater than 1

        // roll dice the number of times the user specifies and store in list
        ArrayList<Integer> dice_rolls = new ArrayList<Integer>();
        for (int i = 0; i < number_input; i++) {
            dice_rolls.add(rollTwoDice());
        }

        // sort using collections method
        Collections.sort(dice_rolls);

        // print list of sorted dice rolls
        System.out.println(dice_rolls);

        // calculate average and print to one decimal place
        System.out.printf("Average: %.1f", getMean(dice_rolls));
    }

    private static double getMean(ArrayList<Integer> dice_rolls) {
        // Calculates the average of an ArrayList of integers
        int sum = 0;
        for (int item : dice_rolls) {
            sum += item;
        }
        // convert to double and return
        System.out.println(sum);
        return sum / (double) dice_rolls.size();
    }

    private static int rollTwoDice() {
        Random r = new Random();
        // roll two separate dice, range 1 - 6 for each
        int dice_roll_1 = r.nextInt(6) + 1;
        int dice_roll_2 = r.nextInt(6) + 1;
        // return the sum of their rolls
        return dice_roll_1 + dice_roll_2;
    }

}
