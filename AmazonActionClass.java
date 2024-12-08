package week4.day2.homeassignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonActionClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load the URL--https://www.amazon.in
		driver.get("https://www.amazon.in");
		//Search for "oneplus 9 pro"
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Get the price of the first product
		String firstProductPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("The price of the first product: Rs."+firstProductPrice);
		
		//Print the number of customer ratings for the first displayed product
		WebElement elementRatings = driver.findElement(By.xpath("//a[@class='a-popover-trigger a-declarative']"));
		Actions obj = new Actions(driver);
		obj.moveToElement(elementRatings).perform();
		elementRatings.click();
		Thread.sleep(5000);
		String customerRatings = driver.findElement(By.xpath("//span[@class='aok-offscreen']/preceding-sibling::span")).getText();
		System.out.println("Print the number of customer ratings for the first displayed product: "+customerRatings);
		
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> getWindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(getWindow.get(1));
		
		Thread.sleep(3000);	
		//ake a screenshot of the product displayed
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./screenShots/firstProduct.png");
		FileUtils.copyFile(screenshotAs, target);
		//Click the 'Add to Cart' button.
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		
		 // Wait for the cart subtotal element to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cartSubtotalElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='attach-accessory-cart-subtotal']")));

        // Get the cart subtotal
        String cartValue = cartSubtotalElement.getText();
        System.out.println("Cart subtotal: Rs." + cartValue);

        // Close the browser
        driver.quit();
	}

}
