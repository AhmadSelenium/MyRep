package Data_Provider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Pro {
	  @DataProvider
	  public static Object[][] getdata() {
		  Object[][] d1=new Object[2][3];
	  //First Row
	  d1[0][0]="user1";
	  d1[0][1]="pass1";
	  d1[0][2]="city1";
	//  d[0][3]="email1";
	  
	//Second Row
	  d1[1][0]="user2";
	  d1[1][1]="pass2";
	  d1[1][2]="city2";
	  //d[1][3]="email2";
	 return d1; }
	  
	  @DataProvider(name="Datapp")
	  public static Object[][] getdata1(Method m) {
		  Object[][] d2=null;
		 if(m.getName().equals("testpass")){
	  d2=new Object[2][4];
		 
	  //First Row
	  d2[0][0]="user1";
	  d2[0][1]="pass1";
	  d2[0][2]="city1";
	  d2[0][3]="email1";
	  
	//Second Row
	  d2[1][0]="user2";
	  d2[1][1]="pass2";
	  d2[1][2]="city2";
	  d2[1][3]="email2";
	  } else if(m.getName().equals("testpass1")){
	  d2=new Object[2][3];
	  //First Row
	  d2[0][0]="user3";
	  d2[0][1]="pass3";
	  d2[0][2]="city3";
	//  d[0][3]="email1";
	  
	//Second Row
	  d2[1][0]="user4";
	  d2[1][1]="pass4";
	  d2[1][2]="city4";
	  //d[1][3]="email2";

	  }
	 return d2; 
	 }

	  
}
