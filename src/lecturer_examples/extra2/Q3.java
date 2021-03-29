package practical5;

import java.util.Scanner;

public class Q3 {
	public static void main (String[] args) {
		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of integers
		System.out.println("Enter the number of integers: ");
		int size = input.nextInt();

		// Declare and create an array
		int[] list = new int[size];

		// Prompt the user to enter the integers
		System.out.println("Enter the integers: ");
		for (int i = 0; i < list.length; i++)
			list[i] = input.nextInt();

		// Check if the list has four consecutive numbers with the same value
		if (isConsecutiveFour(list))
			System.out.println("The array contains four consecutive integers");
		else
			System.out.println("The array does NOT contain four consecutive integers");

		// Close the Scanner
		input.close();
	}

	// Returns true if the array has (at least one instance of) four 
	// consecutive integers with the same value
	public static boolean isConsecutiveFour(int[] values) {    
		// The current element value is given by values[i] 
		// Iterate up to an including the 4th last element
		for (int i = 0; i < values.length - 3; i++) { 
			// Assume the next three element values are equal to values[i]
			boolean isEqual = true; 

			// Iterate over the next three element values
			for (int j = i + 1; j < i + 4; j++) { 
				// If values are not equal, set isEqual to false and break 
				// out of the inner for loop
				if (values[i] != values[j]) {  
					isEqual = false; 
					break;
				}
			}

			if (isEqual) // Return true if isEqual is still equal to true
				return true; 
		}

		// If this point is reached, there are no consecutive fours, return false 
		return false; 
	}
}

