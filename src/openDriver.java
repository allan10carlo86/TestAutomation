
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class openDriver {
	
	WebDriver driver;
	
	public void housekeeping()
	{
		System.out.println("Before -- Open Webdriver");
		
		System.setProperty("webdriver.gecko.driver", "/home/allan/Documents/Mozilla GeckoDriver/geckodriver");
		driver = new FirefoxDriver();
	}

}
