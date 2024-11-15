package week1.day2.homeassigments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// Initialize the array
		int[] input= {1,4,3,2,8,6,7};
        // Sort the array
		Arrays.sort(input);
        // Find the missing element
		int missingNumber = -1;
		for (int i = 0; i < input.length-1; i++) {
			if (input[i + 1] != input[i] + 1) {
                missingNumber = input[i] + 1;
                break;
            }
		}	
		// Print the missing number
	        if (missingNumber != -1) {
	            System.out.println("Missing Number: " + missingNumber);
	        } else {
	            System.out.println("No missing number in the given list.");
	        }
	    }
			
}
