import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Hover extends openDriver {
	
	@Before
	public void before()
	{
		housekeeping();
	}
	
	@Test
	public void Test()
	{
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		Actions a = new Actions (driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		a.click(driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[4]/div[3]/div[2]/div/div[1]/div/a/span"))).build().perform();
		driver.findElement(By.id("ap_email")).sendKeys("allan.carlo.t.ramos@gmail.com");
		
		driver.findElement(By.id("ap_password")).sendKeys("Alavr0Del");
		driver.findElement(By.id("signInSubmit")).click();
		
				
	}
	

}
