package com.sda.tibi.fundamentals.homework;

public class OddNUmbersHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		48. Write a Java program to print the odd numbers from 1 to 99. Prints one number per line. Go to the editor
//		Sample Output:

		int a = 0;
		int b = 100;
		int i;

		for (i = a; i <= b; i++) {

			if (i % 2 != 0) {

				System.out.println(i);
			}

		}
	}
}
