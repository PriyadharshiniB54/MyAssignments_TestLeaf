package week4.day2.homeassignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinanceYahoo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load the url - https://finance.yahoo.com/
		driver.get("https://finance.yahoo.com/");
		//Click on “Crypto” tab
		driver.findElement(By.xpath("//span[text()='More']")).click();
		driver.findElement(By.xpath("(//a[text()='Crypto '])[3]")).click();
	
		//Locate the cryptocurrency names in the table using specific row and column. - Use loop & Print the cryptocurrency names
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr"));
		int rowCount = rows.size();
		
		System.out.println("Below are the list of the Cryptocurrencies displayed in the webtable: ");
		for (int i = 1; i <= rowCount; i++) {
					String cryptocurrencyName = driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr["+i+"]/td[2]")).getText();
					System.out.println(cryptocurrencyName);	
			}
		driver.close();
	}

}

