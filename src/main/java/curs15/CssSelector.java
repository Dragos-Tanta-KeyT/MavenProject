package curs15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssSelector extends BaseTest{

	//@Test
	public void cssSelectorexample() {
		
		/* <li class="menu_user_login">
		 * CSS shortcut pentru atributul CLASS este : . (punct)
		 * urmatorii locatori sunt identici
		 *  .menu_user_login
		 * li.menu_user_login
		 * li[class='menu_user_login']
		 * 
		 * CSS shortcut pentru atributul ID este : # (diez)
		 * 
		 * <input type="text" id="log" name="log" value="" placeholder="Login or Email">
		 * urmatorii locatori sunt identici
		 * #log
		 * input#log
		 * input[id='log']
		 */
		
		WebElement loginLink = driver.findElement(By.cssSelector(".menu_user_login"));
		loginLink.click();
		
		/*
		 * li.menu_user_login input#log
		 * --> spatiul intre 2 locatori inseamna ca vreau sa cobor de la primul
		 * pana la al doilea sarind mai multe elemente
		 * 
		 * li.menu_user_login input#log
		 * li[class='menu_user_login'] input[id='log']
		 * li.menu_user_login input[id='log']
		 */
		
		WebElement usernameField = driver.findElement(By.cssSelector("li.menu_user_login input#log"));
		usernameField.sendKeys("Test");
		
		//AND
		WebElement passwordField = driver.findElement(By.cssSelector("li input[id='password'][type='password'][name='pwd']"));
		passwordField.sendKeys("Test");
		
		//OR
		WebElement rememeberMe = driver.findElement(By.cssSelector("li input[id='rememberme'],[type='checkbox']"));
		rememeberMe.click();
		
		//direct child   >
		WebElement submitButton = driver.findElement(By.cssSelector("li div>input[value='Login']"));
		submitButton.click();
		
	}
	
	@Test
	public void cssSelectorExample2() {
		
		// * --> contains
		WebElement book1 =  driver.findElement(By.cssSelector("a[href*='road']"));
		System.out.println(book1.getText());
		// ~ --> contains word
		WebElement book2 = driver.findElement(By.cssSelector("h3[class~='sc_title_regular']"));
		System.out.println(book2.getText());
		// ^ --> starts with
		WebElement book3 = driver.findElement(By.cssSelector("a[href^='stor']"));
		System.out.println(book3.getText());
		// $ --> ends with
		WebElement book4 = driver.findElement(By.cssSelector("a[href$='story']"));
		System.out.println(book4.getText());
		
	}
	
	
	
}
