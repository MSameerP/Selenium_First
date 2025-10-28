package day14;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * 1) Login -- @BeforeMethod
 * 2) Search -- @Test
 * 3) Logout -- @AfterMethod
 * 4) Login -- @BeforeMethod
 * 5) Adv Search -- @Test
 * 6) Logout -- @AfterMethod
 */
public class AnnotationsDemo1 {
	
	@BeforeMethod
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
	
	@AfterMethod
	void logout() {
		System.out.println("This is logout");
	}

}
