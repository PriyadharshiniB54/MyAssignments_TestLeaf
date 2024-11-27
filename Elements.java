package week3.day1.homeassignments;

/*Execution Class: Elements - 
  Create execution class named , also inheriting from the Button subclass.
*/
public class Elements extends Button {
	

	public static void main(String[] args) {
		Elements e = new Elements();
		
		e.click(); //calling WebElement base class method
		e.setText("From Elements Subclass Value"); //calling WebElement base class method
		e.submit(); //calling inherited Button sub class method
	}
}
