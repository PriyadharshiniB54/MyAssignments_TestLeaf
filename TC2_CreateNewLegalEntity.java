package week5.day1.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC2_CreateNewLegalEntity extends ProjectSpecificMethod {
  @Test
	public void createNewLegalEntityErrorCheck() {
		
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		
		// Click the Status dropdown
        WebElement statusDropdown = driver.findElement(By.xpath("//label[text()='Status']/following-sibling::div//button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", statusDropdown);

        // Select "Active" from the dropdown
        WebElement activeOption = driver.findElement(By.xpath("//span[text()='Active']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", activeOption);
        		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String errormessage = driver.findElement(By.xpath("//div[@id='help-message-149']")).getText();
		System.out.println("Alert message displayed for field : "+errormessage);
		}
}
