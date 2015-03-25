package KhanSahab;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Facebook {
  @Test
  public void TestRecieveMsg() {
  
  System.out.println("checking msg");
  }
  @Test
  public void TestNotofication(){
	  System.out.println("checking notification");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
  System.out.println("after method");
  }

  @BeforeTest
  public void beforetest(){
	  System.out.println("before test");
  }
  
}
