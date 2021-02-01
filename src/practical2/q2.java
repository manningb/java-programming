package practical2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner len = new Scanner(System.in);
        System.out.println("Please enter the radius:");
        double radius = len.nextDouble();
        if (radius > 0) {
            System.out.println("Valid radius input");
            double area_output = area(side(radius));
            System.out.println("Area is " + area_output);
        } else {
            System.out.println("Invalid radius input, must be greater than 0");
        }
    }
    static double side(double radius){
        return 2 * radius * Math.sin(Math.PI/5);
    }
    static double area(double side){
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/5));
    }
}