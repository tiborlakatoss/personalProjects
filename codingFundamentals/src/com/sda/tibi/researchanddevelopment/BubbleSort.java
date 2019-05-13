package com.sda.tibi.researchanddevelopment;

//Bubble sort: repeatedly compare neighbor pairs and swap if necessary.
public class BubbleSort {

	static long nrOfSteps = 0;

	void bubbleSort(int arr[]) {

		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					nrOfSteps++;
				}
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		BubbleSort ob = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90, 15, 12, 11, 16, 80, 44 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
		System.out.println("number of steps " + nrOfSteps);
	}
}
