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
		Actions a = new Actions (driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
	}
	

}
