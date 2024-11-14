package week1.day1.homeassigments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		//This is a java program to find the given number is Prime or not
		int num = 13;

		for (int i = 2; i < num-1; i++) {
			System.out.println("Input value : "+ num);
			if (num % i == 0) {
				System.out.println(num + "- This is non-Prime number"); 
				break;
			} else {
				System.out.println(num + " - This is Prime number");
				break;
			}
		}

	}
}
