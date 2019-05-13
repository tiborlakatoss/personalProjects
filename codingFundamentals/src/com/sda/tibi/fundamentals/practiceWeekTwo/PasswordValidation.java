//A website requires the users to input username and password to register. 
//		Write a program to check the validity of password input by users.
//Following are the criteria for checking the password:
//1. At least 1 letter between [a-z]
//2. At least 1 number between [0-9]
//1. At least 1 letter between [A-Z]
//3. At least 1 character from [$#@]
//4. Minimum length of transaction password: 6
//5. Maximum length of transaction password: 12
//
//Extra:
//Your program should accept a sequence of comma separated passwords and will check them according to the above criteria.
//		Passwords that match the criteria are to be printed, each separated by a comma.
//Example
//If the following passwords are given as input to the program:
//ABd1234@1,a F1#,2w3E*,2We3345
//Then, the output of the program should be:
//ABd1234@1

package com.sda.tibi.fundamentals.practiceWeekTwo;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {

		String sentence;
		System.out.println("enter your password: ");
		Scanner scanner = new Scanner(System.in);
		sentence = scanner.nextLine();

		int bigLetter = 0;
		int numbers = 0;
		int simbols = 0;
		int smallLetter = 0;

		for (int i = 0; i < sentence.length(); i++)

			if (sentence.charAt(i) >= 'A' && sentence.charAt(i) < 'Z') {
				bigLetter++;

			} else if (sentence.charAt(i) >= 'a' && sentence.charAt(i) < 'z') {

				smallLetter++;
			} else if (sentence.charAt(i) >= '0' && sentence.charAt(i) <= '9') {
				numbers++;

			} else if (sentence.charAt(i) == '$' || sentence.charAt(i) == '#' || sentence.charAt(i) == '@')

			{
				simbols++;
			}
		if (smallLetter > 0 && bigLetter > 0 && numbers > 0 && simbols > 0 && sentence.length() > 6
				&& sentence.length() < 12) {
			System.out.println("your password is valid");
		} else {
			System.out.println("your password is invalid ");
		}

	}
}
