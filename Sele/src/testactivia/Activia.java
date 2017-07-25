package testactivia;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Activia {
	

	
	//private static final String Irving = null;
    @Test
	public static void Execute() throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://www.activia.us.com/");
   driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/ul/li[5]/a")).click();
		//driver.switchTo().frame("Where to Buy");
		Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
	    
		driver.findElement(By.linkText("WATCH THE TRAILER")).click();
		
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath(".//*[@id='panel1AddressField']")).sendKeys("Irving");
		driver.findElement(By.xpath(".//*[@id='panel1AddressField']")).sendKeys("\n");
		driver.findElement(By.xpath("//div[@id='panel1ProductName39']")).click();
		/*driver.findElement(By.linkText("It Starts Inside")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Probiotic Yogurts")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("About Activia and Probiotics")).click();
		driver.findElement(By.linkText("Health Care Professionals")).click();
		driver.findElement(By.linkText("Where to Buy")).click();
		Thread.sleep(3000);*/

	     //driver.findElements(By.id("panel1AddressField")).sendKeys("irving");
		
	
		
	}
}
