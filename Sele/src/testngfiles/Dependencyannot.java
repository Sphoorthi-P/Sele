package testngfiles;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Dependencyannot {

	@Test
	public void OpeningBrowser()
	{
		System.out.println("Opening Browser");   //This opens the browser
	}
	
	@Test(dependsOnMethods={"OpeningBrowser"})
	public void FlightBooking()
	{
		System.out.println("FlightBooking");
		
		
	}
	@Test(dependsOnMethods={"OpeningBrowser","FlightBooking"})
	public void FlightPayment()
	
	{
		System.out.println("Flight Paymnet");
	//	String expected  = "adsbjhbcscs";
	//	String actual = "cjsbkjn";
	//	Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void Timerelated()
	{
		System.out.println("New testcase");   //This opens the browser
	}
	@Test(enabled = false)
	public void Payment()
	{
		System.out.println("New testcase");   //This opens the browser
	}
}
