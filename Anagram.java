package week3.day1.homeassignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops",  text2 = "potss";
		System.out.println("Input text1: "+ text1);
		System.out.println("Input text2: "+ text2);
		
		// Check if the lengths are equal
        if (text1.length() != text2.length()) {
            System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
            return; // Exit the program
        }
        
		char[] chtext1 = text1.toCharArray(), chtext2 = text2.toCharArray();
		//sort the arrays		
		Arrays.sort(chtext1);
		Arrays.sort(chtext2);
		
		//Check if the sorted arrays are equal
		if(Arrays.equals(chtext1, chtext2)) {
			System.out.println("The given strings are Anagram");
		    }else {
		    	System.out.println("The given strings are not an Anagram");
		}
		
	}

}
