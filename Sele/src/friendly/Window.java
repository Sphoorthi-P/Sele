package friendly;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[] args){
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();

    
    
    driver.get("http://www.google.co.uk/");
    
    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1)); //switches to new tab
    driver.get("https://www.facebook.com");

    driver.switchTo().window(tabs.get(0)); // switch back to main screen        
    driver.get("https://www.news.google.com");

}
}
