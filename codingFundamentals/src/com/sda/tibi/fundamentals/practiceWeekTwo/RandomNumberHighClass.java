package com.sda.tibi.fundamentals.practiceWeekTwo;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberHighClass {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean wantToRetry = true;
		while (wantToRetry) {
			int difficultyLevel = difficultyLevelReader();
			boolean isValid = validateDifficulty(difficultyLevel);
			if (isValid) {
				int randomNumber = randomGenerator(difficultyLevel);
				guessTheNumber(randomNumber);
				wantToRetry = askRetry();
			}
		}
	}

	public static boolean askRetry() {
		System.out.print("Do you want to play again (y/n) ? ");
		String retry = scanner.next();
		return retry.equals("y");
	}

	public static int difficultyLevelReader() {
		System.out.print("Insert difficulty level (1,2 or 3):");
		int difficultyLevel = scanner.nextInt(); // -> 5
		// Print difficulty level to confirm is correct
		System.out.println("You picked difficulty lvl: " + difficultyLevel); // print 5
		return difficultyLevel;
	}

	public static boolean validateDifficulty(int difLevel) {
		if (difLevel >= 1 && difLevel <= 3) {
			System.out.println("Valid");
			return true;
		} else {
			System.out.println("Invalid option. Please pick a number between 1 and 3.");
			return false;
		}
	}

	public static int randomGenerator(int difficultyLvl) {
		Random random = new Random();
		int randomNumber = -1;
		if (difficultyLvl == 1) {
			randomNumber = random.nextInt(10) + 1;
		}
		if (difficultyLvl == 2) {
			randomNumber = random.nextInt(100) + 1;
		}
		if (difficultyLvl == 3) {
			randomNumber = random.nextInt(1000) + 1;
		}
		return randomNumber;
	}

	public static void guessTheNumber(int randomNo) {
		int yourGuess = 0;
		boolean hasGuessedNumber = false;
		// The computer should also keep track of the number of guesses.
		int contor = 0;
		do {
			// and prompts the player to guess that number
			System.out.print("Insert your guess : ");
			yourGuess = scanner.nextInt();
			System.out.println("Your guess was: " + yourGuess);
			contor++;
			if (yourGuess < randomNo) {
				System.out.println("Too low !");
			} else if (yourGuess > randomNo) {
				System.out.println("Too High !");
			} else {
				System.out.println("Correct ! You won !");
				System.out.println("Guesses : " + contor);
				hasGuessedNumber = true;
			}
			System.out.println("Number of tries: " + contor);
		} while (!hasGuessedNumber);
	}
}