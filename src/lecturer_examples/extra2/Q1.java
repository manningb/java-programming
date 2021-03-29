package Mon28Feb;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		// Prompt the user to enter how many numbers should be read
		Scanner input = new Scanner(System.in);
		System.out.print("Enter how many numbers to read: ");
		int count = input.nextInt();
		
		// Declare and create an array of size count 
		double[] numbers = new double[count];

		// Prompt the user to enter the numbers
		System.out.print("Enter " + numbers.length + " numbers: ");
		for (int i = 0; i < numbers.length; i++) 
			numbers[i] = input.nextDouble();

		// Calculate and display the mean and standard deviation
		double mean = getMean(numbers);
		double deviation = getStdDev(numbers);
		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is " + deviation);
		
		// Close the Scanner
		input.close();
	}

	// Returns the mean of double values
	public static double getStdDev(double[] values) {
		double sum = 0;
		double mean = getMean(values);
		for (double num: values)
			sum += Math.pow(num-mean, 2.0);

		return Math.sqrt(sum/values.length-1);
	}

	// Returns the mean of double values
	public static double getMean(double[] values) {
		double sum = 0;

		for (double num: values) {
			sum += num;
		}

		return (values.length > 0) ? sum / values.length : 0;
	}
}


