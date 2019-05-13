package com.sda.tibi.researchanddevelopment;
//Selection sort: repeatedly pick the smallest element to append to the result.

public class SelectionSort {

	static long nrOfSteps = 0;

	void sort(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
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
		SelectionSort ob = new SelectionSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90, 15, 12, 11, 16, 80, 44 };
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
		System.out.println("number of steps " + nrOfSteps);
	}
}