package practical1;

import java.util.Scanner;  // Import the Scanner class
import java.lang.Math.*;

public class q1 {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);  // Create a Scanner object for radius
        System.out.println("Enter radius");
        double radiusIn = radius.nextDouble();  // Read user input

        Scanner length = new Scanner(System.in);  // Create a Scanner object for length


        System.out.println("Enter length");
        double lengthIn = length.nextDouble();  // Read user input

        double area = Math.PI * radiusIn * radiusIn;
        double vol = area * lengthIn;
        System.out.println("The area of the cylinder is " + area);
        System.out.println("The volume of the cylinder is " + vol);
    }
}
