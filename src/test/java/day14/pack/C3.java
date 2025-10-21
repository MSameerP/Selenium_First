package day14.pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C3 {
	
	@Test
	void def() {
		System.out.println("def");
	}
	
	
	@BeforeTest
	void bt2() {
		System.out.println("Before Test method...2");
	}


}
