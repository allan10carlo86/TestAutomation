import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


public class rediff extends openDriver{

	@Before
	public void before()
	{
		housekeeping();
	}
	
	@Test
	public void rediff1()
	{
		driver.get("http://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		
	}
	
	@After
	public void after()
	{
		driver.quit();
	}
}
