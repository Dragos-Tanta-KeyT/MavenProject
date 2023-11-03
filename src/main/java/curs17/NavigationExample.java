package curs17;

import org.testng.annotations.Test;

import utils.BaseTest;

public class NavigationExample extends BaseTest{

	@Test
	public void navigationTest() throws InterruptedException {
		
		
		driver.navigate().to("http://emag.ro");
		
		driver.get("http://altex.ro");
		
		driver.navigate().back();

		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
	}
	
	
	
}
