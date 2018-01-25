import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;




public class Dropdown extends openDriver {
	WebElement element  ;
	@Before
	public void before()
	{
		housekeeping();
	}
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("http://spicejet.com");
		//Static Dropdowns
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		s.selectByIndex(6);
		s.selectByVisibleText("4");
		
		//Dynamic Dropdowns
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		element  =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@text='Goa (GOI)']")));
		element.click();
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@text='Delhi (DEL)']")));
		element.click();
		
		//driver.findElement(By.linkText("Goa (GOI)")).click();
		//driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		//CHeckbox 
		WebElement checkBoxElement = driver.findElement(By.id("ctl00_mainContent_chk_Unmr"));
		System.out.println(checkBoxElement.isSelected());
		if(checkBoxElement.isSelected() == false)
		{
			checkBoxElement.click();
		}
		System.out.println(checkBoxElement.isSelected());
		//isSelected (want to know if checkbox is selected)
		
		Thread.sleep(15000);
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_btn_FindFlights")));
		element.click();
		
		element = driver.findElement(By.id("ControlGroupSelectView_ContactInputGSTViewSelectView_TextBoxRegistrationNumberGST"));
		element.sendKeys("12345667");
		
		element = driver.findElement(By.id("ControlGroupSelectView_ContactInputGSTViewSelectView_TextBoxCompanyNameGST"));
		element.sendKeys("ABC Company");

		element = driver.findElement(By.id("ControlGroupSelectView_ContactInputGSTViewSelectView_TextBoxEmailAddressGST"));
		element.sendKeys("erwin.b.garcia@accenture.com");
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class='button-continue-text']")));
		element.click();
		
	}
}
