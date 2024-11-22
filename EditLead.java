package week2.day2.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		
		//Launching Leaftaps Application using  Chrome browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
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
		
		//Click on the Edit Lead option and update the description 
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Updated Notes Information");
		
		//Click the "Update" button
		driver.findElement(By.name("submitButton")).click();

		System.out.println("Title of the page is "+ driver.getTitle());
		
		driver.close();	
	}

}
