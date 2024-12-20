package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificMethodSalesForce;
import io.cucumber.java.en.When;

public class SalesforceAccountEditStep extends ProjectSpecificMethodSalesForce {

	@When("Enter the account name in search textbox as {string}")
	public void enter_the_account_name_in_search_textbox_as(String accName) throws InterruptedException {

		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement searchBox = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='slds-input']")));
		searchBox.sendKeys(accName);

		driver.findElement(By.xpath("//div[@class='slds-th__action']")).click();

	}

	@When("Click the dropdown icon next to the account")
	public void click_the_dropdown_icon_next_to_the_account() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//table[contains(@class,'slds-table forceRecordLayout')]/tbody[1]/tr[1]/td[6]/span[1]/div[1]/a[1]/span[1]/span[1]"))
				.click();
	}

	@When("Select Edit option")
	public void select_edit_option() {
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
	}

	@When("Set Type to Technology Partner")
	public void set_type_to_technology_partner() {
		WebElement typeDropdown = driver.findElement(By.xpath("//label[text()='Type']/following-sibling::div//button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", typeDropdown);
		WebElement techpartnerValue = driver.findElement(By.xpath("//span[text()='Technology Partner']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", techpartnerValue);
	}

	@When("Set Industry to Healthcare.")
	public void set_industry_to_healthcare() {
		WebElement industryDropdown = driver
				.findElement(By.xpath("//label[text()='Industry']/following-sibling::div//button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", industryDropdown);
		WebElement healthcareValue = driver.findElement(By.xpath("//span[text()='Healthcare']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", healthcareValue);
	}

	@When("Enter the Billing Street as {string}")
	public void enter_the_billing_street_as(String billingStreet) {
		driver.findElement(By.xpath("//textarea[@name='street']")).sendKeys(billingStreet);
	}

	@When("Enter the Billing City as {string}")
	public void enter_the_billing_city_as(String billingCity) {
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(billingCity);
	}

	@When("Enter the Billing Zip\\/Postal Code as {string}")
	public void enter_the_billing_zip_postal_code_as(String billingPostalCode) {
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(billingPostalCode);
	}

	@When("Enter the Billing State\\/Province as {string}")
	public void enter_the_billing_state_province_as(String billingProvince) {
		driver.findElement(By.xpath("//input[@name='province']")).sendKeys(billingProvince);
	}

	@When("Enter the Billing Country as {string}")
	public void enter_the_billing_country_as(String billingCountry) {
		driver.findElement(By.xpath("//input[@name='country']")).sendKeys(billingCountry);
	}

	@When("Enter the Shipping Street as {string}")
	public void enter_the_shipping_street_as(String shippingStreet) {
		driver.findElement(By.xpath("(//textarea[@name='street'])[2]")).sendKeys(shippingStreet);
	}

	@When("Enter the Shipping City as {string}")
	public void enter_the_shipping_city_as(String shippingCity) {
		driver.findElement(By.xpath("(//input[@name='city'])[2]")).sendKeys(shippingCity);
	}

	@When("Enter the Shipping Zip\\/Postal Code as {string}")
	public void enter_the_shipping_zip_postal_code_as(String shippingPostalCode) {
		driver.findElement(By.xpath("(//input[@name='postalCode'])[2]")).sendKeys(shippingPostalCode);
	}

	@When("Enter the Shipping State\\/Province as {string}")
	public void enter_the_shipping_state_province_as(String shippingProvince) {
		driver.findElement(By.xpath("(//input[@name='province'])[2]")).sendKeys(shippingProvince);
	}

	@When("Enter the Shipping Country as {string}")
	public void enter_the_shipping_country_as(String shippingCountry) {
		driver.findElement(By.xpath("(//input[@name='country'])[2]")).sendKeys(shippingCountry);
	}

	@When("Set Customer Priority to Low")
	public void set_customer_priority_to_low() {
		WebElement priorityDropdown = driver
				.findElement(By.xpath("//label[text()='Customer Priority']/following-sibling::div//button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", priorityDropdown);
		WebElement lowValue = driver.findElement(By.xpath("//span[text()='Low']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", lowValue);
	}

	@When("Set SLA to Silver")
	public void set_sla_to_silver() {
		WebElement slaDropdown = driver.findElement(By.xpath("//label[text()='SLA']/following-sibling::div//button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", slaDropdown);
		WebElement silverValue = driver.findElement(By.xpath("//span[text()='Silver']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", silverValue);
	}

	@When("Set Active to NO")
	public void set_active_to_no() {
		WebElement activeDropdown = driver
				.findElement(By.xpath("//label[text()='Active']/following-sibling::div//button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", activeDropdown);
		WebElement noValue = driver.findElement(By.xpath("//span[text()='No']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", noValue);
	}

	@When("Enter a unique number in the Phone field as {string}")
	public void enter_a_unique_number_in_the_phone_field_as(String phoneNum) {
		driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys(phoneNum);
	}

	@When("Set Upsell Opportunity to No")
	public void set_upsell_opportunity_to_no() {
		WebElement upsellDropdown = driver
				.findElement(By.xpath("//label[text()='Upsell Opportunity']/following-sibling::div//button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", upsellDropdown);
		WebElement noValue = driver.findElement(By.xpath("//span[text()='No']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", noValue);
	}

	@When("Verify the phone number")
	public void verify_the_phone_number() {
		String phoneNumSaved = driver.findElement(By.xpath("//table[contains(@class,'slds-table forceRecordLayout')]/tbody[1]/tr[1]/td[4]/span[1]/span")).getText();
		System.out.println("Phone Number updated for the account " + phoneNumSaved);
	}

}
