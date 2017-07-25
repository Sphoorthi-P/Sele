package friendly;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {


public static void TakeScreenShot(WebDriver driver, String Screenshot) {
		
		TakesScreenshot ts = (TakesScreenshot)driver ;
		File source =  ts.getScreenshotAs(OutputType.FILE);
		try {
			
			FileUtils.copyFile(source, new File("./ScreenShot"+Screenshot+".png"));
		} 
		catch (Exception e) {
			System.out.println("Exception While taking Screenshot" +e.getMessage());
			
		//	e.printStackTrace();
		}
		System.out.println("Screenshot taken");
		
	}	
	


}
