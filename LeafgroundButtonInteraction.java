package week2.day2.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		
		/*
		 * Initialize the WebDriver (ChromeDriver). 
		 * Load the URL  - https://leafground.com/button.xhtml . 
		 * Maximize the browser window
		 */
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		//Click on the button with the text ‘Click and Confirm title.’ 
		driver.findElement(By.xpath("(//span[text()='Click'])")).click();
		
		//Verify that the title of the page is ‘dashboard.’ 
		String expectedTitle="Dashboard", actualTitle= driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title of the webpage is matching --Actual Title is "+actualTitle);
		}else {
			System.out.println("Title of the webpage is not matched. Expected Title is "+expectedTitle +"  but the actual displayed title is "+ actualTitle);
		}
	
		driver.navigate().back(); //to go to previous page
		
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled. 
		WebElement isDisabledButton = driver.findElement(By.xpath("(//span[text()='Disabled']/parent::button)"));
		boolean disabledButton = isDisabledButton.isEnabled();		
		  if(disabledButton==true) { 
			  System.out.println("Disabled Button is enabled and not meeting an expected outcome");}
		  else { System.out.println("Disabled Button is disabled as expected"); }
		 		
		//Find and print the position of the button with the text ‘Submit.’ 
		  WebElement submitButton = driver.findElement(By.xpath("(//span[text()='Submit']/parent::button)"));
		  Point position = submitButton.getLocation();
		  System.out.println("Button Position: x=" + position.getX() + ", y=" + position.getY());
		  
		//Find and print the background color of the button with the text ‘Find the Save button color.’ 
		  WebElement saveButton = driver.findElement(By.xpath("(//span[text()='Save']/parent::button)"));
		 String saveButtonBGColor = saveButton.getCssValue("background-color");
		 System.out.println("Button Background Color: " + saveButtonBGColor);
		
		 //Find and print the height and width of the button with the text ‘Find the height and width of this button.’ 
		  WebElement submitButton2 = driver.findElement(By.xpath("(//span[text()='Submit']/parent::button)[2]"));
		  Dimension dimensions = submitButton2.getSize();
		  System.out.println("Button Height: " + dimensions.getHeight());
          System.out.println("Button Width: " + dimensions.getWidth());

		 //Close the browser window.
		 driver.close();
	}
}
