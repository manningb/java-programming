package practice_for_test;

import java.util.Scanner;

public class p1q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a temp between -58F and 41F: ");
        double temp = input.nextDouble();
        while (temp < -58 || temp > 41) {
            temp = input.nextDouble();
        }
        System.out.println("Please input a winder speed greater than or equal to 2 in mph: ");
        double windSpeed = input.nextDouble();
        while (windSpeed < 2) {
            windSpeed = input.nextDouble();
        }
        double windChillTemp = 35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temp * Math.pow(windSpeed, 0.16);
        System.out.printf("The wind chill temp is %f", windChillTemp);
    }
}
