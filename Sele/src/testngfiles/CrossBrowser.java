package testngfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	@Test
	
	@Parameters("Browser")
	public void test1(String browser)
	{
		if(browser.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.gecko.driver","D:\\Selenium Jars\\geckodriver\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
		}
		else if(browser.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		}
		else
		{
			System.setProperty("webdriver.ie.driver","D:\\Selenium Jars\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
		}
			
	}
	

}
