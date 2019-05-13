package com.sda.tibi.fundamentals.moreHomework;

import java.util.Scanner;

public class ReturnChangeCsabi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double amount, price, change;
		int bill500 = 0, bill200 = 0, bill100 = 0, bill50 = 0, bill10 = 0, bill5 = 0, bill1 = 0;
		int coin50 = 0, coin10 = 0, coin5 = 0, coin1 = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in the amount: ");
		amount = scanner.nextFloat();
		System.out.println("Type in the price: ");
		price = scanner.nextFloat();
		change = amount - price;
		System.out.println("Your change is: " + change);

		if (change / 500 > 0) {
			bill500 = (int) change / 500;
			System.out.println("No. of 500 bills: " + bill500);
			change = change % 500;
//				System.out.println("Change: " + change);
		}
		if (change / 200 > 0) {
			bill200 = (int) change / 200;
			System.out.println("No. of 200 bills: " + bill200);
			change = change % 200;
//				System.out.println("Change: " + change);
		}
		if (change / 100 > 0) {
			bill100 = (int) change / 100;
			System.out.println("No. of 100 bills: " + bill100);
			change = change % 100;
//				System.out.println("Change: " + change);
		}
		if (change / 50 > 0) {
			bill50 = (int) change / 50;
			System.out.println("No. of 50 bills: " + bill50);
			change = change % 50;
//				System.out.println("Change: " + change);
		}
		if (change / 10 > 0) {
			bill10 = (int) change / 10;
			System.out.println("No. of 10 bills: " + bill10);
			change = change % (bill10 * 10);
//				System.out.println("Change: " + change);
		}
		if (change / 5 > 0) {
			bill5 = (int) change / 5;
			System.out.println("No. of 5 bills: " + bill5);
			change = change % 5;
//				System.out.println("Change: " + change);
		}
		if (change / 1 > 0) {
			bill1 = (int) change / 1;
			System.out.println("No. of 1 bills: " + bill1);
			change = change % 1;
			System.out.println("Change: " + change);
		}
		if (change / 0.5 > 0) {
			coin50 = (int) (change / 0.5);
			System.out.println("No. of 50 coins: " + coin50);
			change = change % (0.5);
//				System.out.println("Change: " + change);
		}
		if (change / 0.1 > 0) {
			coin10 = (int) (change / 0.1);
			System.out.println("No. of 10 coins: " + coin10);
			change = change % (0.1);
//				System.out.println("Change: " + change);
		}
		if (change / 0.05 > 0) {
			coin5 = (int) (change / 0.05);
			System.out.println("No. of 5 coins: " + coin5);
			change = change % (0.05);
//				System.out.println("Change: " + change);
		}
		if (change / 0.01 > 0) {
			coin1 = (int) (change / 0.01);
			System.out.println("No. of 1 coins: " + coin1);
		}
	}
}
