package curs16;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JsAlertExample extends BaseTest{
	
	@Test(priority=1)
	public void simpleJsAlert() throws InterruptedException {
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		
		Thread.sleep(3000);
		//tratam alerta JS
		driver.switchTo().alert().accept();
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You successfully clicked an alert");
		
	}
	
	@Test(priority=2)
	public void confirmJsAlert() throws InterruptedException {
		
		driver.findElement(By.cssSelector("button[onclick*='jsConfirm']")).click();		
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You clicked: Cancel");
		
	}
	
	@Test(priority = 3)
	public void promptJsAlert() throws InterruptedException {
	
		driver.findElement(By.cssSelector("button[onclick*='jsPrompt']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("Text");
		driver.switchTo().alert().accept();
		
	/*	Alert alertaJS = driver.switchTo().alert();
		alertaJS.sendKeys("Text");
		alertaJS.accept();  */
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You entered: Text");
		
	}
	
	
	
}
