
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLHandling extends openDriver{
	
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
	public void test1(){
		System.out.println("hello");
		
	}

}
