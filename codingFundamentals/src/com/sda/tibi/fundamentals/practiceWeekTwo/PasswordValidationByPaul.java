package com.sda.tibi.fundamentals.practiceWeekTwo;

public class PasswordValidationByPaul {

	public static void main(String[] args) {
		validatePassword();
	}

	public static void validatePassword() {

//			String input = CustomInputReader.readInput("Insert password: "); citire din alte clase

		if (input.length() >= 6 && input.length() <= 12) {

			boolean hasUpperCaseLetter = false;
			boolean hasLowerCaseLetter = false;
			boolean hasDigit = false;
			boolean hasSymbol = false;

			for (int i = 0; i < input.length(); i++) {
				if (Character.isUpperCase(input.charAt(i))) {
					hasUpperCaseLetter = true;
				}
				if (Character.isLowerCase(input.charAt(i))) {
					hasLowerCaseLetter = true;
				}
				if (Character.isDigit(input.charAt(i))) {
					hasDigit = true;
				}
				if (input.charAt(i) == '$' || input.charAt(i) == '#' || input.charAt(i) == '@') {
					hasSymbol = true;
				}
			}
			if (hasUpperCaseLetter && hasLowerCaseLetter && hasDigit && hasSymbol) {
				System.out.println("Valid Password");
			} else {
				if (!hasUpperCaseLetter) {
					System.out.println("Missing Upper Letter");
				}
				if (!hasLowerCaseLetter) {
					System.out.println("Missing Lower Letter");
				}
				if (!hasDigit) {
					System.out.println("Missing Digit");
				}
				if (!hasSymbol) {
					System.out.println("Missing Symbol");
				}
			}
		} else {
			System.out.println("Invalid Length.");
		}

	}

}
