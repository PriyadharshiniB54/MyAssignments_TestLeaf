package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.DataLibrary;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	public String data;

	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name="getData")
	public String[][] fetchData() throws IOException{
		return DataLibrary.readValue(data);
	}
}
