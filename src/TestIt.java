
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestIt extends openDriver{

	@Before
	public void before()
	{
		housekeeping();
	}
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
		
		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
		System.out.println(
				driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role")
				);
		//This is the java Program that needs to be updated. //Sample Comment.
	}

}
