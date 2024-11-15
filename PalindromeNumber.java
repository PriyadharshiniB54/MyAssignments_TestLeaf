package week1.day2.homeassigments;

public class PalindromeNumber {

	public static void main(String[] args) {
		// This is a java program to find the given number is a Palindrome or not a Palindrome
		
		int input = 123454321 , output= 0 ;
		int original = input;  // Store original input
       
		// Reverse the number
        for (int i = input; i > 0; i /= 10) {
            int rem = i % 10;  // Get last digit
            output = output * 10 + rem;  // Add last digit to reversed number
            //System.out.println(" i="+i+"  remainder :"+ rem +" Output :"+output); //added to verify the how the logic works
        }
        
 
		// if given number equal to sum than number is palindrome otherwise not palindrome
        if (original == output) {
            System.out.println(input+" - It is a Palindrome.");
        } else {
            System.out.println(input+" - It is not a Palindrome.");
        } 
 
	}
}