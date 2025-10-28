package day14.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C4 {
	
	@Test
	void xyz() {
		System.out.println("xyz");
	}
	
	@AfterTest
	void at2() {
		System.out.println("After Test..2");
	}

}
