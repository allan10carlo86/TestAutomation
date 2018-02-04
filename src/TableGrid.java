import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class TableGrid extends openDriver{
	@Before
	public void before()
	{
		housekeeping();
	}
	@Test
	public void test1()
	{
		try {
			driver.get("http://www.cricbuzz.com/live-cricket-scorecard/17698/aus-vs-nz-1st-match-england-australia-new-zealand-t20i-tri-series-2018");
			WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
			//int rowcount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
			int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
			int sum = 0;
			String RElement = "";
			for(int i=0; i<count -2;i++)
			{
				RElement = 	table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
				System.out.println(RElement);
				sum += Integer.parseInt(RElement);
			}
			
			String extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
			System.out.println("Extras: " + extras);
			int actualTotal  = sum + Integer.parseInt(extras);
			String total = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
			System.out.println("Total: " + total);
			int expectedTotal = Integer.parseInt(total);
			
			if(expectedTotal == actualTotal)
			{
				System.out.println("expectedTotal of " +expectedTotal +" is equal to actualTotal " + actualTotal );
			}
			else 
			{
				System.out.println("expectedTotal of " + expectedTotal +" is NOT equal to actualTotal " + actualTotal );
			}
			
			
			Assert.assertEquals(actualTotal, expectedTotal);
			
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
		}finally {
		//	driver.quit();
		}
		
	}
	

}
