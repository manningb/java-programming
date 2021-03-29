package practice_for_test;

import java.util.Scanner;

public class ma1q1 {
    public static void main(String[] args) {
        double v = positiveDoubleInput("Please input the speed: ");
        double a = positiveDoubleInput("Please input the acceleration: ");
        char c = letterInput("Please input w for wet or d for dry");
        double runway_len = Math.pow(v, 2) / (2 * a);
        if (c == 'i') {
            System.exit(0);
        } else if (c == 'w') {
            runway_len *= 1.15;
        }
        System.out.printf("The runway length is %f", runway_len);
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
    private static char letterInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        char ch = input.next().charAt(0);
        if (ch == 'w' || ch == 'd') {
            return ch;
        } else {
            return 'i';
        }
    }

}
