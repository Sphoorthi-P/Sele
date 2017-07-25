package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty("webdriver.gecko.driver","D:\\Selenium Jars\\geckodriver\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("a[id = 'nav-link-accountList']"));
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).doubleClick().sendKeys("hello")
		.build().perform();
		Thread.sleep(2000);
		//Move to specific element
	//	a.moveToElement(move).contextClick().build().perform();
		//drag and drop
		Thread.sleep(2000);
		// TODO Auto-generated method stub

	}

}
