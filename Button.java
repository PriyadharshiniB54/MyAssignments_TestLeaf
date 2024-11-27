package week3.day1.homeassignments;

/*Subclasses: Button - inheriting from the WebElement base class. - 
 In the Button subclass, include a submit() method.
*/
public class Button extends WebElement {
	
	public void submit() {
		System.out.println("From Button sub class - printing from submit method");
	}

	public static void main(String[] args) {
		Button b = new Button();
		b.submit(); 
		b.click(); //calling WebElement base class method
		b.setText("From Button Subclass Value"); //calling WebElement base class method
	}
}
