package week3.day2.homeassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElementUsingList {

	public static void main(String[] args) {
		
		//Declare an array {1, 2, 3, 4, 10, 6, 8}
		Integer[] arr1 = {1, 2, 3, 4, 10, 6, 8};
		//converting array to List
		List<Integer> list = new ArrayList<>(Arrays.asList(arr1));
		//sorting the list
		Collections.sort(list);
	    //Do a comparison check if there is a gap in the sequence of numbers. 
        System.out.println("Missing numbers in the sequence:");
        for (int i = 0; i < list.size()-1; i++) {
        	int currentSequence = list.get(i);
        	int nextSequence = list.get(i+1);
        	
        	//compare the values
        	if(currentSequence+1 != nextSequence) {
        		for (int j = currentSequence+1; j < nextSequence; j++) {
        			System.out.println(j); //Print the numbers that are missing.
					}
        	}
   		}
  	}
}
