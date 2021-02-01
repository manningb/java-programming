package practical1;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner distance = new Scanner(System.in);
        System.out.println("Please enter the distance:");
        double distanceIn = distance.nextDouble();
        Scanner milesPerGallon = new Scanner(System.in);
        System.out.println("Please enter the miles per gallon:");
        double milesPerGallonIn = milesPerGallon.nextDouble();
        Scanner pricePerGallon = new Scanner(System.in);
        System.out.println("Please enter the price per gallon:");
        double pricePerGallonIn = pricePerGallon.nextDouble();

        double costOfTrip =  distanceIn / milesPerGallonIn * pricePerGallonIn;
        System.out.println("The cost of the trip is " + costOfTrip);
    }
}
