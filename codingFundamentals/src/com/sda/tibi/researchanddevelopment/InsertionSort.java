package com.sda.tibi.researchanddevelopment;

//Insertion sort: repeatedly add new element to the sorted result.
public class InsertionSort {

	static long nrOfSteps = 0;

	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
			nrOfSteps++;
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90, 15, 12, 11, 16, 80, 44 };

		InsertionSort ob = new InsertionSort();
		ob.sort(arr);

		printArray(arr);
		System.out.println("numbers of steps " + nrOfSteps);
	}

}
