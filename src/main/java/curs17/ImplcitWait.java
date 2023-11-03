package curs17;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ImplcitWait extends BaseTest{

	@Test
	public void implicitWait() {
		/* Verifica daca elementul este prezent in DOM
		 * se aplica pe toata instanta de browser
		 * face un polling la fiecare 0,5 secunde daca conditia a fost indeplinita
		 * daca a fost, face resume
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

		driver.findElement(By.cssSelector("div[id='start']>button")).click();
		
		WebElement finish = driver.findElement(By.cssSelector("div[id='finish']>h4"));
		assertEquals(finish.getText(), "Hello World!");
		
	}
	
	
	
}
