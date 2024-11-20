package week2.day1.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationWithSelectClass {

	public static void main(String[] args) {
		
		//Launching Facebook Registration page using Chrome driver and filling out the details
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Filling out the Facebook registration form with user information, including dropdowns and radio buttons
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Priya");
		driver.findElement(By.name("lastname")).sendKeys("Boopalan");
		
		WebElement daysDropdown = driver.findElement(By.id("day"));
		Select days = new Select(daysDropdown);
		days.selectByValue("5");
		
		WebElement monthDropdown =driver.findElement(By.id("month"));
		Select month = new Select(monthDropdown);
		month.selectByIndex(4);
		
		WebElement yearDropdown =driver.findElement(By.id("year"));
		Select year = new Select(yearDropdown);
		year.selectByVisibleText("1993");
		
		driver.findElement(By.id("sex")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("Asdfghjkl124@");
	}

}
