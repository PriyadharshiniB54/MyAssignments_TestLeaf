package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateAccountPage extends ProjectSpecificMethod {
	public CreateAccountPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateAccountPage enterAccountName(String accName) {
		driver.findElement(By.id("accountName")).sendKeys(accName);
		return this;
	}

	public CreateAccountPage enterDescription(String description) {
		driver.findElement(By.name("description")).sendKeys(description);
		return this;
	}

	public ViewAccountPage clickOnCreateAccountButton() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage(driver);
	}

}
