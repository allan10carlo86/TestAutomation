import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;




public class Dropdown extends openDriver {
	@Before
	public void before()
	{
		housekeeping();
	}
	@Test
	public void test1()
	{
		driver.get("http://spicejet.com");
		//Static Dropdowns
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		s.selectByIndex(6);
		s.selectByVisibleText("4");
		
		//Dynamic Dropdowns
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		//driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		//CHeckbox
		if(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected() == false)
		{
			driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
		}
		//isSelected (want to know if checkbox is selected)
		
		
	}
}
