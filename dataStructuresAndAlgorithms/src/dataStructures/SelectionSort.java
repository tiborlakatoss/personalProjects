package dataStructures;

public class SelectionSort {

	public static void main(String[] args) {

		MainSort.readNumbers();

	}

	static int[] sortArrayUsingFor(int[] numbers) {
		int temp;
		int min = numbers[0];
		int minPosition = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < numbers[minposition]) {
				minPosition = i;
			}

		}

		return numbers;
	}

}
