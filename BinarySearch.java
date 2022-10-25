package com.assignmentday16.algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
	
	public static void main(String[] args) throws IOException {
		
		 // list that holds strings of a file
        List<String> listOfStrings
            = new ArrayList<String>();
       
        // load data from file
        BufferedReader bf = new BufferedReader(
            new FileReader("TextReadingFile.txt"));
       
        // read entire line as string
        String line = bf.readLine();
       
        // checking for end of file
        while (line != null) {
            listOfStrings.add(line);
            line = bf.readLine();
        }
       
        // closing bufferreader object
        bf.close();
       
        // storing the data in arraylist to array
        String[] array
            = listOfStrings.toArray(new String[0]);
       
        // printing each line of file
        // which is stored in array
        for (String str : array) {
            System.out.println(str);
        }
        
        String x = "bufferreader";
        int result = binarySearch(array, x);
 
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                              + "index " + result);
	}
	
	static int binarySearch(String[] arr, String x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            int res = x.compareTo(arr[m]);
 
            // Check if x is present at mid
            if (res == 0)
                return m;
 
            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        return -1;
    }
}

	
	

