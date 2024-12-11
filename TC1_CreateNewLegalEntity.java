package week5.day1.homeassignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC1_CreateNewLegalEntity extends ProjectSpecificMethod {
	@Test
	public void createNewLegalEntity() {

		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Priyadharshini Boopalan");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String getLegalEntityName = driver.findElement(By.xpath("//lightning-formatted-text[@data-output-element-id='output-field']")).getText();
		System.out.println("Legal Entity Name is displayed as - "+getLegalEntityName);
		
	}

}
