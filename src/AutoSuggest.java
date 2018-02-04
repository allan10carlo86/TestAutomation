import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.File;
import java.io.IOException; 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
/* 
 * Using Webdriverwait and Actions class 
 */
public class AutoSuggest extends openDriver {
	@Before
	public void before()
	{
		housekeeping();
	}
	@Test
	public void test1()
	{
		try {
			driver.get("https://fantasycricket.dream11.com/IN/");
			
			WebElement emailIdElem = driver.findElement(By.xpath("//input[@id='m_rtxtEmail1']"));
			emailIdElem.click();
			emailIdElem.sendKeys("A");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mailtip")));
			Actions builder = new Actions(driver);
			builder.moveToElement(driver.findElement(By.xpath("//p[contains(text(),'A@yahoo.com')]"))).click().build().perform();
			//builder.moveToElement(driver.findElement(By.xpath("//p[contains(text(),'A@yaho22o.com')]"))).click().build().perform();
			
			
			//clear and ask for new path
			emailIdElem.clear();
			emailIdElem.sendKeys("B");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mailtip")));
			builder.sendKeys(Keys.DOWN).click().build().perform();

			
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
			//take screenshot
			TakesScreenshot scrShot =((TakesScreenshot)driver); 
			File src =  scrShot.getScreenshotAs(OutputType.FILE);
			try {
				
				FileUtils.copyFile(src, new File("Screenshot/Error/error-screenshot.png"));
			}
			catch(IOException e1)
			{
				System.out.println(e1.getMessage());
			}
		}
		finally
		{
			//take one more screenshtots
			//take screenshot
			TakesScreenshot scrShot1 =((TakesScreenshot)driver); 
			File src1 =  scrShot1.getScreenshotAs(OutputType.FILE);
			try {
				
				FileUtils.copyFile(src1, new File("Screenshot/Finally/finally-screenshot.png"));
			}
			catch(IOException e2)
			{
				System.out.println(e2.getMessage());
			}
			driver.quit();
		}
		
	
		
	}
}
