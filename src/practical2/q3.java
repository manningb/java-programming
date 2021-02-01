package practical2;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the x coordinate:");
        double x = input.nextDouble();
        System.out.println("Please enter the y coordinate:");
        double y = input.nextDouble();

        // assume that rectangle always centred at 0,0
        double rectangle_length = 10;
        double rectangle_width = 5;

        if (((Math.abs(x) == rectangle_length/2) && (Math.abs(y) <= rectangle_width/2)) || ((Math.abs(x) <= rectangle_length/2) && (Math.abs(y) == rectangle_width/2))){
            System.out.println("Coordinate lies on the perimeter of the rectangle");
        } else if ((Math.abs(x) < rectangle_length/2) && (Math.abs(y) < rectangle_width/2)){
            System.out.println("Coordinate lies within the rectangle");
        } else {
            System.out.println("Coordinate lies outside of the rectangle");
        }
    }
}
