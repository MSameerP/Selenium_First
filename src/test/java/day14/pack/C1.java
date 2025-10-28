package day14.pack;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	
	
	@Test
	void abc() {
		System.out.println("abc");
	}
	
	
	@BeforeTest
	void bt1() {
		System.out.println("Before Test method...1");
	}
	
	
	@BeforeSuite
	void btt() {
		System.out.println("Before Test suite...");
	}

}
