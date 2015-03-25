package Practice;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Newsample {
	
  @Test(dataProvider = "dp")
  public void RegisterData(String UserName, String Password, String City, String Email) {
	  System.out.println(UserName+" "+Password+" "+City+" "+Email);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method @Newsample");
	  throw new SkipException("Skipped");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method @Newsample");
	  
  }


  @DataProvider
  public Object[][] dp() {
	  Object[][] d=new Object[4][4];
  //First Row
  d[0][0]="user1";
  d[0][1]="pass1";
  d[0][2]="city1";
  d[0][3]="email1";
  
//Second Row
  d[1][0]="user2";
  d[1][1]="pass2";
  d[1][2]="city2";
  d[1][3]="email2";
  
//Third Row
  d[2][0]="user3";
  d[2][1]="pass3";
  d[2][2]="city3";
  d[2][3]="email3";
    
//Fourth Row
  d[3][0]="user4";
  d[3][1]="pass4";
  d[3][2]="city4";
  d[3][3]="email4";
  
  
  return d;
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class @Newsample");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class @Newsample");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test @Newsample");
	  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test @Newsample");
	  
  }

  
}
