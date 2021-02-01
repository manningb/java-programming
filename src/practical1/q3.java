package practical1;

import java.util.Scanner;
import java.lang.Math;

public class q3 {
    public static void main(String[] args) {
        Scanner x1 = new Scanner(System.in);  // Create a Scanner object for radius
        System.out.println("Enter x1");
        double x1In = x1.nextDouble();  // Read user input
        Scanner y1 = new Scanner(System.in);  // Create a Scanner object for radius
        System.out.println("Enter y1");
        double y1In = y1.nextDouble();  // Read user input
        Scanner x2 = new Scanner(System.in);  // Create a Scanner object for radius
        System.out.println("Enter x2");
        double x2In = x1.nextDouble();  // Read user input
        Scanner y2 = new Scanner(System.in);  // Create a Scanner object for radius
        System.out.println("Enter y2");
        double y2In = y2.nextDouble();  // Read user input

        double distance = Math.pow((Math.pow((x2In - x1In), 2) + Math.pow((y2In - y1In), 2)),(0.5));
        System.out.println(distance);
    }
}
