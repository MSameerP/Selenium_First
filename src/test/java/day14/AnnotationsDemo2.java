package day14;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * 1) Login -- @BeforeClass
 * 2) Search -- @Test
 * 3) Adv Search -- @Test
 * 4) Logout -- @AfterClass
 */

public class AnnotationsDemo2 {
	
	@BeforeClass
	void Login() {
		System.out.println("This is Login...");
	}
	
	@Test(priority = 1)
	void search() {
		System.out.println("This is search");
	}
	
	@Test(priority = 2)
	void advSearch() {
		System.out.println("This is adv search");
	}
	
	@AfterClass
	void logout() {
		System.out.println("This is logout");
	}


}
