package com.sda.tibi.fundamentals.practice;

import java.util.Scanner;

public class ScannerPracticeNextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;

		Scanner scanner = new Scanner(System.in);

		System.out.println("start number");
		int startNumber = scanner.nextInt();
		System.out.println("end number");
		int endNumber = scanner.nextInt();

		for (i = startNumber; i <= endNumber; i++) {

			System.out.print(i);

			System.out.println(endNumber);

		}

	}

}
