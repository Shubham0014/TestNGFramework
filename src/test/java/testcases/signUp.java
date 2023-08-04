package testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.SignUpPageObjects;
import pageObjectModel.loginPageObjects;
import resources.Baseclass;
import resources.constants;

public class signUp extends Baseclass {
    @Test
	public void verifySignup() throws IOException, InterruptedException {
    	
    	loginPageObjects lpo=new loginPageObjects (driver);
    	lpo.clickOntryForFree().click();
    	
    	SignUpPageObjects spo= new  SignUpPageObjects(driver);
    	Thread.sleep(3000);
    	spo.eneterFirstName().sendKeys(constants.FirstName);
    	
    	spo.eneterlastName().sendKeys(constants.lastName);
    	
    	spo.eneterjobtitle().sendKeys(constants.jobtitle);
    	
    	spo.eneterjNext().click();
    	
    	WebElement a=spo.SelectEmployee();
		Select s =new Select(a);
		s.selectByIndex(1);
		
		spo.ClickOnNext().click();
		
		Thread.sleep(3000);
		
		spo.Phone().sendKeys("7744088156");
		
		spo.Email().sendKeys("shubham7744088156@gmail.com");
		
		spo.CheckBox().click();
		
	}
}
