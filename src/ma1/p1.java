package ma1;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will calculate the runway length");
        double v = 0, a = 0;
        try {
            // receive speed as input
            System.out.println("Please enter the speed, v");
            v = input.nextDouble();

            // receive acceleration as input
            System.out.println("Please enter the acceleration, a");
            a = input.nextDouble();
        }
        catch(Exception e) {
            System.out.println("Unexpected input, exiting the program.");
            System.out.println("Error: " + e);
            System.exit(1);
        }
        // receive weather condition, loop until correct input entered
        System.out.println("Please indicate weather the runway is wet or dry\nWet: w, Dry: d");
        char wetOrDry;
        while(true) {
            wetOrDry = input.next().charAt(0);
            if (wetOrDry == 'w' || wetOrDry == 'd') {
                break;
            }
            System.out.println("You must enter either 'w' or 'd' to continue");
        };

        // calculate length, apply wet/dry condition when necessary
        double length = (Math.pow(v, 2)) / (2 * a);
        if (wetOrDry == 'w') {
            length = length * 1.15;
        }

        // return length of runway
        System.out.println("The length of the runway is " + length);
    }
}
