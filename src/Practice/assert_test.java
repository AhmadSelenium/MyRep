package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_test {
	/*@Test
	public void asser(){
		Assert.assertFalse(1>9, "Pass");
		
		try{
					Assert.assertEquals("good1", "good");
		}catch (Throwable t){
			System.out.println("error");
		}
	}*/
	
@Test
public void app(){
	Assert.assertTrue(6>1, "Error Message FAILED");
	//Assert.assertFalse(11>9, "Error FAlSE");
}
}
