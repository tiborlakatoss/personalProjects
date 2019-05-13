package com.sda.tibi.fundamentals.practiceWeekThree;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortPaul {
	static final int ARRAY_SIZE = 5;

	public static void main(String[] args) {
		// Read numbers from input:
		int[] numbersFromInput = readNumbers();
		int[] copyNumbersFromInput = Arrays.copyOf(numbersFromInput, numbersFromInput.length);
		int[] orderedNumbers = sortArrayUsingSelection(numbersFromInput);
		// printArray(orderedNumbers);
		// printArray(copyNumbersFromInput);

		System.out.print("Insert number to search:");
		Scanner scan = new Scanner(System.in);
		int searchThisNumber = scan.nextInt();

		int position = searchNumberPositionInArray(orderedNumbers, searchThisNumber);
		if (position != -1) {
			System.out.println("Found at: " + position);
		} else {
			System.out.println(searchThisNumber + " Not found in array.");
		}
	}

	static int searchNumberPositionInArray(int[] array, int numberToSearch) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numberToSearch) {
				return i;
			}
		}
		return -1;
	}

	static int[] sortArrayUsingSelection(int[] numbers) {
		// sort array;
		for (int j = 0; j < numbers.length - 1; j++) {
			int minPosition = j;
			for (int i = j + 1; i < numbers.length; i++) {
				if (numbers[i] < numbers[minPosition]) {
					minPosition = i;
				}
			}
			System.out.println("Min: " + numbers[minPosition]);
			int temp = numbers[j];
			numbers[j] = numbers[minPosition];
			numbers[minPosition] = temp;
			// end sort;
		}
		return numbers;
	}

	static int[] readNumbers() {
		// read using scanner , return array of elements int[]
		Scanner scanner = new Scanner(System.in);
		int[] inputArray = new int[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++) {
			int number = scanner.nextInt();
			inputArray[i] = number;
		}
		return inputArray;
	}

	static int[] sortArray(int[] numbers) {
		// return ordered array ascending
		int currentPosition = 0;
		while (currentPosition < numbers.length) {
			for (int i = 0; i < numbers.length - currentPosition - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
				}
			}
			currentPosition++;
		}
		return numbers;
	}

	static int[] sortArrayUsingFor(int[] numbers) {
		// return ordered array ascending
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers.length - j - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
				}
			}
		}
		return numbers;
	}

	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}