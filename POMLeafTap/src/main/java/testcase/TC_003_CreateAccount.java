package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_003_CreateAccount extends ProjectSpecificMethod {
	@BeforeTest
	public void setValue() {
		data = "CreateAccount";
	}

	@Test(dataProvider = "getData")
	public void runLoginData(String userName, String password, String accountName, String desc) {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(userName).enterPassword(password).clickOnLogin().clickOnCRMSFA().clickOnAccountsLink()
				.clickOnCreateAccountLink().enterAccountName(accountName).enterDescription(desc)
				.clickOnCreateAccountButton().viewAccountDetails();
	}
}
