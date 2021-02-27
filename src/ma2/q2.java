package ma2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a password to be checked:");
        String password_in = input.nextLine();

        // run all checks, if they all pass return valid else invalid
        if (atLeastTwoChars(password_in) && onlyLettersDigits(password_in) && atLeastThreeDigits(password_in)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

    }

    private static boolean atLeastTwoChars(String password) {
        // returns true if greater than or equal to 2, else false
        return password.length() >= 2;
    }

    private static boolean onlyLettersDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            // get integer value of the character
            // use ascii value ranges to see if it is valid
            int c = password.charAt(i);
            if ((c >= 48 && c <= 58) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean atLeastThreeDigits(String password) {
        int count_digits = 0;
        for (int i = 0; i < password.length(); i++) {
            int c = password.charAt(i);
            // checks if ascii value of character is within integer range (0-9)
            if (c >= 48 && c <= 58) {
                count_digits ++;
            }
        }
        return count_digits >= 3;
    }
}
