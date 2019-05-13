
// TODO Auto-generated method stub
//		Write a Guess the Number game that has three levels of difficulty. The first level of difficulty would 
//		be a number between 1 and 10. The second difficulty
////		set would be between 1 and 100. The third difficulty set would be between 1 and 1000. Prompt for the 
//		difficulty level, and then start the game.The computer picks a random number in that range and prompts the player to guess that number.
//		Each time the player guesses, the compute should give the player a hint as to whether the number is too high or too low. 
//		The computer should also keep track of the number of guesses. Once the player guesses the correct number, 
//		the computer should present the number of guesses and ask if the player would like to play again.
////
////		Let's play Guess the Number.
//		Pick a difficulty level (1, 2, or 3): 1
//		I have my number.
//		What's your guess?
//		1
//		Too low. Guess again:F
//		5
//		Too high. Guess again:
//		2
//		You got it in 3 guesses!
//		Play again? n
//		Goodbye!
package com.sda.tibi.fundamentals.homework;

import java.util.Scanner;

public class GuessTheNumber {
//	System.out.println(random.nextInt());

	public static void main(String[] args) {

		int randomNumber;
		int guess;
		int level;
		int replay;
		int i = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Hi there! Please select difficulty level (1,2 or 3): ");
			level = scan.nextInt();
			// LEVEL 1
			if (level == 1) {
				System.out.println("Your guess between 1 and 10 is: ");
				guess = scan.nextInt();
				randomNumber = (int) (Math.random() * 10);
				do {
					if (guess < randomNumber) {
						System.out.println("Try a higher number: ");
						i++;
						guess = scan.nextInt();
					}
					if (guess > randomNumber) {
						System.out.println("Try a lower number: ");
						i++;
						guess = scan.nextInt();
					}
					if (guess == randomNumber) {
						System.out.println("You've guessed! First level complete!");
						i++;
						if (i <= 2) {
							System.out.println("Number of steps: " + i + ". You're a mind reader!");
						}
						if (i > 2 & i <= 5) {
							System.out.println("Steps: " + i + ". You're a quick guesser!");

						}
						if (i > 5) {
							System.out.println("Steps: " + i + ". You should improve. Keep up the good work!");
						}
					}

				} while (guess != randomNumber);

			}
			// LEVEL 2
			if (level == 2) {

				System.out.println("Your guess between 1 and 100 is: ");
				guess = scan.nextInt();
				randomNumber = (int) (Math.random() * 100);
				do {
					if (guess < randomNumber) {
						System.out.println("Try a higher number: ");
						i++;
						guess = scan.nextInt();
					}
					if (guess > randomNumber) {
						System.out.println("Try a lower number: ");
						i++;
						guess = scan.nextInt();
					}
					if (guess == randomNumber) {
						System.out.println("You've guessed! First level complete!");
						i++;
						if (i <= 2) {
							System.out.println("Number of steps: " + i + ". You're a mind reader!");
						}
						if (i > 2 & i <= 5) {
							System.out.println("Steps: " + i + ". You're a quick guesser!");

						}
						if (i > 5) {
							System.out.println("Steps: " + i + ". You should improve. Keep up the good work!");
						}
					}

				} while (guess != randomNumber);

			}
			// LEVEL 3
			if (level == 3) {

				System.out.println("Your guess between 1 and 1000 is: ");
				guess = scan.nextInt();
				randomNumber = (int) (Math.random() * 1000);
				do {
					if (guess < randomNumber) {
						System.out.println("Try a higher number: ");
						i++;
						guess = scan.nextInt();
					}
					if (guess > randomNumber) {
						System.out.println("Try a lower number: ");
						i++;
						guess = scan.nextInt();
					}
					if (guess == randomNumber) {
						System.out.println("You've guessed! First level complete!");
						i++;
						if (i <= 2) {
							System.out.println("Number of steps: " + i + ". You're a mind reader!");
						}
						if (i > 2 & i <= 5) {
							System.out.println("Steps: " + i + ". You're a quick guesser!");

						}
						if (i > 5) {
							System.out.println("Steps: " + i + ". You should improve. Keep up the good work!");
						}
					}

				} while (guess != randomNumber);

			}
			System.out.println("Do you want to play again (0/1)?");
			replay = scan.nextInt();
		} while (replay != 0);
		System.out.println("Thanks for playing. Goodbye!");
	}
}