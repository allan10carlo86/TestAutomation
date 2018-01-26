import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class CalendarHandling extends openDriver{
	@Before
	public void before()
	{
		housekeeping();
	}
	@Test 
	public void test1()
	{
		
		driver.get("https://path2usa.com/travel-companions");
		//Provide Month name and Date Name
		//April 14
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		
		while(
				!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")
			)
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		
		
		List<WebElement> dates = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();
		String dayString = "";
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			dayString = driver.findElements(By.className("day")).get(i).getText();
			System.out.println(dayString);
			if(dayString.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
	}
}
