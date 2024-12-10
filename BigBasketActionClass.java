package week4.day2.homeassignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasketActionClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Launch the URL
		driver.get("https://www.bigbasket.com/"); 
		//go to "Shop by Category"
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		
		//go to  "Foodgrains, Oil & Masala".
		WebElement elementFoodGrain = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions obj = new Actions(driver);
		obj.moveToElement(elementFoodGrain).perform();
		elementFoodGrain.click();

		// go to "Rice & Rice Products"
		driver.findElement(By.xpath("//button[contains(@class,'Button-sc-1dr2sn8-0 FilterByCategory___StyledButton-sc-c0pkxv-5')]")).click();
		WebElement elementRice = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		obj.moveToElement(elementRice).perform();
		elementRice.click();
		
		//Click on "Boiled & Steam Rice".
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		
		//Filter the results by selecting the brand "bb Royal".
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.id("i-BBRoyal")));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
	        checkbox.click();
   
	    // Click on "Tamil Ponni Boiled Rice"
		     Thread.sleep(3000);
	        WebElement riceElement = driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", riceElement);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", riceElement);

	     //Switch to new window using windowhandles
	     Set<String> handles = driver.getWindowHandles();
	     List<String> getWindow = new ArrayList<String>(handles);
		 driver.switchTo().window(getWindow.get(1));

	    //Select the 5 Kg bag.
	     Thread.sleep(3000);
  	     WebElement weightOption = driver.findElement(By.xpath("//span[text()='5 kg']"));
	     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", weightOption);
	     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", weightOption);
		
		// Check and note the price of the rice
		String elementPrice = driver.findElement(By.xpath("//td[contains(text(),'Price')]")).getText();
		System.out.println("Price of the rice : "+elementPrice);
		// Click "Add" to add the bag to your cart.
		WebElement addtoBasket = driver.findElement(By.xpath("//button[text()='Add to basket']"));
	     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addtoBasket);
	     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addtoBasket);
		
		 Thread.sleep(3000);		
		// Verify the success message that confirms the item was added to your cart.
		 String message = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']")).getText();
		 System.out.println("Successfully added yje item message is displayed - "+ message);
		 Thread.sleep(3000);
		// Take a snapshot of the current page
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./screenShots/RiceProduct.png");
		FileUtils.copyFile(screenshotAs, target);
		// Close the current window.
		driver.close();
		// Close the main window.
		 driver.switchTo().window(getWindow.get(0));
  		 driver.close();
		
	}

}
