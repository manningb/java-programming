package ma1;

import java.util.Random;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // calculate random number using upper and lower bounds, set to 0 and 100
        Random randomNumber = new Random();
        int low = 0;
        int high = 100;
        int result = randomNumber.nextInt(high-low) + low;

        System.out.println("Guess a number between 0-100");
        int num = 0;
        int count = 0;
        double sum = 0;
        // loop until number is found
        long startTime = System.currentTimeMillis();

        while (true) {
            System.out.println("Enter a number:");
            try {
                num = input.nextInt();
            }
            catch(Exception e) {
                System.out.println("You must enter an integer, program exiting.");
                System.exit(1);
            }
            count++;
            // check number lies within range
            if (num >= 0 && num <= 100) {
                if (num > result) {
                    System.out.println(num + " was too high, please try again");
                } else if (num < result) {
                    System.out.println(num + " was too low, please try again");
                } else {
                    long endTime = System.currentTimeMillis();
                    System.out.println("Correct!");
                    System.out.println("You guessed the number in " + count + " guesses.");
                    System.out.println("Your average distance from the correct answer was " + sum/count);

                    long timeElapsed = endTime - startTime;
                    System.out.println("It took you: " + timeElapsed / 1000 + " seconds.");

                    break;
                }
            } else {
                System.out.println("You must enter a number between 0 and 100 inclusive.");
            }
            sum += Math.abs(result - sum);
        }
    }
}
