package friendly;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		
		
	/*	
		driver.get("https://www.expedia.com/");
		driver.findElement(By.id("package-departing-hp-package")).click();
		driver.findElement(By.xpath("//*[@id='package-departing-wrapper-hp-package']/div/div/div[3]/table/tbody/tr[2]/td[3]/button")).click();
		//Script will be constant ... Date 
		*/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/");
		driver.findElement(By.id("btn2")).click();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@href='Widgets.html']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[@href='Datepicker.html']"))).click().build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("doucument.getElementById('datepicker1').value='09/12/2017'", "");
		
		

	}

}
