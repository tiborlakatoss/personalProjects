package com.sda.tibi.fundamentals.practiceWeekTwo;

import java.util.Scanner;

public class CharacterReadingPaulStyle {

	public static void main(String[] args) {
		String inputSentence = readInput();
		// identifyCharacters(inputSentence);
		identifyCharactersUsingUnicode(inputSentence);
	}

	public static String readInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert sentence: ");
		String line = scanner.nextLine();
		return line;
	}

	public static void identifyCharactersUsingUnicode(String sentence) {
		int letterNo = 0;
		int digitNo = 0;
		int otherNo = 0;
		for (int i = 0; i < sentence.length(); i++) {

			if ((sentence.charAt(i) >= 'A' && sentence.charAt(i) < 'Z')
					|| sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
				letterNo++;
			} else if (sentence.charAt(i) >= '0' && sentence.charAt(i) <= '9') {
				digitNo++;
			} else {
				otherNo++;
			}
		}
		System.out.println(letterNo);
		System.out.println(digitNo);
		System.out.println(otherNo);
	}

	public static void identifyCharacters(String sentence) {
		int letterNo = 0;
		int digitNo = 0;
		int otherNo = 0;
		for (int i = 0; i < sentence.length(); i++) {

			if (Character.isLetter(sentence.charAt(i))) {
				letterNo++;
			}
			if (Character.isDigit(sentence.charAt(i))) {
				digitNo++;
			}
			if (!Character.isLetter(sentence.charAt(i)) && !Character.isDigit(sentence.charAt(i))) {
				otherNo++;
			}

		}
//			System.out.println("Others: "+ results[2]);	
	}
}