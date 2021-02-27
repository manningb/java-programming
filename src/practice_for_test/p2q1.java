package practice_for_test;

import java.util.Scanner;

public class p2q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input side 1: ");
        double side1 = input.nextDouble();
        System.out.println("Please input side 2: ");
        double side2 = input.nextDouble();
        System.out.println("Please input side 3: ");
        double side3 = input.nextDouble();
        if (side1 + side2 > side3 && side3 + side2 > side1 && side3 + side1 > side2) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
