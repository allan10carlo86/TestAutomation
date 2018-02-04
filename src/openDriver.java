
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class openDriver {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public void housekeeping()
	{
		System.out.println("Before -- Open Webdriver");
        String operatingSystem = System.getProperty("os.name");
        
        if (operatingSystem.equalsIgnoreCase("linux"))
        {
        	System.setProperty("webdriver.gecko.driver", "driverLinux/geckodriver");
        }
        else if (operatingSystem.contains("MACmac"))
        {
        	System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
        }
        driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,5);
	}

}
