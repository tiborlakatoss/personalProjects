package com.sda.tibi.fundamentals.moreHomework;

import java.util.Scanner;

public class integerSumAdd {

	public static void main(String[] args) {

//		33. Write a Java program and compute the sum of the digits of an integer. Go to the editor
//		Input Data:
//		Input an integer: 25
//		Expected Output
//		The sum of the digits is: 7
public static void numberPrintv  ( ); {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your number: "+calculate(0));
		int sum = scan.nextInt();
		
}
		}

	public static int calculate(int n) {

		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
			System.out.println("the sum of the digit is: " + sum);
		}
		return n;

	}

}
