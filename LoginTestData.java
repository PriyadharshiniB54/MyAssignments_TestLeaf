package week3.day1.homeassignments;

/*Create subclasses and 
 create 2 methods in each LoginTestData - enterUsername() - enterPassword() 
 Demonstrate the concept by creating objects for both classes and calling their methods.
*/
public class LoginTestData extends TestData{ //Extends TestData superclass

	public void enterUsername()	{
		System.out.println("From sub class - printing from enterUsername method");
	}
	public void enterPassword() {
		System.out.println("From sub class - printing from enterPassword method");
	}

	public static void main(String[] args) {
		LoginTestData data = new LoginTestData();
		data.enterUsername();
		data.enterPassword();
		data.enterCredentials(); //calling Superclass methods
		data.navigateToHomePage(); //calling Superclass methods
		
	}

}
