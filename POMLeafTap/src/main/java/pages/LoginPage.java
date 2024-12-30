package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {

	public LoginPage(ChromeDriver driver) {
		this.driver = driver;	
	}
	
	public LoginPage enterUserName(String uName	) {
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;
	}

	public LoginPage enterPassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
		return this;
	}

	public WelcomePage clickOnLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);		
	}
}
