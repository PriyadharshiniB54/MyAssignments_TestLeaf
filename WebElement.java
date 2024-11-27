package week3.day1.homeassignments;

/*Base Class: WebElement - Create a base class named WebElement with common methods such as click() and setText(String text).*/

public class WebElement {
	
	 public void click() {
			System.out.println("From Base class - printing from click method");

	 }
	 public void setText(String text) {
			System.out.println("From Base class - printing from setText method. setText value = "+ text);
	 }
	
	public static void main(String[] args) {
		WebElement wb=new WebElement();
		wb.click();
		wb.setText("Testing_TestLeaf Methods");
		
	}

}
