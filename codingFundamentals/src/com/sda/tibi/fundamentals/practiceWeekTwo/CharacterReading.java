
//		Write a program that accepts a sentence and calculate the number of letters, digits and other characters.
//		Suppose the following input is supplied to the program:
//		hello world! 123
//		Then, the output should be:
//		LETTERS 10
//		DIGITS 3
//		OTHER 3

package com.sda.tibi.fundamentals.practiceWeekTwo;

import java.util.Scanner;

public class CharacterReading {

	public static void main(String[] args) {

		String sentence = readInput();

		identifyCharacters(sentence);

	}

	public static String readInput()

	{

		Scanner scan = new Scanner(System.in);

		System.out.println("enter your sentence: ");
		String sentence = scan.nextLine();
		System.out.println("your sentence is : " + sentence);
		return sentence;
	}

	public static void identifyCharacters(String sentence) {
		int numbers = 0;
		int letters = 0;
		int simbols = 0;
		for (int i = 0; i < sentence.length(); i++) {

			if (Character.isDigit(sentence.charAt(i))) {

				numbers++;

			} else if (Character.isLetter(sentence.charAt(i))) {

				letters++;

			} else
				simbols++;

		}

		System.out.println("simbols: " + simbols);
		System.out.println("sentence: " + numbers);
		System.out.println("letters: " + letters);
	}
}
