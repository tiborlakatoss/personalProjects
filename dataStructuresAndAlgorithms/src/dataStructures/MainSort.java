package dataStructures;

import java.util.Scanner;

public class MainSort {

	public static void main(String[] args) {

//read numbers from imput:

		int[] numbersFromInput = readNumbers();
//		int[] orderedNumbers = sortArray(numbersFromInput);
		printArray(numbersFromInput);

	}

	// read using scanner,returna array of elements int[]
	public static int[] readNumbers() {
		int[] readNumbers = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your numbers : ");
		for (int i = 0; i < 5; i++) {

			readNumbers[i] = scanner.nextInt();

		}

		return readNumbers;
	}

//	static int[] sortArray(int[] numbers) {
//		// print each number ordered ascendind
//	
//		}

	public static void printArray(int[] array) {

		for (int i = 0; i < 10; i++) {
			System.out.println(readNumbers()[i] + " ");

		}
	}
}
