import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MedicalCity extends openDriver{
	@Before
	public void before()
	{
		housekeeping();
	}
	@Test
	public void test()
	{
		driver.get("http://themedicalcity.com/");
		WebElement element = driver.findElement(By.id("specialization_id"));
		Select oSelect = new Select(element);
		List<WebElement> elementSelect = oSelect.getOptions();
		int oSize = elementSelect.size();
		System.out.println(oSize);
		String value = "";
		WebElement elem = null;
		for(int i=0; i<oSize; i++)
		{
			value = elementSelect.get(i).getText();
			System.out.println(value);
			if(value == "Medicine - Pulmonology / Critical Care / Sleep Medicine")
			{
				elem = elementSelect.get(i);
				break;
			}
		}
		
		oSelect.selectByVisibleText("Medicine - Pulmonology / Critical Care / Sleep Medicine");
		//oSelect.selectByValue("Medicine - Pulmonology / Critical Care / Sleep Medicine");
		
		element = driver.findElement(By.id("hmo_id"));
		oSelect = new Select(element);
		List<WebElement> hmoSelect = oSelect.getOptions();
		oSize = hmoSelect.size();
		
		for(WebElement e :hmoSelect)
		{
			String val = e.getText();
			System.out.println(val);
		}
		
		oSelect.selectByVisibleText("Any");
		
		driver.findElement(By.cssSelector("div.btn.btn-danger.pull-right")).click();
		
		String doctorText = driver.findElement(By.cssSelector("span.title.ng-binding")).getText();
		System.out.println("Doctor's Name : " + doctorText);
		
		assertEquals(doctorText, "Reodica, Ronald Antonio S");
		
		
	}
}
