package week2.day1.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		
		// Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
				
		// Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		
		// Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("Priyadharshini_TestAccount7");
		
		// Enter a description as "Selenium Automation Tester." - Enter a Number Of Employees.
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//Selecting the values from Dropdown
		WebElement dropdownElement = driver.findElement(By.name("industryEnumId"));
		Select options = new Select(dropdownElement);
		options.selectByIndex(2);
		
		WebElement dropdownElement1 = driver.findElement(By.name("ownershipEnumId"));
		Select option2 = new Select(dropdownElement1);
		option2.selectByVisibleText("Partnership");
		
		WebElement dropdownElement2 = driver.findElement(By.name("marketingCampaignId"));
		Select option3 = new Select(dropdownElement2);
		option3.selectByValue("CATRQ_AUTOMOBILE");
		
		// Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		
		// Verify that the Title is displayed correctly.
		String expectedTitle="Account Details | opentaps CRM";
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
		System.out.println("Title of the page is displayed correctly: "+ actualTitle);
		} else {
			System.out.println("Title mismatch. Expected: " + expectedTitle + ", but found: " + actualTitle);
		}
		
		driver.findElement(By.linkText("Logout"));
		// Close the browser window.
		    driver.close();

	}

}
