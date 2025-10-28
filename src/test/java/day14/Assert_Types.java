package day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Types {
	
	void hardAsserts() {
		
		/*
		Assert.assertTrue(1==2);
		Assert.assertTrue(true);
		Assert.assertFalse(true);
		Assert.assertEquals(false, true);
		
		*/
	}
	
	
	@Test
	void softAssert() {
		
		System.out.println("Testing........");
		System.out.println("Testing........");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("abc", "xyz");
		System.out.println("Testing........");
		System.out.println("Testing........");
		
		sa.assertAll();  //mandatory to use...otherwise by default all the conditions will be true in soft assert
	
	}

}
