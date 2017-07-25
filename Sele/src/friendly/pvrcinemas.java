package friendly;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pvrcinemas {

 /**
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\Selenium Jars\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
  FirefoxDriver driver= new FirefoxDriver();
  driver.manage().window().maximize();
  driver.get("http://pvrcinemas.com");
  WebElement general=driver.findElement(By.xpath("html/body/div[10]/div[1]/div[2]"));
  List<WebElement>links=general.findElements(By.tagName("a"));
  for (int i = 0; i < links.size(); i++) {
   System.out.println(links.get(i).getText());
   links.get(i).click();
   System.out.println(driver.getCurrentUrl());
   driver.navigate().back();
   general=driver.findElement(By.xpath("html/body/div[10]/div[1]/div[2]"));
   links=general.findElements(By.tagName("a"));
  }
  driver.close();
 }

}