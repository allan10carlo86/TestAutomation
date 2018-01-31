
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class Miscelleanous extends openDriver{
	
	@Before
	public void before()
	{
		housekeeping();
	}
	@Test
	public void test1()
	{
		driver.get("https://fantasycricket.dream11.com/in/");
		driver.findElement(By.id("m_rtxtEmail1")).sendKeys("allan.carlo.t.ramos@gmail.com");
		driver.findElement(By.id("m_rtxtPassword")).sendKeys("H3110W0r1d");
		boolean isSelected = driver.findElement(By.id("m_chkTerms")).isSelected();
		System.out.println("Agreement Checkbox selected? " + isSelected);
		if(!isSelected)
			driver.findElement(By.id("m_chkTerms")).click();
		isSelected = driver.findElement(By.id("m_chkTerms")).isSelected();
		driver.findElement(By.id("registerClick")).click();	
	}
	

}
