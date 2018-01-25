import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


public class Alerts extends openDriver{
	@Before
	public void before()
	{
		housekeeping();
	}
	@Test
	public void alerts1()
	{
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.cssSelector("input[value='Confirmation Alert']")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept(); //Accept for OK or Done
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("input[value='Confirmation Alert']")).click();
		
		
	}
}
