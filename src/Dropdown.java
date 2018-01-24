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
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		s.selectByIndex(6);
		s.selectByVisibleText("4");
		
	}
}
