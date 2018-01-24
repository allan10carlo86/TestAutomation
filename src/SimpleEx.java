import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleEx extends openDriver{
	
	@Before
	public void before()
	{
		housekeeping();
	}
	
	@Test
	public void facebook()
	{
			
			driver.get("http://facebook.com");
			/*using by ID */
			//driver.findElement(By.id("email")).sendKeys("allan10carlo86@yahoo.com");
			//driver.findElement(By.id("pass")).sendKeys("Josemar1a$80");
			/* using by xpath*/
			//driver.findElement(By.xpath("//label[@id='loginbutton']/input")).click();
			/* Using by LinkText */
			//driver.findElement(By.linkText("Forgot account?")).click();		
			driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
			driver.findElement(By.linkText("Forgot account?")).click();	
	}
	@Test
	public void facebook2()
	{
		
		driver.get("http://facebook.com");
		/* Xpath */
		/*
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("myown xpath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		*/
		
		/* CSS */
		driver.findElement(By.cssSelector("input[name='email'")).sendKeys("myowncss");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
	}
	
	
	@Test
	public void salesForce()
	{
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		//driver.findElement(By.className("button r4 wide primary")).click();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		String text = driver.findElement(By.cssSelector("div#error.loginError")).getText();
		System.out.println(text);
		
	}
	
	@After
	public void after()
	{
		driver.quit();
	}
	
}
