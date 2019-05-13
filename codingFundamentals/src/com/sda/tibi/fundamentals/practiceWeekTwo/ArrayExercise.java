package com.sda.tibi.fundamentals.practiceWeekTwo;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayExercise {

	public static void main(String[] args) {
//		Write a program that reads numbers and adds them into an array until a negative number is inserted. \
//		Build another array that has the sum of the element and neighbours for each element from the array. 
//		If there is no neighbor, consider 0 value on the missing position.
//		Example:
//		Input array: 1 2 3 4 5
//		Sum of Neighbours array: 3 6 9 12 9
		Scanner scanner = new Scanner(System.in);

		do {
			int total = 0;
			int arrays[] = new Array[10];

			int sum;
			for (int i = 0; i <= 4; i++) {
				sum = scanner.nextInt();

				System.out.print("your first number is:" + sum);
			}
			for (int i = 0; i <= arrays.length - 1; i++) {

				if (i == 0) {
					sum = arrays[i] + arrays[i + 1];

				} else if (i == arrays.length - 1) {
					sum = arrays[i - 1] + arrays[i];
				} else {
					sum = arrays[i] + arrays[i - 1] + arrays[i + 1];
				}

				System.out.println(sum + " ");
			}

		} while (total > 0);

	}

}
