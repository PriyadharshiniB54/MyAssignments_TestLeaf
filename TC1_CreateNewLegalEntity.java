package week5.day2.homeassignments;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC1_CreateNewLegalEntity extends ProjectSpecificMethod {
	
	@DataProvider(name="getData")
	public String[][] fetchData() throws IOException{
		return DataLibrary.readValue();
	}
	
	@Test(dataProvider = "getData")
	public void createNewLegalEntity(String entityName) {

		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(entityName);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String getLegalEntityName = driver.findElement(By.xpath("//lightning-formatted-text[@data-output-element-id='output-field']")).getText();
		System.out.println("Legal Entity Name is displayed as - "+getLegalEntityName);
		
	}

}
