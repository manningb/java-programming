package practice_for_test;

import java.util.Scanner;

public class p1q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a distance to drive: ");
        int distance = input.nextInt();
        System.out.println("Please input a fuel efficiency in mpg: ");
        int fuelEff = input.nextInt();
        System.out.println("Please input a price per gallon to drive: ");
        int pricePerGal = input.nextInt();
        int cost = pricePerGal * distance / fuelEff;
        System.out.println("Cost is " + cost);
    }
}
