package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.ProjectsPage;

public class LoginTest extends BaseTest{
	
	@Override
	public void setupRatingPopUp() {
	}
	
	@Override
	public void setupWorkSpace() {
		super.setupWorkSpace();
	}
	
	@Test(description = "Login with correct data")
	public void tc01_login() {
		ProjectsPage pp = new ProjectsPage(driver);
		String expected = "amit";
		Assert.assertEquals(pp.itIsMyAccount(), expected);
	}

}
