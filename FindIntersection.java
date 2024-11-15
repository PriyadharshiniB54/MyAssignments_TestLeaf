package week1.day2.homeassigments;

public class FindIntersection {

	public static void main(String[] args) {
		// Initialize the arrays
		int a[]={3,2,11,4,6,7}, b[]={1,2,8,4,9,7};
		
		//Using a nested for loop to iterate over each element in both arrays
		
		System.out.println("Matching Elements are below ");
			for (int i = 0; i < a.length; i++) {
			for (int j = i; j < b.length; j++) {
				//condition to compare and find the matching element between 2 arrays
				if(a[i]==b[j]) {
					System.out.println(a[i]); //to print the matching element list} 
			}
			
		}
	}		
	}
}