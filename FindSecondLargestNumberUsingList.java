package week3.day2.homeassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberUsingList {

	public static void main(String[] args) {
		
		//- Declare an array {3, 2, 11, 4, 6, 7}. - Pick the 2nd element from the last and print it.
		Integer[] arr1 = {3, 2, 11, 4, 6, 7};
		
		//converting array to List
		List<Integer> list = new ArrayList<>(Arrays.asList(arr1));
		//sorting the list
		Collections.sort(list);
        // Get the second largest element
		int secondLargestValue = list.get(list.size()-2);
		System.out.println("The Second largest number from the given array = " + secondLargestValue);
		}
}
