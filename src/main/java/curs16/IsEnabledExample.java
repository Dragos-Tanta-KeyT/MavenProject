package curs16;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class IsEnabledExample extends BaseTest{

	@Test
	public void isEnabledTest() {
		
		driver.findElement(By.cssSelector("a[href='#popup_login']")).click();
		WebElement userFiled = driver.findElement(By.cssSelector("input[name='log']"));

		System.out.println("Before disable "+ userFiled.isEnabled());
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('disabled', '')", userFiled);
		
		System.out.println("After disable "+ userFiled.isEnabled());

		userFiled.sendKeys("TestUser");
		
		
	}
	
}
