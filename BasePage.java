package week3.day1.homeassignments;

/*Create a Java class named BasePage - 
  Create methods like findElement(), clickElement(), enterText() and performCommonTasks().
*/
public class BasePage {
	public void findElement() {
		System.out.println("From BasePage class - printing from findElement method");
	}
	public void clickElement() {
		System.out.println("From BasePage class - printing from clickElement method");
	}
	public void enterText() {
		System.out.println("From BasePage class - printing from enterText method");
	}
	public void performCommonTasks() {
		System.out.println("From BasePage class - printing from performCommonTasks method");
	}
	
	public static void main(String[] args) {
		BasePage bp= new BasePage();
		//calling the methods from BasePage class
		bp.findElement();
		bp.clickElement();
		bp.enterText();
		bp.performCommonTasks();
	}
}

