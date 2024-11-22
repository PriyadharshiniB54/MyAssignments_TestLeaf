package week2.day2.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLeadWithCreatedID {
	public static void main(String[] args)
	{
		//code to create a new Lead account and passing that ID as input to delete that entry & confirm the deletion
		
		//Launching Leaftaps Application using  Chrome browser
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

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
				
				//Click on create Lead and use Xpath to find the web elements
				driver.findElement(By.linkText("Create Lead")).click();
				
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Priya Infotech");
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Priya1");
				driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Lokesh");
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("PriyaLok");
				
				driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("QA");
				driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("QA Testing");
				driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("PriyaLok123455@test.com");

				WebElement dropDown = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
			    Select StateProvinceOption = new Select(dropDown);
			    StateProvinceOption.selectByVisibleText("New York");
			    
			  //Click the "Create Lead" button
				driver.findElement(By.className("smallSubmit")).click();
				
				String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				System.out.println("Company name and Lead ID: "+companyName);
				int startIndex = companyName.indexOf('('); // Find the opening parenthesis
		        int endIndex = companyName.indexOf(')');
		            String leadID = companyName.substring(startIndex + 1, endIndex);
		            System.out.println("Extracted Lead ID: " + leadID);

				//searching the created Lead ID and perform the deletion
		         driver.findElement(By.linkText("Find Leads")).click();	
 		         driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
				 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				 driver.findElement(By.xpath("//a[contains(text(),'Priya Infotech')]")).click();
				 
				 driver.findElement(By.linkText("Delete")).click();	
				 System.out.println("Lead ID is deleted");
	
				 driver.findElement(By.linkText("Find Leads")).click();	
		         driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		         driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
		         String messageToVerify = driver.findElement(By.xpath("//div[text()='No records to display']")).getText(); 
					if(messageToVerify.contentEquals("No records to display")) {
						System.out.println("No records to display message is posted as expected and confirms the successful deletion");}
					else { System.out.println("Record is not deleted and deletion failed"); }
					
					driver.close();
						 
	}

}
