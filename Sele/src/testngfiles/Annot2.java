package testngfiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annot2 {

	@BeforeSuite
	public void installsoftware()
	{
		System.out.println("Im the first");
	}
	@AfterSuite
	public void uninstallsoftware()
	{
		System.out.println("Im the last");
	}
}
