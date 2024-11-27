package week3.day2.homeassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		
		//Declare an array for {3, 2, 11, 4, 6, 7} - Declare another array for {1, 2, 8, 4, 9, 7}
		Integer[] arr1 = {3, 2, 11, 4, 6, 7};
		Integer[] arr2 = {1, 2, 8, 4, 9, 7};
		
		//convert array to List
		List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
		
		//compare the values and find intersection
		System.out.println("Intersection of arrays:");
		for(Integer num:list1) {
		if(list2.contains(num)) {
			System.out.println(num); }
		}
	}
		
}
