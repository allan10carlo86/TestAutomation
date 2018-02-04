import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutoSuggest extends openDriver {
	@Before
	public void before()
	{
		housekeeping();
	}
	@Test
	public void test1()
	{
		driver.get("https://fantasycricket.dream11.com/IN/");
		
		WebElement emailIdElem = driver.findElement(By.xpath("//input[@id='m_rtxtEmail1']"));
		emailIdElem.click();
		emailIdElem.sendKeys("A");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mailtip")));
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//p[contains(text(),'A@yahoo.com')]"))).click().build().perform();
		
		//clear and ask for new path
		emailIdElem.clear();
		emailIdElem.sendKeys("B");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mailtip")));
		builder.sendKeys(Keys.DOWN).click().build().perform();
		
		
	}
}
