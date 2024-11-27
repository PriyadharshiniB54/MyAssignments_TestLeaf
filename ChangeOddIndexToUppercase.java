package week3.day1.homeassignments;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		System.out.println("Input Text: "+ test);
       
		// Convert the string to a character array
		char[] ch=test.toCharArray();
		for (int i = ch.length-1 ; i >= 0; i--) {
            // Check if the index is odd and change the character to uppercase only if the index is odd
			if(i%2!=0) {
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}
        // Print the modified characters as a String
		 String result = new String(ch);
	        System.out.println("ChangeOddIndexToUppercase ouptut is :" +result); 
	}
}
