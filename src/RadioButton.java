import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RadioButton extends openDriver{
	@Before
	public void before()
	{
		housekeeping();
	}
	@Test
	public void radioButton()
	{
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Butter']")).click();
		
		int size = driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println(size);
		
		List<WebElement> elements = driver.findElements(By.xpath("//input[@name='group1']"));
			elements.get(2).click();
		
		for (int i = 0 ; i<size; i++)
		{
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			String textRadioButton = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			System.out.println("Radio Button : " + textRadioButton);
			if(textRadioButton == "Cheese")
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
			
		}
	}
}
