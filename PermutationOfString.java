package com.assignmentday16.algorithm;

public class PermutationOfString {
	public static String swapStringCharacter(String str, int  first, int next){
	    char[] str1 = str.toCharArray();
	    char ch;
	    ch = str1[first];
	    str1[first] = str1[next];
	    str1[next]= ch;
	    return String.valueOf(str1);
	}
	    public static void main(String[] args) {

	    String str = "ABC";
	    int len = str.length();
	        System.out.println("All the permutation of the String are :");
	        permutationGenerator(str,0,len);


	    }

	    private static void permutationGenerator(String str, int start, int len) {
	   // print the permutation of string
	        if(start == len-1)
	            System.out.println(str);
	        else{
	            for (int i = start; i < len ; i++){
	                str =  swapStringCharacter(str,start,i);
	                
	                permutationGenerator(str, start+1, len);
	                str =  swapStringCharacter(str,start,i);
	                
	            }
	        }
	    }

	}



