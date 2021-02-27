package practice_for_test;

import java.util.Scanner;

public class p1q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input x1: ");
        int x1 = input.nextInt();
        System.out.println("Please input x2: ");
        int x2 = input.nextInt();
        System.out.println("Please input y1: ");
        int y1 = input.nextInt();
        System.out.println("Please input y2: ");
        int y2 = input.nextInt();
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.printf("The distance between 1 and 2 is %f", distance);
    }
}
