package Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(priority=2)
  public void ReceiveMail() {
	  System.out.println("Test Receive Mail");
  }
  @Test(priority=1)
  public void SendMail() {
	  System.out.println("Test Send Mail");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method @NewTest");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method @NewTest");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class @NewTest");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class @NewTest");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test @NewTest");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test @NewTest");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite @NewTest");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite @NewTest");

  }

}
