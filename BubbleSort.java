package com.assignmentday16.algorithm;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String a[]) {

		int[] userInputArray = userInputInteger();
		System.out.println("Value before the sorting:");
		System.out.println(userInputArray);

		bubbleSorting(userInputArray, userInputArray.length);

		System.out.println("Values after the sort:\n");
		for (int i = 0; i < userInputArray.length; i++)
			System.out.print(userInputArray[i] + "  ");
		System.out.println();
	}

	public static int[] userInputInteger() {
		int number;
		Scanner scanObj = new Scanner(System.in);
		System.out.println(" enter the integer elements :");
		int[] inputArray = new int[10];
		for (number = 0; number < 10; number++) {
			inputArray[number] = scanObj.nextInt();
		}

		return inputArray;
	}

	public static void bubbleSorting(int x[], int n) {
		int i, j, temp = 0;
		for (i = 0; i < n; i++) {
			for (j = 1; j < (n - i); j++) {
				if (x[j - 1] > x[j]) {
					temp = x[j - 1];
					x[j - 1] = x[j];
					x[j] = temp;
				}
			}
		}
	}
}
