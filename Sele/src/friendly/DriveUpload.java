package friendly;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriveUpload {
	 WebDriver driver ;

	@Test(priority = 1)
	public void UploadFile() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","D:\\Selenium Jars\\geckodriver\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver(); 
		driver.manage().window().maximize();
	
		driver.get("https://drive.google.com/drive/u/0/my-drive");
	}
	
		@Test(priority = 2)
		public void Mail() throws Exception {
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("sphoorthi.qa@gmail.com");
				
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(2000);
	}
		
		@Test(priority = 3)
		public void Password() throws Exception {
		driver.findElement(By.xpath("//*[@aria-label='Enter your password']")).sendKeys("Tendulkar10");
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		Thread.sleep(2000);
		}
		
		@Test(priority = 4)
		public void Click() throws Exception{
		driver.findElement(By.xpath("//*[@id='drive_main_page']/div[2]/div/div[1]/div/div/div[3]/div[1]/div/button[1]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.className("a-v-T")).click();
		//driver.findElement(By.cssSelector("#\3a 2c > div > span.a-v-j > span.a-v-ff > div")).click();
		//*[@id=":8f"]/div/span[2]/span[1]/div
		//*[@id=":6r"]/div/span[2]/span[1]/div
		//*[@id=":2c"]/div/span[2]/span[1]/div
		//driver.findElement(By.partialLinkText("File upload")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=':2c']/div/span[2]/span[1]/div"));
		for (WebElement ele : list){ //dynamic xpath 
			ele.click();
		}
		
		Thread.sleep(3000);
	//	Runtime.getRuntime().exec("C:\\Users\\Sphoorthi\\Desktop\\AutoIT\\FileUpload.exe");
		
		
		//driver.findElement(By.xpath("//*[@id=':49']/div/span[2]/span[1]/div")).click();
		}
		@Test(priority = 5)
		public void Close(){
		driver.close();
		}
		
	
	}
	

