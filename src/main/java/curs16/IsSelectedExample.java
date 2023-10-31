package curs16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class IsSelectedExample extends BaseTest {
	
	
	@Test
	public void isSelectedTest() {
		
		driver.findElement(By.cssSelector("a[href='#popup_login']")).click();
		
		WebElement rememberMeCheckbox = driver.findElement(By.cssSelector("input[id='rememberme']"));
		
		System.out.println("Before click : "+ rememberMeCheckbox.isSelected());
		rememberMeCheckbox.click();
		System.out.println("After click : "+ rememberMeCheckbox.isSelected());

	
		System.out.println("---------------------------------------------------");
	
		WebElement userFiled = driver.findElement(By.cssSelector("input[name='log']"));
		System.out.println("Before click : "+ userFiled.isSelected());
		userFiled.click();
		System.out.println("After click : "+ userFiled.isSelected());
		
		
	}
	

}
