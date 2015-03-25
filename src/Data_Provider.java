import org.testng.annotations.DataProvider;




public class Data_Provider {
	
	@DataProvider (name ="LoginTestDataProvider")
	public static Object[][] getdata() {
		
	Object data[][]=new Object [2][3];
	
	data [0] [0]="u";
	data [0] [1]="p";
	data [0] [2]="email";
	
	data [1] [0]="u1";
	data [1] [1]="p2";
	data [1] [2]="email2";
	
	return data;

}
}