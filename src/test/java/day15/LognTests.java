package day15;

import org.testng.annotations.Test;

public class LognTests {
	
	
	@Test(priority = 1,groups = {"sanity"})
	void loginByEmail() {
		System.out.println("This is login by Email....");
	}
	
	
	@Test(priority = 2,groups = {"sanity"})
	void loginByFacebook() {
		System.out.println("This is login by facebook....");
	}
	
	@Test(priority = 3,groups = {"sanity"})
	void loginByTwitter() {
		System.out.println("This is login by twitter....");
	}

}
