package week2.day1.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelectClass {

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
				String enteredAccountName = "Priyadharshini_TestAccount14[=-";
				driver.findElement(By.id("accountName")).sendKeys(enteredAccountName);
				
				// Enter a description as "Selenium Automation Tester." - Enter a Number Of Employees.
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
				driver.findElement(By.id("numberEmployees")).sendKeys("10");
				driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
				
				/* Select "ComputerSoftware" as the industry. 
				 * Select "S-Corporation" as ownership using SelectByVisibleText. 
				 * Select "Employee" as the source using SelectByValue. 
				 * Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex. 
				 * Select "Texas" as the state/province using SelectByVal
				 */
				
				WebElement dropdownElement1 = driver.findElement(By.name("industryEnumId"));
				Select option1 = new Select(dropdownElement1);
				option1.selectByVisibleText("Computer Software");
				
				WebElement dropdownElement2 = driver.findElement(By.name("ownershipEnumId"));
				Select option2 = new Select(dropdownElement2);
				option2.selectByVisibleText("S-Corporation");
				
				WebElement dropdownElement4 = driver.findElement(By.id("dataSourceId"));
				Select option4 = new Select(dropdownElement4);
				option4.selectByValue("LEAD_EMPLOYEE");
				
				WebElement dropdownElement3 = driver.findElement(By.id("marketingCampaignId"));
				Select option3 = new Select(dropdownElement3);
				option3.selectByIndex(6);
				
				WebElement dropdownElement5 = driver.findElement(By.id("generalStateProvinceGeoId"));
				Select option5 = new Select(dropdownElement5);
				option5.selectByValue("TX");
				
				// Click the "Create Account" button.
				driver.findElement(By.className("smallSubmit")).click();
				
				//Verify that the account name is displayed correctly. - Close
				String expectedAccountName=enteredAccountName;
				WebElement savedAccountName=driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
					
				String displayedAccountName= savedAccountName.getText();
				
				if(displayedAccountName.contains(expectedAccountName)) {
					System.out.println("Account name is displayed correctly : "+ displayedAccountName ); }
				else {
					System.out.println("Account name Mismatch. Expected Account name: " +expectedAccountName + "Actual Accont name displayed: "+ displayedAccountName );
				}
				
				driver.close();
	}

}
