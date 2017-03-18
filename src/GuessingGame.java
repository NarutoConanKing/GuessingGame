
/*Daniel McFadden
 *30 September 2015
 *Chapter 7 #1
 *Guessing game
 */

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int compNum = (int) Math.ceil(Math.random() * 100);
		int userGuess;
		int numOfUserGuesses = 0;
		// ^^Declare variables that will be used
		System.out.println("The computer has a number in its head from 1 - 100. " 
							+ "It is your goal to guess that number.");
		System.out.println("The computer will give you a hint as to how close you are " 
							+ "to guessing the number.");
		System.out.println("Guess a number 1-100: ");
		//System.out.println(compNum);
		// ^^A way to easily test myself
		userGuess = reader.nextInt();
		if (userGuess <= 0 || userGuess > 100) {
			System.out.println("What are you doing! That is not a valid number!");
			System.out.println("Stop! Seriously, you're breaking the law! Stop!");
			return;
		}
		while (userGuess != compNum) {
			if (userGuess > compNum) {
				System.out.println("Too High!");
				System.out.println("Guess again: ");
				userGuess = reader.nextInt();
				numOfUserGuesses++;
			} else {
					System.out.println("Too Low!");
					System.out.println("Guess again: ");
					userGuess = reader.nextInt();
					numOfUserGuesses++;
			}
		}
		if (userGuess == compNum) {
			numOfUserGuesses++;
			System.out.println("Wow! You got it right!");
			if (numOfUserGuesses == 1) {
				System.out.println("It took you: " + numOfUserGuesses + " guess to find " 
									+ "the number!");
			} else {
				System.out.println("It took you: " + numOfUserGuesses + " guesses to find " 
									+ "the number!");
			}
		}
	}
}
