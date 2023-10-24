package curs14;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;
/*
 * tagname
 * linkText
 * partialLinkText
 * Class
 * Id
 * Name
 * CssSelector
 * Xpath
 * 
 */

public class SeleniumLocator extends BaseTest{

	@Test(priority = 1)
	public void tagNameLocator() {
		//<em>Discover</em>
		WebElement discoverText = driver.findElement(By.tagName("em"));
		System.out.println(discoverText.getText());
		//getText() --> intoarce textul dintre tagurile HTML
		/*
		 * <em>Discover</em>
		 */
		assertEquals(discoverText.getText(), "Discover");
	}
	@Test(priority=2)
	public void linkTextLocator() {
		//linkText se aplica pe tagurile HTML --> a
		//<a href="https://keybooks.ro/shop/">Books</a>
	
		WebElement booksLink =  driver.findElement(By.linkText("BOOKS"));
		booksLink.click();
		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
		//driver.getCurrentUrl() --> returneaza URL la care se afla pagina
	}
	@Test(priority =3)
	public void partialLinkTextLocator() {
		//<a href="https://keybooks.ro/shop/cooking-with-love/">Cooking with love</a>
		WebElement cookingBook = driver.findElement(By.partialLinkText("love"));
		cookingBook.click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/cooking-with-love/");

	}
	@Test(priority=4)
	public void classNameLocator() throws InterruptedException {
		Thread.sleep(2000);
		WebElement addToCart =  driver.findElement(By.className("single_add_to_cart_button"));
		System.out.println(addToCart.isDisplayed());//intoarce true/false daca elementul este vizibil
		
		assertTrue(addToCart.isDisplayed());
		
	}
	
	
	
}
