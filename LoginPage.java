package week3.day1.homeassignments;

/*Create a subclass named LoginPage. 
- Override the performCommonTasks() method in the LoginPage class. 
- Demonstrate the concept by creating objects for both classes and calling their methods.
*/
public class LoginPage extends BasePage{

	@Override
	public void performCommonTasks() {
		System.out.println("From Sub class Method overriding - printing from performCommonTasks method");
	}
	
	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage();
		lp.performCommonTasks(); //calling Sub class Method overriding 
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		
		BasePage bp =new BasePage();//creating an object for base class and calling performCommonTasks method
		bp.performCommonTasks();
	}

}
