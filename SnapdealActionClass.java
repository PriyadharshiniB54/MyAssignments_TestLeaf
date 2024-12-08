package week4.day2.homeassignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealActionClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Launch the URL
		driver.get("https://www.snapdeal.com/");
		//Mouse over on "Men's Fashion"
		WebElement men = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions obj = new Actions(driver);
		obj.moveToElement(men).perform();
		//CLick on "Sports Shoes"
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		String sportsShoesCount = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Count of sports shoes : "+sportsShoesCount);
		//click on Training Shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
        // Sort the products by "Low to High"
		driver.findElement(By.xpath("//span[text()='Sort by:']/following-sibling::i")).click();
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		
		 // Verify if items are sorted 
		String sortBy = driver.findElement(By.xpath("//span[text()='Sort by:']/following-sibling::div")).getText();
        System.out.println("Items are sorted correctly as : " +sortBy);
        Thread.sleep(3000);
        //Select any price range ex:(500-700).
        driver.findElement(By.name("fromVal")).clear();
        driver.findElement(By.name("fromVal")).sendKeys("500");
        driver.findElement(By.name("toVal")).clear();
        driver.findElement(By.name("toVal")).sendKeys("900");
        driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
        //Filter by any colour
       // driver.findElement(By.xpath("//input[@id='Color_s-White%20%26%20Blue']")).click();
        //driver.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']")).click();
     // Filter by "White" color
        Thread.sleep(2000); // Wait for filters to load
        WebElement whiteColorCheckbox = driver.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']"));
        obj.moveToElement(whiteColorCheckbox).click().perform();
        
        String priceFilter = driver.findElement(By.xpath("//a[@class='clear-filter-pill']")).getText();
        System.out.println("Price Filter applied : "+priceFilter);
        String colorFilter = driver.findElement(By.xpath("//a[@class='clear-filter-pill  ']")).getText();
        System.out.println("Color Filter applied : "+colorFilter);
        
        WebElement firstProduct = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		obj.moveToElement(firstProduct).perform();
		
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		Thread.sleep(2000);		
		String shoePrice = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Cost of the product : "+shoePrice);
		String percentDiscount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Discount Percentage : " +percentDiscount);
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snapShot/firstShoeProduct.png");
		FileUtils.copyFile(screenshotAs, target);
		
		driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
