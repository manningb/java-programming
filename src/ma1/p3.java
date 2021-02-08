package ma1;

import java.util.Random;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // calculate random number using upper and lower bounds, set to 0 and 100
        Random r = new Random();
        int low = 0;
        int high = 100;
        int result = r.nextInt(high-low) + low;

        System.out.println("Guess a number between 0-100");
        int num;

        // loop until number is found
        while (true) {
            System.out.println("Enter a number:");
            num = input.nextInt();

            // check number lies within range
            if (num >= 0 && num <= 100) {
                if (num > result) {
                    System.out.println("Too high");
                } else if (num < result) {
                    System.out.println("Too low");
                } else {
                    System.out.println("Correct!");
                    break;
                }
            } else {
                System.out.println("You must enter a number between 0 and 100 inclusive");
            }
        }
    }
}
