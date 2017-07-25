package testngfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeTest
	public void Cookies()
	{
		System.out.println("This block executes before all testcases ");
			}
	@BeforeMethod
	public void UseridGeneration()
	{
		System.out.println("This block executes before each test");
	}
	@AfterMethod()
	public void ReportAdding()
	{
		System.out.println("This block executes after each test");
	}
	@AfterTest
	public void CookiesClose()
	{
		System.out.println("This block executes after all testcases");
	}
	@Test
	public void OpeningBrowser()
	{
		System.out.println("Opening Browser");   //This opens the browser
		
	}
	
	@Test()
	public void FlightBooking()
	{
		System.out.println("FlightBooking");
	}
	
}
