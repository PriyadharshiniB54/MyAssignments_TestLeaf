package week5.day2.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	@Parameters({"url","username","password"})
	
	@BeforeMethod
	public void preCondition(String url, String username, String pass) {
		 // Disable browser notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        
    	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        driver.get(url);		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("Login")).click();
		
		//- Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		//- Click View All and click Legal Entities from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		WebElement legalEntitiesLink = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", legalEntitiesLink);
	     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", legalEntitiesLink);
	    //click on the Dropdown icon in the legal Entities tab
        driver.findElement(By.xpath("(//a[@class='slds-context-bar__label-action dndItem']/following::one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button/a/lightning-icon/span/lightning-primitive-icon)[6]")).click();
        //Click on New Legal Entity
        WebElement newLegalEntitylink = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
	     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newLegalEntitylink);
	     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", newLegalEntitylink);
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
