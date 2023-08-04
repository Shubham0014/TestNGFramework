package resources;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
public class Baseclass {
	
	public WebDriver driver;
	public Properties prop;
	
public void initializeDriver() throws IOException {
	//to read the data
  FileInputStream fs=new FileInputStream("C:\\Users\\91784\\eclipse-workspace\\testNGframeworkDemo\\src\\main\\java\\resources\\data.properties");
  
  prop= new Properties();
  prop.load(fs);
  
  String browsername=prop.getProperty("browser");
  
  if(browsername.equalsIgnoreCase("chrome")) {
	 
	  driver = new ChromeDriver();
  }
  else if(browsername.equalsIgnoreCase("firefox")) {
	 
	  driver = new FirefoxDriver();
  }
  else if(browsername.equalsIgnoreCase("edge")) {
		 
	  driver = new EdgeDriver();
  }
    
  }
  
  @BeforeMethod
  public void LaunchBrowserandUrl() throws IOException{
	  
  	initializeDriver();
  	driver.get(prop.getProperty("url"));
	  
  }
}

