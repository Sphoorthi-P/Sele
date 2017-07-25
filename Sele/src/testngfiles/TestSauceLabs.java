package testngfiles;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSauceLabs {
	
	@Test
	public void open() throws MalformedURLException{
		
	DesiredCapabilities dc = DesiredCapabilities.firefox();
	dc.setCapability("version", "5");
	dc.setCapability("Platform", "XP");
	
	WebDriver driver = new RemoteWebDriver(
			new URL("http://Sphoorthi:8475b020-bd7b-4989-9c8a-d6556af68a3f@ondemand.saucelabs.com:80/wd/hub"),dc);
	driver.get("http://www.google.com/");
	System.out.println(driver.getTitle());
	}

}
//http://saucelabid:Accesskey@ondemand.saucelabs.com:80/wd/hub