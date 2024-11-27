package week3.day1.homeassignments;

public class ReverseOddWordsInAString {

	public static void main(String[] args) {
		String test = "I am a software tester";
		System.out.println("Input Text: "+ test);
        // divides the input into an array of words
		String[] splitText=test.split(" ");
		// Initialize an empty string for the result
        String result = "";
        
		for (int i = 0; i < splitText.length; i++) {
			if(i%2!=0) {
				String reversedWord = "";
				for (int j = splitText[i].length()-1; j >=0 ; j--) {
					reversedWord+=splitText[i].charAt(j);
				}
				result+=reversedWord+" ";
			} else {
				result += splitText[i] + " ";
				}
			}
        System.out.println("Output: " + result.trim());
	}

}
