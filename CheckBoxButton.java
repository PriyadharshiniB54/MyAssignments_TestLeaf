package week3.day1.homeassignments;

/*Develop a new class named CheckBoxButton that inherits from the Button subclass. -
  In the CheckBoxButton class, introduce a method named clickCheckButton().
*/
public class CheckBoxButton extends Button {
	
	public void clickCheckButton() {
		System.out.println("From CheckBoxButton sub class - printing from clickCheckButton method");
	}

	public static void main(String[] args) {
		CheckBoxButton cb = new CheckBoxButton();
		
		cb.click(); //calling WebElement base class method
		cb.setText("From CheckBoxButton Subclass Value"); //calling WebElement base class method
		cb.submit(); //calling inherited Button sub class method
		cb.clickCheckButton(); 
	}
}
