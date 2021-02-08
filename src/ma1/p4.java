package ma1;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // receive second string input
        System.out.println("Please enter the first string: ");
        String firstString = input.nextLine();
        System.out.println(firstString + " received as input.");

        // receive second string input
        System.out.println("Please enter the second string: ");
        String secondString = input.nextLine();
        System.out.println(secondString + " received as input.");

        // minimum length to determine for loop range
        int minLength = Math.min(firstString.length(), secondString.length());

        // initialise maxprefix to minimum length of the two strings
        // in the case that the whole smaller string is a prefix of the larger
        // it will not be changed
        int maxPrefix = minLength;
        for (int i = 0; i < minLength; i++) {
            if (firstString.charAt(i) != secondString.charAt(i)) {
                maxPrefix = i;
                break;
            }
        }

        // check if common prefix found
        if (maxPrefix == 0) {
            System.out.println("No common prefix found.");
        } else {
            System.out.println("Common prefix is " + firstString.substring(0, maxPrefix));
        }
    }
}
