import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


public class Flights extends openDriver{
 @Before
 public void before()
 {
	 housekeeping();
 }
 @Test
 public void test()
 {
	driver.get("https://www.phptravels.net/flightst") ;
	boolean isDisplayed = driver.findElement(By.xpath("//input[contains(@id,'depart-date-link-')]")).isDisplayed();
	int displaySize = driver.findElements(By.xpath("//input[contains(@id,'depart-date-link-')]")).size();
	
	System.out.println(displaySize);
 }
}
