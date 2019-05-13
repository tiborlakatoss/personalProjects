package com.sda.tibi.fundamentals.homework;

import java.util.Scanner;

public class sumofnums {

	public static void main(String[] args) {
//		Write a program that prompts the user for five numbers and computes the total of the numbers.
//		Example Output
//		Enter a number: 1
//		Enter a number: 2
//		Enter a number: 3
//		Enter a number: 4
//		Enter a number: 5
//		The total is 15.

		Scanner numere = new Scanner(System.in);
		System.out.println("fisrt number is: ");
		int firstNumber = numere.nextInt();
		System.out.println("second number is: ");
		int secondNUmber = numere.nextInt();

		System.out.println("third number is: ");
		int thirdNumber = numere.nextInt();

		System.out.println("forth number is: ");
		int forthNumber = numere.nextInt();

		System.out.println("fifth number is: ");
		int fifthNumber = numere.nextInt();

		int sum = firstNumber + secondNUmber + thirdNumber + forthNumber + fifthNumber;
		System.out.println("the sum is : " + sum);
	}

}
