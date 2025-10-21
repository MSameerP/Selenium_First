package day14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo1 {
	
	@Test
	void testTitle() {
		
		String exp_title = "opencart";
		String act_title = "opencart";
		
/*		
		if(exp_title.equals(act_title)) {
			System.out.println("Test Passed....");
			Assert.assertTrue(true);
		}else {
			System.out.println("Test Failed....");
			Assert.assertTrue(false);
		}
		
*/
		Assert.assertEquals(exp_title, act_title);
	}

}
