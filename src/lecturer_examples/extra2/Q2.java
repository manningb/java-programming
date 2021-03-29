package practical5;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
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

		// Display the output
		if (isSorted(list))    
			System.out.println("The array is sorted");
		else
			System.out.println("The array is not sorted");
		
		// Close the Scanner
		input.close();
	}

	// A method to check whether an array of numbers is 
	// sorted in increasing order
	public static boolean isSorted(int[] arr) {
		
		// Iterate over each element (up to the and including the
		// 2nd last element)
		for (int i = 0; i < arr.length - 1; i++) 
			// If the current element is greater that the next 
			// element, then the array is not sorted
			if (arr[i] > arr[i + 1]) 
				return false;

		// If this point is reached, the array is sorted
		return true; 
	}
}

