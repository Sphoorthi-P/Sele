package friendly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryDatepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://material.angularjs.org/latest/demo/datepicker");
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div/md-content/div[1]/docs-demo[1]/div/div/section/demo-include/div/md-content/div[1]/div[1]/md-datepicker/button")).click();
	
		driver.findElement(By.xpath("//span[contains(.,'Jul 2017')]")).click();
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//*[@aria-label='September 2017']")).click();

		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(.,'12')]")).click();
		
		Actions act = new Actions();
		act.
		
		
		
/*		driver.findElement(By.xpath("//button[contains(@class,'md-datepicker-button md-icon-button md-button md-ink-ripple md-focused')]")).click();
			driver.findElement(By.xpath("//button[@class='md-datepicker-button md-icon-button md-button md-ink-ripple md-focused']")).click();
			driver.findElement(By.xpath("//div[@class='md-scroll-mask']")).click();
			
			//div[@class='md-scroll-mask']
			
			//span[contains(@class,'md-calendar-date-selection-indicator firepath-matching-node')]
			//span[@class='md-calendar-date-selection-indicator firepath-matching-node']
		driver.findElement(By.xpath("//*[@id='md-date-pane-25']/div[2]/md-calendar/div/md-calendar-month/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[1]/td[1]/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='md-3-year-2017-8-1']")).click();
	driver.findElement(By.xpath("//span[@class='md-calendar-date-selection-indicator']")).click();
			driver.findElement(By.xpath("//span[@class='md-calendar-date-selection-indicator firepath-matching-node']"));
			
		driver.findElement(By.xpath("//*[@id='md-3-month-2017-8-12']/span")).click();
			*/
		
	}

}
