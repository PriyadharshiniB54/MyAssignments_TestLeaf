package week3.day1.homeassignments;

/*Create a superclass as TestData. 
Implement 2 methods: enterCredentials(), navigateToHomePage() in the TestData class.
*/

public class TestData {
	
	public void enterCredentials()	{
		System.out.println("From Super class - printing from enterCredentials method");
	}
	public void navigateToHomePage() {
		System.out.println("From Super class - printing from navigateToHomePage method");
	}

	public static void main(String[] args) {
	TestData td = new TestData();
	td.enterCredentials();
	td.navigateToHomePage();
	}

}
