package week3.day1.homeassignments;

/*Subclasses: TextField - inheriting from the WebElement base class. - 
 In the Button subclass, include a getText() method.
*/
public class TextField extends WebElement {
	
	public void getText() {
		System.out.println("From TextField sub class - printing from submit method");
	}

	public static void main(String[] args) {
		TextField t = new TextField();
		t.getText();
		t.click();  //calling WebElement base class method
		t.setText("From TextField Subclass Value"); //calling WebElement base class method
	}
}
