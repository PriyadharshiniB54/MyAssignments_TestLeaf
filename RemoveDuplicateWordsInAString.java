package week3.day1.homeassignments;

public class RemoveDuplicateWordsInAString {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		String result="";
		System.out.println("Input Text: "+ text);
		String[] splitText = text.split(" ");
		int count;
		for (int i = 0; i < splitText.length; i++) {
			if(splitText[i].equals("")) continue;
			count = 1; // Reset count for the current word
			for (int j = i+1; j < splitText.length; j++) {
				if(splitText[i].equalsIgnoreCase(splitText[j])) {
                    count++; // Increment count if duplicate is found
					splitText[j]="";
				}
			}
			if (count > 1) {
                System.out.println("Duplicate word found: " + splitText[i]);
            }
		}	
		        for (String word : splitText) {
		            if (!word.equals("")) { // Skip empty strings
		                result += word + " ";
		            }
		        }
		
		        // Print the final result after trimming
		        System.out.println("Output: " + result.trim());
	}

}
