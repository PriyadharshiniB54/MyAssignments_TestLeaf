package week3.day2.homeassignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AijoListInterface {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		
		//In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//To the left of the screen under "Gender" and click on "Men" - Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		Thread.sleep(5000);
		
		//- Print the count of the items found.
		String totalItemsFound = driver.findElement(By.xpath("//div[@class='filter']//strong")).getText();
		System.out.println("Count of the items found under Men Bags under Fashion Bags catergory - " + totalItemsFound);
		
		//- Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brandslist =	driver.findElements(By.xpath("//div[@class='brand']//strong"));
		System.out.println("\nThe list of brand of the products displayed in the page are below, ");
		for (int i = 0; i < brandslist.size(); i++) {
			System.out.println(brandslist.get(i).getText());
		}
		
		//- Get the list of names of the bags and print it
		List<WebElement> productsName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("\nThe list of names of the bags are displayed below, ");
		for (int i = 0; i < productsName.size(); i++) {
			System.out.println(productsName.get(i).getText());
		}
	}
}
