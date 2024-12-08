package week4.day1.homeassignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrameAndAlertInteractionsTextVerification {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//Switch to the frame
		driver.switchTo().frame(1);
		
		//Click the "Try It" button inside the frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Click OK/Cancel in the alert that appears
		Alert alert = driver.switchTo().alert();
		String name="Priya Krithik";
		alert.sendKeys(name);
		alert.accept();
		
		//Confirm the action is performed correctly by verifying the text displayed
		String actualText  = driver.findElement(By.xpath("//p[@id='demo']")).getText();
        System.out.println("Text information displayed after alert accepted :"+ actualText);
		
		String expectedText="Hello "+name+"! How are you today?";
		if(expectedText.equals(actualText)) {
			System.out.println("Text information displayed is matched"); }
		else {
			System.out.println("Text information displayed is not matched");
		}
		
	}

}
