package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewAccountPage extends ProjectSpecificMethod {
	public ViewAccountPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public ViewAccountPage viewAccountDetails() {
		String accNameCreated = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println("Account is created successfully : " + accNameCreated);
		return this;
	}
}
