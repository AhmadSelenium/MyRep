package Data_Provider;

import org.testng.annotations.Test;

public class getdata {

	@Test(priority=2,dataProviderClass=Data_Pro.class,dataProvider="getdata")
	public void testpass (String user,String pass,String city) {
		System.out.println(user+" "+pass+" "+city);
	}

	@Test(priority=1,dataProviderClass=Data_Pro.class,dataProvider="Datapp")
	public void testpass1 (String user,String pass,String city) {
		System.out.println(user+" "+pass+" "+city);
	}
	
}
