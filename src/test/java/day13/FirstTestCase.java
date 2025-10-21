package day13;

import org.testng.annotations.Test;

/*
 * 1) open app
 * 2) login
 * 3) logout
 */

public class FirstTestCase { 
	
	@Test(priority = 1)
	void openApp() {
		System.out.println("Opening application");
	}
	
	@Test(priority = 2)
	void login() {
		System.out.println("Login to application");
	}
	
	@Test(priority = 3)
	void logout() {
		System.out.println("Logout from application");
	}

}
