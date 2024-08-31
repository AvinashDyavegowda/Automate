package demotest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {

	@Test
	public void testA() {
		Reporter.log("Hello World");//It will print only in HTML report
		//Reporter.log("Hello World", false);
	}
	@Test
	public void testB() {
		Reporter.log("Bye World", true);// it will print both on console and HTML report
	
	}
	@Test
	public void testC() {
		System.out.println("Hi World");//It will print only in console
	}
}
