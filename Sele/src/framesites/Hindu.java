package framesites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hindu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.thehindu.com/");
		
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("menu-button")).click();

		// TODO Auto-generated method stub

	}

}
