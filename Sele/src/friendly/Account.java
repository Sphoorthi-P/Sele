package friendly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Account {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Roopa");
		driver.findElement(By.id("u_0_4")).sendKeys("Narayan");
		driver.findElement(By.name("reg_email__")).sendKeys("roopanara33@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("roopanara33@gmail.com");
		driver.findElement(By.id("u_0_e")).sendKeys("roopa123");
		//Select date = new Select(driver.findElement(by//*[@id="month"]))
		 Select date = new Select(driver.findElement(By.xpath("//*[@id='day']")));
	     date.selectByVisibleText("1");
	     Select month = new Select(driver.findElement(By.xpath("id('month')")));
	     month.selectByVisibleText("Jan");
	     Select year = new Select(driver.findElement(By.xpath("id('year')")));
	     year.selectByVisibleText("1993");
	     driver.findElement(By.id("u_0_h")).click();
	     driver.findElement(By.id("u_0_m")).click();
	     driver.findElement(By.id("checkpointSubmitButton")).click();
		// TODO Auto-generated method stub

	}

}
