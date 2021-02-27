package practice_for_test;

import java.util.Scanner;

public class p1q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the radius: ");
        double radius = input.nextDouble();
        System.out.println("Please input the length: ");
        double length = input.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * length;
        System.out.printf("The volume is %.2f", volume);
    }
}
