package week4.day2.homeassignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAndInteractionAutomation {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Launching the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
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
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Merge Contacts.		
		driver.findElement(By.linkText("Merge Contacts")).click();
		//Click on the widget of the "From Contact"
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		
		//Click on the first resulting contact
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> getWindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(getWindow.get(1));
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a")).click();
		System.out.println("Switching to main window after 1st value ");
		
		//Switching to main window
		driver.switchTo().window(getWindow.get(0));
						
		//Click on the widget of the "To Contact"
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
					
		// Get the updated set of window handles
		Set<String> updatedWindowHandles = driver.getWindowHandles();
		List<String> updatedGetWindow = new ArrayList<>(updatedWindowHandles);

		// Switch to the new window
		driver.switchTo().window(updatedGetWindow.get(1));
		
		//click on the second resulting contact
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]/tbody/tr[1]/td[1]/div/a")).click();
		
		//Switching to main window
		driver.switchTo().window(updatedGetWindow.get(0));
	
		//Click on the Merge button.
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		System.out.println("Merge button clicked");
		Thread.sleep(3000);
		//Accept the alert.
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		// Verify the title of the page.
		String expectedTitle="View Contact | opentaps CRM";
		String actualtitle = driver.getTitle();
		if(expectedTitle.equals(actualtitle)) {
			System.out.println("Title information displayed is matched"); }
		else {
			System.out.println("Title information displayed is not matched");
		}		
	}

}
