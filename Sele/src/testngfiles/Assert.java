package testngfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Assert {
	
	public void FaceBook()
	{
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	String expected = "LogIns";
    String actual = driver.findElement(By.xpath("//*[@id='u_0_r']")).getAttribute("value");
	
	Assert.assertEquals(expected, actual, "Dosen't match");
	}
	

	static void assertEquals(String expected, String actual, String string) {
		// TODO Auto-generated method stub
		System.out.println("Strings doesn't match");
	}


}
