package practice_for_test;

import java.util.Scanner;

public class p2q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = integerInput("Please input x1: ");
        int y1 = integerInput("Please input y1: ");
        double[] input_coords = {x1, y1};
        double[][] rectangle_coords = {{2.5, -5}, {2.5, 5}, {-2.5, -5}, {-2.5, 5}};
        double test1 = getDistance(input_coords, rectangle_coords[0]);
        double test2 = getDistance(rectangle_coords[1], rectangle_coords[0]);
        double test3 = getDistance(rectangle_coords[0], rectangle_coords[3]);
        double test4 = test1 * test2;
        double test5 = test2 * test2;
        double test6 = test1 * test3;
        double test7 = test3 * test3;
        System.out.printf("%f - %f - %f - %f - %f - %f - %f",test1, test2, test3, test4, test5, test6, test7);
        if (test4 > 0 && test5 * test5 > test4 && test6 > 0 && test7 > test6 ) {
            System.out.println("good");
        } else {
            System.out.println("bad");

        }
    }

    private static double getDistance(double[] p1, double[] p2) {
        return Math.sqrt(Math.pow(p2[1]-p1[1], 2) + Math.pow(p2[0]-p1[0], 2));
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
