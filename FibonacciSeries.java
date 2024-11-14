package week1.day1.homeassigments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//This Java program is to calculate and print the Fibonacci Series for a specified range.
		int range=8, firstTerm=0, secondTerm =1;
		System.out.println("Fibonacci Series till " + range + " terms:");

		for (int i =1; i <= range; ++i) {
			System.out.print(firstTerm + ", ");
			
			// compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
		}
		}
	}


