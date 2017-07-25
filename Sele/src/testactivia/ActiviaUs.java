package testactivia;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterTest;
	//import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	public class ActiviaUs {

	 

		static WebDriver driver;
		
		@Test(priority=1)
//		@BeforeTest
		public static void openingWebPage() throws Exception {
		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
		
			System.setProperty("webdriver.chrome.driver" ,"D:\\Selenium Jars\\chromedriver.exe" );
			driver = new ChromeDriver(options);
			ChromeOptions options1 = new ChromeOptions();
			
			
			driver.get("http://www.activia.us.com/");
		//	driver.manage().window().maximize();
		}
			
			@Test(priority=2)
			public static void itStartsInside() throws Exception {
		
			
			driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			}
			@Test(priority=3)
			public static void ActiviaProbioticChallenge() throws Exception {
		
			driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/ul/li[2]/a")).click();
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			}
			@Test(priority=4)
			public static void ProbioticYogurts() throws Exception {
			driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/ul/li[3]/a")).click();
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			}
			@Test(priority=5)
			public static void WhatAreProbiotics() throws Exception {
			driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/ul/li[4]/a")).click();
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			}
			@Test(priority=6)
			public static void HealthCareProfessionals() throws Exception {
			driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/ul/li[5]/a")).click();
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			}
			@Test(priority=7)
			public static void WheretoBuy() throws Exception {
			driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/ul/li[6]/a")).click();
		
			
			
			System.out.println(driver.getCurrentUrl());
			
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			
			driver.switchTo().frame(0);
			
			driver.findElement(By.xpath(".//*[@id='panel1AddressField']")).sendKeys("missouri");  
			driver.findElement(By.xpath(".//*[@id='panel1AddressField']")).sendKeys("\n");
			}
		
		//driver.findElement(By.xpath("//*[@id='panel1ProductName1']")).click(); //Click Strawberry 4-Pack
		
		@Test(priority=8)
//			@AfterTest
		public static void closingWindow() throws Exception {
		Thread.sleep(5000);
			driver.close();
			}
		

}