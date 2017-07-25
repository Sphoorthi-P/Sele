package testMonster;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;



public class Monster {

public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.gecko.driver", "D:/Selenium Jars/geckodriver/geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//Thread.sleep(2000);
	
	driver.get("https://www.monster.com/");
	
	Thread.sleep(1000);
	driver.findElement(By.id("q2")).sendKeys("Selenium");
	Thread.sleep(2000);
	driver.findElement(By.id("where2")).sendKeys("Los angeles");
	Thread.sleep(2000);
	driver.findElement(By.id("doQuickSearch2")).click();
	Thread.sleep(2000);
	
	System.out.println(driver.getTitle());
	System.exit(0);
		// TODO Auto-generated method stub

	}
}

