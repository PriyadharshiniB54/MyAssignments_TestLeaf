package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyAccountPage extends ProjectSpecificMethod{
	public MyAccountPage(ChromeDriver driver) {
		this.driver = driver;	
	} 
	
	public CreateAccountPage clickOnCreateAccountLink() {
		driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage(driver);
		
}
}
