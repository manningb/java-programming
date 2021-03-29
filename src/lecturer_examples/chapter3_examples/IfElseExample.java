/*
 * Using an if-else statement, the following program displays "Weekday" 
 * for day values of 1 to 5, "Weekend" for day values of 0 and 6, and 
 * "Invalid Day" otherwise.
 */

package chapter3_examples;

import java.util.Scanner;

public class IfElseExample {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a day
		System.out.println("Enter a day (0 to 6 inclusive): ");
		int day = input.nextInt();

		if(day >= 1 && day <= 5)
			System.out.println("Weekday"); 
		else if (day == 0 || day == 6)
			System.out.println("Weekend"); 
		else
			System.out.println("Invalid day");

		// Close the Scanner
		input.close();
	}
}
