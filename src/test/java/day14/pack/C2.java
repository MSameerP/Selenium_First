package day14.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
	
	@Test
	void uvw() {
		System.out.println("uvw");
	}
	
	@AfterTest
	void at1() {
		System.out.println("After Test..1");
	}
	
	
	@AfterSuite
	void att() {
		System.out.println("After test suite...");
	}

}
