package dataStructuresAndAlgorithms;

public class MainRecursion {

	static long nrOfOperationsRecursive = 0;
	static int nrOfOperationsIterative = 0;

	public static void main(String[] args) {
		// printNumbers();
		// fibonacciIterative();
		// printNumberRecursive(0);
		long startTimeMillis = System.currentTimeMillis();
		// System.out.println(startTimeMillis);
		// fibonacciIterative(100000);
		System.out.println("Number of operations iterative: " + nrOfOperationsIterative);
		int finalFibonacci = fibonacciRecursive(40);

		// System.out.println(finalFibonacci);
		System.out.println("Number of operations recursive: " + nrOfOperationsRecursive);
		long endTimeMillis = System.currentTimeMillis();
		long duration = endTimeMillis - startTimeMillis;
		System.out.println("Duration in milliseconds : " + duration);
		System.out.println("Duration in seconds: " + (duration / 1000));
	}

// 0 , 1, 1, 2, 3 , 5 , 8 ...
	static void fibonacciIterative(int number) {
		int nextNumber = 0;
		int firstNumber = 0;
		int secondNumber = 1;
		int n = number;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		for (int i = 1; i < n; i++) {
			nrOfOperationsIterative++;
			nextNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;
			System.out.println(nextNumber);
		}
	}

	static int fibonacciRecursive(int number) {
		nrOfOperationsRecursive++;
		// System.out.println(number);
		if (number <= 1) {
			// System.out.println(number);
			return number;
		} // 2 +
		int value = fibonacciRecursive(number - 2) + fibonacciRecursive(number - 1);
		// System.out.println(value);
		return value;
	}

	static void printNumberRecursive(int number) {
		System.out.println(number++);
		if (number >= 10) {
			System.out.println(number);
		} else {
			printNumberRecursive(number);
		}
	}

	static void printNumbers() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

}