package practice_for_test;

import java.util.Scanner;

public class p2q6 {
    public static void main(String[] args) {
        int year = integerInput("Please input a year: ");
        int remainder = year % 12;
        System.out.printf("The zodiac is %s", getZodiac(remainder));

    }

    private static String getZodiac(int remainder) {
        String zodiac;
        switch (remainder) {
            case 0:
                zodiac = "monkey";
                break;
            case 1:
                zodiac = "monkey";
                break;
            case 2:
                zodiac = "monkey";
                break;
            case 3:
                zodiac = "monkey";
                break;
            case 4:
                zodiac = "monkey";
                break;
            case 5:
                zodiac = "monkey";
                break;
            case 6:
                zodiac = "monkey";
                break;
            case 7:
                zodiac = "monkey";
                break;
            case 8:
                zodiac = "monkey";
                break;
            case 9:
                zodiac = "monkey";
                break;
            case 10:
                zodiac = "monkey";
                break;
            case 11:
                zodiac = "monkey";
                break;
            default:
                zodiac = "invalid";
        }
        return zodiac;
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
