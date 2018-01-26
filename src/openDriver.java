
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class openDriver {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public void housekeeping()
	{
		System.out.println("Before -- Open Webdriver");
		
		System.setProperty("webdriver.gecko.driver", "driverLinux/geckodriver");
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,30);
	}

}
