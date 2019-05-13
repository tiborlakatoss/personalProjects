package com.sda.tibi.fundamentals.practice;

public class DivizibilCuSapteSauCinci {

	public static void main(String[] args) {
		/*
		 * Write a program which will find all numbers which are divisible by 7 but are
		 * not a multiple of 5, between 2177 and 3262 (both included). The numbers
		 * obtained should be printed in a comma-separated sequence on a single line in
		 * descending order.
		 */

		int a = 2177;
		int b = 3262;
		int i;

		for (i = a; i <= b; i++) {

			if (i % 7 == 0 && i % 5 != 0) {

				System.out.print(i + ",");

			}

		}
	}
}
