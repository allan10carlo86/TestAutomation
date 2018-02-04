import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.TakesScreenshot;

public class MaximizeAndCookies extends openDriver{
	@Before
	public void before()
	{
		DesiredCapabilities ch = DesiredCapabilities.firefox();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		FirefoxOptions ffOptions = new FirefoxOptions();
		ch.merge(ch);
		housekeeping(ffOptions);
	}
	
	@Test
	public void test1()
	{
		try {
			driver.manage().window().maximize();
			driver.manage().window().maximize();
			driver.manage().deleteCookieNamed("sessionKey");
			driver.manage().deleteAllCookies();
			driver.get("http://www.google.com");
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)	;
			FileUtils.copyFile(src, new File("Screenshot/screenshot.png"));
			
		} catch (IOException e){
			System.out.println(e.getMessage());
		}
	}
}
