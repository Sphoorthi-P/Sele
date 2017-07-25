package testactivia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		
		System.setProperty("webdriver.chrome.driver" ,"C:\\chromedriver_win32\\chromedriver.exe" );
	//	WebDriver driver=new ChromeDriver(); 
		driver = new ChromeDriver(options);
	//	System.setProperty("webdriver.gecko.driver","D:\\Selenium Jars\\geckodriver\\geckodriver.exe");
	//	WebDriver driver=new FirefoxDriver(); 
	//	driver.manage().window().maximize();
		ChromeOptions options1 = new ChromeOptions();
	
		driver.get("http://simu.activia.us.com/");
		driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());

	}

}
