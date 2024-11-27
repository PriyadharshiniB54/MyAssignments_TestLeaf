package week3.day2.homeassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
		String[] arr1 = {"HCL", "Wipro", "Aspire Systems","CTS"};
		
		// Add the collection to a list Iterate the values in the list 
		List<String> list = new ArrayList<>(Arrays.asList(arr1));
		Collections.sort(list);
		
		System.out.println("Reverse the given collection of String elements : ");
		// Print the required output as Wipro, HCL, CTS, Aspire Systems
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i) + " , ");
		}
	}

}
