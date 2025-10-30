package com.program;

public class SortingArray {

	public static void main(String[] args) {

		// i/p: {0,2,1,0,0,2,2,1,0,0}
		// o/p: {0,0,0,0,0,1,1,2,2,2}

		int[] array = { 0, 2, 1, 0, 0, 2, 2, 1, 0, 0 };
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - 1; j++) {

				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		for (int num : array) {
			System.out.println(num + "");
		}

	}
}