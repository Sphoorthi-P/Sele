package friendly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class AccountCreation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","D:\\Selenium Jars\\geckodriver\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.macys.com/");
		//driver.findElement(By.xpath("//a[@id='href_myAccountHeader']")).click();
		driver.findElement(By.xpath("//a[@class='selected']")).click();
		driver.findElement(By.xpath("//span[contains(.,'create')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-validate='firstName']")).sendKeys("Keerthi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-validate='lastName']")).sendKeys("Ray");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("keerthi.ray0610@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("macys89");
		driver.findElement(By.xpath("//select[@id='month']")).click();
		driver.findElement(By.xpath("//option[contains(.,'October')]")).click();
		driver.findElement(By.xpath("//select[@id='day']")).click();
		driver.findElement(By.xpath("//option[@value='6']")).click();
		driver.findElement(By.xpath("//select[@id='year']")).click();
		driver.findElement(By.xpath("//option[@value='1990']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[contains(@id,'textSalesEvents')]")).click();
		//driver.findElement(By.xpath(".//*[@id='textSalesEvents']")).click();
		//driver.findElement(By.id("textSalesEvents")).click();
		//*[@id="textSalesEvents"]
		driver.findElement(By.xpath("//*[@name='profile.subscriptionInfo.textMessages']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("createProfile")).click();
		// TODO Auto-generated method stub

	}

}
