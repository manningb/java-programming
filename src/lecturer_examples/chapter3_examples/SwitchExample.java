/*
 * Using a switch statement, the following program displays "Weekday" 
 * for day values of 1 to 5, "Weekend" for day values of 0 and 6, and 
 * "Invalid Day" otherwise.
 */

package chapter3_examples;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a day
		System.out.println("Enter a day (0 to 6 inclusive): ");
		int day = input.nextInt();

		switch (day) {
		  case 1: 
		  case 2: 
		  case 3: 
		  case 4: 
		  case 5: System.out.println("Weekday"); break;
		  case 0:  
		  case 6: System.out.println("Weekend"); break;
		  default: System.out.println("Invalid day");
		}   

		// Close the Scanner
		input.close();
	}
}
