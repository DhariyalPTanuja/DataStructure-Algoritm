package com.assignmentday16.algorithm;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {

		String[] msgArray = userInputString();

		System.out.println(msgArray);

		String[] msgArray1 = new String[msgArray.length];
		String[] mergeSortedArray = mergeSort(msgArray, 0, msgArray.length - 1);
		for (int i = 0; i < mergeSortedArray.length; i++) {
			System.out.println(mergeSortedArray[i]);
		}

	}

	private static String[] userInputString() {
		int word;
		Scanner scanObj = new Scanner(System.in);
		System.out.println(" enter the string elements :");
		String[] msg = new String[10];
		for (word = 0; word < 10; word++) {
			msg[word] = scanObj.next();
		}

		return msg;

	}

	private static String[] mergeSort(String[] msgArray, int low, int high) {
		if (low == high) {
			String[] mergeArray = { msgArray[low] };
			return mergeArray;
		}

		int mid = low + (low + high) / 2;
		String[] mergeArray1 = mergeSort(msgArray, low, mid);
		String[] mergeArray2 = mergeSort(msgArray, mid + 1, high);

		String[] mergeArray = merge(mergeArray1, mergeArray2);
		return mergeArray;
	}

	static String[] merge(String[] mergeArr1, String[] mergeArr2) {
		int m = mergeArr1.length;
		int n = mergeArr2.length;
		String[] mergeArr = new String[m + n];

		int index = 0;

		int i = 0;
		int j = 0;

		while (i < m && j < n) {
			if (isAlphabeticallySmaller(mergeArr1[i], mergeArr2[j])) {

				mergeArr[index] = mergeArr1[i];
				i++;
				index++;
			} else {
				mergeArr[index] = mergeArr2[j];
				j++;
				index++;
			}
		}
		while (i < m) {
			mergeArr[index] = mergeArr1[i];
			i++;
			index++;
		}
		while (j < n) {
			mergeArr[index] = mergeArr2[j];
			j++;
			index++;
		}
		return mergeArr;
	}

	// Return true if str1 appears before
	// str2 in alphabetical order
	static boolean isAlphabeticallySmaller(String str1, String str2) {
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		if (str1.compareTo(str2) < 0) {
			return true;
		}
		return false;
	}
}
