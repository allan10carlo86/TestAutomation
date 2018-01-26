import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Frames extends openDriver{
	@Before
	public void before()
	{
		housekeeping();
	}
	
	@Test
	public void test1() 
	{
		driver.get("http://jqueryui.com/droppable");
		
		int numberOfIframes = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(numberOfIframes - 1);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		
	}
	
}
