package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
    public WebDriver driver;

	private By firstName=By.xpath("//input[@name='UserFirstName']");
	private By lastName=By.xpath("//input[@name='UserLastName']");
	private By jobtitle=By.xpath("//input[@name='UserTitle']");
	private By Next=By.xpath("//a[@data-page-cntrl='next']");
	private By SelectEmployee=By.xpath("//select[@name='CompanyEmployees']");
	private By CName=By.xpath("//input[@name='CompanyName']");
	private By ClickOnNext=By.xpath("//a[@data-page-cntrl='next']");
	private By Phone=By.xpath("//input[@name='UserPhone']");
	private By Email=By.xpath("//input[@name='UserEmail']");
	private By CheckBox=By.xpath("//div[@class='checkbox-ui']");
	
	
	
	
	public SignUpPageObjects(WebDriver driver) {
		
		this.driver=driver;
	}
	public WebElement eneterFirstName() {
		return driver.findElement(firstName);	
	}
	public WebElement eneterlastName() {
		return driver.findElement(lastName);	
    }
	public WebElement eneterjobtitle() {
		return driver.findElement(jobtitle);	
	}
	public WebElement eneterjNext() {
		return driver.findElement(Next);	
	}
	public WebElement SelectEmployee() {
		return driver.findElement(SelectEmployee);	
	}
	public WebElement EnterCName() {
		return driver.findElement(CName);	
	}
	public WebElement ClickOnNext() {
		return driver.findElement(ClickOnNext);	
	}
	public WebElement Phone() {
		return driver.findElement(Phone);	
	}
	public WebElement Email() {
		return driver.findElement(Email);	
	}
	public WebElement CheckBox() {
		return driver.findElement(CheckBox);	
	}
}