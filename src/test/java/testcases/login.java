package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjectModel.loginPageObjects;
import resources.Baseclass;
import resources.constants;
public class login extends Baseclass {
	@Test
public void werifyLogin() throws IOException {
	
	loginPageObjects lpo= new loginPageObjects (driver);
	
	lpo.enterUsername().sendKeys(constants.username)	;
	lpo.enterpassword().sendKeys(constants.password);
	lpo.clickOnLogin().click();
	
}
}