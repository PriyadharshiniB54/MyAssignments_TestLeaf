package week2.day1.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
				//Initialize the WebDriver (ChromeDriver)
				ChromeDriver driver= new ChromeDriver();
				//Load the URL
				driver.get("http://leaftaps.com/opentaps/"); 
				//Maximize the browser window.
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				/*  Enter a username and password. 
				 *  UserName: demosalesmanager
				 *  Password:crmsfa
				 */
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				// Click the "Login" button.
				driver.findElement(By.className("decorativeSubmit")).click();	
				
				// Click on the "CRM/SFA" link.
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				// Click on the "Leads" tab.
				driver.findElement(By.linkText("Leads")).click();
				
				/*
				 * Click on the "Create Lead" button. - Enter a FirstName. - Enter a LastName. -
				 * Enter a CompanyName. - Enter a Title . - Click the "Create Lead" button.
				 */
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IT INFOTECH");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya2");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Boopalan");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead");
				
				//Selecting the values from Dropdown
				WebElement dropdownElement = driver.findElement(By.name("industryEnumId"));
				Select options = new Select(dropdownElement);
				options.selectByIndex(3);
				
				WebElement dropdownElement1 = driver.findElement(By.name("ownershipEnumId"));
				Select option2 = new Select(dropdownElement1);
				option2.selectByVisibleText("Corporation");
				
				//Click the "Create Lead" button
				driver.findElement(By.className("smallSubmit")).click();
				
				String expectedTitle="View Lead | opentaps CRM";
				String actualTitle= driver.getTitle();
				
				if(actualTitle.equals(expectedTitle)) {
					System.out.println("Title of the page is displayed correctly: "+ actualTitle);
							} else {
							System.out.println("Title mismatch. Expected: " + expectedTitle + ", but found: " + actualTitle);}
				
				driver.close();			
	}
						
}
