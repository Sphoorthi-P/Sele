package testactivia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Simu {
		static WebDriver driver;
	@Test (priority = 1)
     public static void execute() throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","D:\\Selenium Jars\\geckodriver\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver(); 
			//WebDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
			driver.get("http://simu.activia.us.com/");
	}
		//	driver.manage().window().maximize();
//}
			@Test(priority = 2)
			public void Link() throws InterruptedException{
			driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/ul/li[1]/a")).click();
	        Thread.sleep(2000);
			driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/ul/li[2]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/ul/li[3]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/ul/li[4]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/ul/li[5]/a")).click();
			driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/ul/li[6]/a")).click();
			//System.out.println(driver.getCurrentUrl());
				
				Thread.sleep(5000);
				driver.switchTo().frame(0);
				
				driver.switchTo().frame(0);
				
				driver.findElement(By.xpath(".//*[@id='panel1AddressField']")).sendKeys("Irving");
				driver.findElement(By.xpath(".//*[@id='panel1AddressField']")).sendKeys("\n");
			}
			//	driver.findElement(By.xpath("//div[@id='panel1ProductName39']")).click();
			//driver.findElement(By.name("panel1AddressField")).sendKeys("Irving");
			
			// TODO Auto-generated method stub

		}

	
	


