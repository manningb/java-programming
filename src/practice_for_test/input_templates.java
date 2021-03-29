package practice_for_test;

import java.util.Scanner;

public class input_templates {
    public static void main(String[] args) {
        System.out.println("Storage for java input validation methods");
    }

    private static int positiveIntegerInput(String message) {
        Scanner sc = new Scanner(System.in);
        int number_input;
        do {
            System.out.println(message);
            while (!sc.hasNextInt()) {
                String invalid_input = sc.next();
                System.out.printf("\"%s\" is not valid input, please try again\n" ,invalid_input);
            }
            number_input = sc.nextInt();
        } while (number_input < 0);
        return number_input;
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

    private static char letterInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        char ch = input.next().charAt(0);
        while (!Character.isLetter(ch)) {
            System.out.println("Input is invalid");
            System.out.println(message);
            ch = input.next().charAt(0);
        }
        return ch;
    }

    private static String wordInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.next();
    }

    private static String lineInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    private static double positiveDoubleInput(String message) {
        Scanner sc = new Scanner(System.in);
        double number_input;
        do {
            System.out.println(message);
            while (!sc.hasNextDouble()) {
                String invalid_input = sc.next();
                System.out.printf("\"%s\" is not valid input, please try again\n" ,invalid_input);
            }
            number_input = sc.nextDouble();
        } while (number_input < 0);
        return number_input;
    }

}
