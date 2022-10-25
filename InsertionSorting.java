package com.assignmentday16.algorithm;

import java.util.Scanner;

public class InsertionSorting {

	public static void main(String[] args) {

		String[] msgArray = userInputString();

		System.out.println(msgArray);

		String[] insertionSortedArray = insertionSort(msgArray, msgArray.length);
		for (int i = 0; i < insertionSortedArray.length; i++) {
			System.out.println(insertionSortedArray[i]);
		}

	}

	public static String[] userInputString() {
		int word;
		Scanner scanObj = new Scanner(System.in);
		System.out.println(" enter the string elements :");
		String[] msg = new String[10];
		for (word = 0; word < 10; word++) {
			msg[word] = scanObj.next();
		}

		return msg;
	}

	public static String[] insertionSort(String[] msgArray, int n) {
		String temp = "";

		for (int i = 1; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (msgArray[i].compareToIgnoreCase(msgArray[j]) > 0) {
					temp = msgArray[i];
					msgArray[i] = msgArray[j];
					msgArray[j] = temp;
				}
			}

		}
		return msgArray;

	}
}