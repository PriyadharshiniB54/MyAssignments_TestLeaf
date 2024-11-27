package week3.day1.homeassignments;

/*Develop a new class named RadioButton that inherits from the Button subclass. -
  In the RadioButton class, introduce a method named selectRadioButton().
*/
public class RadioButton extends Button {
	
	public void selectRadioButton() {
		System.out.println("From RadioButton sub class - printing from selectRadioButton method");
	}

	public static void main(String[] args) {
		RadioButton rb = new RadioButton();
		
		rb.click(); //calling WebElement base class method
		rb.setText("From RadioButton Subclass Value"); //calling WebElement base class method
		rb.submit(); //calling inherited Button sub class method
		rb.selectRadioButton(); 
	}
}
