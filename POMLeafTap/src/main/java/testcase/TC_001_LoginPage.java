package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_LoginPage extends ProjectSpecificMethod {

	@BeforeTest
	public void setValue() {
		data = "Login";
	}

	@Test(dataProvider = "getData")
	public void runLoginData(String userName, String password) {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(userName).enterPassword(password).clickOnLogin().clickOnCRMSFA();
	}

}
