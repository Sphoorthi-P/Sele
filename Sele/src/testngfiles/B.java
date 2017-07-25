package testngfiles;

import org.testng.annotations.Test;

public class B {
	@Test(groups={"GRP1"})
	public void tc1(){
		System.out.println("tc1 done");
	}
	
	@Test(groups={"GRP2"})
	public void tc2(){
		System.out.println("tc2 done");
	}
	
	@Test(groups={"GRP3"})
	public void tc3(){
		System.out.println("tc3 done");
	}
	
	@Test(enabled = false)
	public void tc4(){
		System.out.println("tc4 done");
	}

}