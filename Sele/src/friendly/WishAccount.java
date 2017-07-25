package friendly;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class WishAccount {
	
 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		driver = new ChromeDriver(); // invoking chrome browser
		driver.manage().window().maximize(); //maximizing window
		driver.get("https://www.wish.com/"); // opening the url
		TakeScreenShot(driver,"Wish"); //takes screenshot of the page
		
/*		driver.findElement(By.xpath("//span[contains(.,'Sign up with Email')]")).click();;
		TakeScreenShot(driver,"Signup");		
		driver.findElement(By.xpath("//input[@id='signup-first-name']")).sendKeys("Roopa");;
		driver.findElement(By.xpath("//input[@id='signup-last-name']")).sendKeys("Narayan");;
		driver.findElement(By.xpath("//input[@id='signup-email']")).sendKeys("roopanara33@gmail.com");;
		driver.findElement(By.xpath("//input[@id='signup-password']")).sendKeys("roopa123");
		driver.findElement(By.xpath("//button[@data-tid='1524']")).click();
*/
		
	    driver.findElement(By.xpath("//*[@id='signup-form']/div[6]/span")).click();
		driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("roopanara33@gmail.com");
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("roopa123");
		
		driver.findElement(By.xpath("//button[@class='submit-btn btn']")).click(); 
		Thread.sleep(5000);
		TakeScreenShot(driver,"signin");
		
		//Using robot class to open a new tab
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		
		// switching tab back to gmail
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		
/*		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);*/
		
	//	act.keyDown(Keys.CONTROL).keyDown("T").build().perform();
		driver.get("https://www.google.com/gmail/about/#");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("roopanara33@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@aria-label='Enter your password']")).sendKeys("roopa123");
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		TakeScreenShot(driver,"Gmailsignin");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@id,':2k')]")).click();
		driver.findElement(By.xpath("//span[@class='bog']")).click();
		TakeScreenShot(driver,"Gmailsignin");
		Thread.sleep(5000);
		
		driver.switchTo().window(tabs.get(0));
		
		
		//using actions class to select settings from the dropdown
		Actions act = new Actions(driver);
		
		
		
		act.moveToElement(driver.findElement
				(By.xpath("//img[@src='https://contestimg.wish.com/api/image/fetch?profile_image_name=NTYwNWMxYmEyMWE4NjMxNzk0ZTk1NDUy_1398450030238.jpg&w=50&h=50']"))
				).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/settings']"))).click().build().perform();
		
		//using JavascriptExecuter to scroll down to the entire length of the page
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//jse.executeScript("window.scrollBy(0,250)", "");
		//r.keyPress(KeyEvent.VK_PAGE_DOWN);
		//r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		driver.findElement(By.xpath("//button[@id='settings-delete-user-btn']")).click();
		Thread.sleep(3000);
		TakeScreenShot(driver,"Del");
		
		
		driver.findElement(By.xpath("//div[@class='grey-btn confirm-btn']")).click();
		TakeScreenShot(driver,"DeleteAcc");
		
		
		System.out.println("Account Deleted");
		
		
		driver.quit();
		
		
		

	}
	
public static void TakeScreenShot(WebDriver driver, String Screenshot) {
		
		TakesScreenshot ts = (TakesScreenshot)driver ;
		File source =  ts.getScreenshotAs(OutputType.FILE);
		try {
			
			FileUtils.copyFile(source, new File(Screenshot+".png"));
		} 
		catch (Exception e) {
			System.out.println("Exception While taking Screenshot" +e.getMessage());
			
		//	e.printStackTrace();
		}
		System.out.println("Screenshot taken");
		
	}	
	
	

}
