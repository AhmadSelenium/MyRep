import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNg {
@BeforeMethod
public void beforemthod(){
	System.out.println("Before Mtethod");
}
@AfterMethod
public void aftermethod(){
	System.out.println("After Method");
}
	@Test(dataProviderClass=Data_Provider.class,dataProvider="LoginTestDataProvider")
	public void testapp(String User,String Pass,String Email){
		System.out.println("Testing App-- "+User+" "+Pass+" "+Email);
	}
	@Test
	public void testmail(){
		System.out.println("Test Mail");
	}
}
