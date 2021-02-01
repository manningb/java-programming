package practical1;

import java.util.Scanner;
import java.lang.Math;

public class q4 {
    public static void main(String[] args) {
        Scanner outsideTemp = new Scanner(System.in);  // Create a Scanner object for radius
        System.out.println("Enter outside temperature:");
        double outsideTempIn = outsideTemp.nextDouble();  // Read user input
        Scanner windSpeed = new Scanner(System.in);  // Create a Scanner object for radius
        System.out.println("Enter wind speed:");
        double windSpeedIn = windSpeed.nextDouble();  // Read user input
        double windChillTemp = 35.74 + (0.6215 * outsideTempIn) - 35.75 * Math.pow(windSpeedIn, 0.16) + 0.4275 * outsideTempIn * Math.pow(windSpeedIn, 0.16);
        System.out.println("Wind chill temperature is " + windChillTemp);
    }
}
