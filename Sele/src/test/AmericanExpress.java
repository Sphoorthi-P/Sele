package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmericanExpress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		//WebDriver driver=new FirefoxDriver();

		driver.get("https://www.americanexpress.com/");
		//driver.findElement(By.xpath(xpathExpression))

	}

}
