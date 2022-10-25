package com.assignmentday16.algorithm;

import java.util.Arrays;

public class AnagramDetectionString {

	public static void main(String[] args) {

		String str1 = "Earth";
		String str2 = "HEart";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) {

			// strings to char Array conversion

			char[] chArray1 = str1.toCharArray();
			char[] chArray2 = str2.toCharArray();

			Arrays.sort(chArray1);
			Arrays.sort(chArray2);

			// if the sorted arrays are same then the string Anagram
			boolean result = Arrays.equals(chArray1, chArray2);
			if (result)
				System.out.println(str1 + " and " + str2 + " are anagram");
			else
				System.out.println(str1 + " and " + str2 + " are not anagram");
		}
	}

}
