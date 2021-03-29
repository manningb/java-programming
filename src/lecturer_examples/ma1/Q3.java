package ma1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// Generate a random number to be guessed
		int number  = (int)(Math.random() * 101);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Guess a number between 0 and 100.");
		
		int guess = -1;
		while(guess != number){
			System.out.println("Enter your guess:");
			guess = in.nextInt();
			if(guess == number) {
				System.out.println("Correct!");
			}else if (guess > number){
				System.out.println("Too high.");
			}
			else {
				System.out.println("Too low.");
			}
						
		}
		in.close();
	}

}

