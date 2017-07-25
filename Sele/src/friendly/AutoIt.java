package friendly;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoIt {

	@Test
	public void Upload() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sphoorthi/Desktop/Html/new%202.html");
		driver.findElement(By.id("1")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Sphoorthi\\Desktop\\AutoIT\\FileUpload.exe");
		
	}
}
