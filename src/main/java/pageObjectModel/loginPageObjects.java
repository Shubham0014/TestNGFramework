package pageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class loginPageObjects {
	
	public WebDriver driver;
	
	private By username =By.xpath("//input[@name='username']");
	private By password =By.xpath("//input[@id='password']");
	private By login =By.xpath("//input[@name='Login']");
	private By tryForFree =By.xpath("//a[@id='signup_link']");

	public loginPageObjects(WebDriver driver) {
		
		this.driver=driver;
	}
	public WebElement enterUsername() {
		
		return driver.findElement(username);
	}
    public WebElement enterpassword() {
		
		return driver.findElement(password);
	}
    public WebElement clickOnLogin() {
		
		return driver.findElement(login);
	}
    public WebElement clickOntryForFree() {
		
		return driver.findElement(tryForFree);
	}
}
