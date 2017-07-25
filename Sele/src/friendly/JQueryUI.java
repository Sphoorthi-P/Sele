package friendly;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

 
public class JQueryUI {
	
	static WebDriver driver;
	
	@Test(priority=1)
	public static void WebBrowser(){
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("http://jqueryui.com/");
	
	}
	
	@Test(priority=2)
	public static void Droppable() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		// find element which we need to drag
		WebElement drag=driver.findElement(By.id("draggable"));
		 
		// find element which we need to drop
		WebElement drop=driver.findElement(By.id("droppable"));
		
/*		Actions builder = new Actions(driver);

		builder.keyDown(Keys.CONTROL)
		   .click(drag)
		   .click(drop)
		   .keyUp(Keys.CONTROL);*/

		// Then get the action:
	//	Action selectMultiple = builder.build();

		// And execute it:
		selectMultiple.perform();   
		
		Action dragAndDrop = act.clickAndHold(drag)
				   .moveToElement(drop)
				   .release(drag)
				   .build();
		// this will drag element to destination
		dragAndDrop.perform();
		
		
	}

}
