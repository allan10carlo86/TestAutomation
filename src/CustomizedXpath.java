import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class CustomizedXpath extends openDriver{
	@Before
	public void before()
	{
		housekeeping();
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount");
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Allan Carlo");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Ramos");
		Random r = new Random();
		driver.findElement(By.id("GmailAddress")).sendKeys("allan1allan1allan1" + Integer.toString(r.nextInt(6000)) + Integer.toString(r.nextInt(6000)) );
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("HelloWorld");
		driver.findElement(By.xpath("//input[@name='PasswdAgain']")).sendKeys("HelloWorld");
		
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.id("BirthMonth"))).build().perform();
		action.moveToElement(driver.findElement(By.id(":2"))).click(driver.findElement(By.id(":2"))).build().perform();
		
		driver.findElement(By.id("BirthDay")).sendKeys("10");
		driver.findElement(By.id("BirthYear")).sendKeys("1986");
		
		action.click(driver.findElement(By.id(":d"))).build().perform();
		action.moveToElement(driver.findElement(By.id(":f"))).click(driver.findElement(By.id(":f"))).build().perform();
		
		action.click(driver.findElement(By.id("RecoveryPhoneNumber"))).sendKeys("9178693564").build().perform();
		
		driver.findElement(By.cssSelector("input.g-button.g-button-submit")).click();
		driver.findElement(By.cssSelector("img.tos-scroll-button-icon")).click();
		
		WebElement agreeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.tos-button.iagree-button")));
		agreeButton.click();
				
		WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.g-button.g-button-submit")));		
		submitButton.click();	
	}
	
	@After
	public void after()
	{
		driver.quit();
	}
	
	@Test
	public void test2() 
	{
		driver.get("http://www.google.com");
			
	}
}
