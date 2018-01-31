
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.Random;
public class Miscelleanous extends openDriver{
	
	@Before
	public void before()
	{
		housekeeping();
	}
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("https://fantasycricket.dream11.com/in/");
		Random rand = new Random();
		
		int n = rand.nextInt(9999999) + 1;
		String email = "allan.carlo.t.ramos" + Integer.toString(n) + "@gmail.com";
		driver.findElement(By.id("m_rtxtEmail1")).sendKeys(email);
		driver.findElement(By.id("m_rtxtPassword")).sendKeys("H3110W0r1d");
		
		
		Select oDay = new Select(driver.findElement(By.id("m_selDate")));
		oDay.selectByValue("1");
		Select oMonth = new Select (driver.findElement(By.id("m_selMonth")));
		oMonth.selectByVisibleText("Jan");
		Select oYear = new Select(driver.findElement(By.id("m_selYear")));
		oYear.selectByVisibleText("1994");
		
		boolean isSelected = driver.findElement(By.id("m_chkTerms")).isSelected();
		System.out.println("Agreement Checkbox selected? " + isSelected);
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		
		if(!isSelected)
		{	
			Thread.sleep(3000);
			WebElement ele = driver.findElement(By.name("m_chkTerms"));
			executor.executeScript("document.getElementById(\"m_chkTerms\").checked=true;", ele);
					
		}
		isSelected = driver.findElement(By.id("m_chkTerms")).isSelected();
		System.out.println("Agreement Checkbox selected? " + isSelected);
		
		driver.findElement(By.id("registerClick")).click();	
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("a.redBtn.close")).click();
	}
	@Test
	public void test2() throws InterruptedException
	{
		driver.get("https://fantasycricket.dream11.com/in/");
		driver.findElement(By.id("m_rtxtEmail1")).sendKeys("allan.ca3rlo.t.ramos@gmail.com");
		driver.findElement(By.id("m_rtxtPassword")).sendKeys("H3110W0r1d");
		
		Select oDay = new Select(driver.findElement(By.id("m_selDate")));
		oDay.selectByValue("1");
		Select oMonth = new Select (driver.findElement(By.id("m_selMonth")));
		oMonth.selectByVisibleText("Jan");
		Select oYear = new Select(driver.findElement(By.id("m_selYear")));
		oYear.selectByVisibleText("1994");
		
		boolean isSelected = driver.findElement(By.id("m_chkTerms")).isSelected();
		System.out.println("Agreement Checkbox selected? " + isSelected);
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		
		if(!isSelected)
		{	
			Thread.sleep(3000);
			WebElement ele = driver.findElement(By.name("m_chkTerms"));
			executor.executeScript("document.getElementById(\"m_chkTerms\").checked=true;", ele);
					
		}
		isSelected = driver.findElement(By.id("m_chkTerms")).isSelected();
		System.out.println("Agreement Checkbox selected? " + isSelected);
		
		driver.findElement(By.id("registerClick")).click();	
		Thread.sleep(5000);
		
		String getErrorMessage = driver.findElement(By.xpath("//*[contains(text(), 'Sorry! That email')]")).getText();
		
		System.out.println(getErrorMessage);
		assertEquals(getErrorMessage,"Sorry! That email is already registered");
	}
	
	
	

}
