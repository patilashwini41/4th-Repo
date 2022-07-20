package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AttributesCheck {
  @Test(dependsOnMethods="fees")
  public void admission(){
	  System.out.println("Admission done when paid fees");
  }
  @Test
  public void fees() {
	  System.out.println("fees paid");
	  Assert.assertTrue(false);
  }
  @Test(invocationCount=3)
  public void repeat(){
	  System.out.println("repeat/Invoke 3 times");
	  
  }
  @Test(description="This method is dummy message description")
  public void m3() {
	  System.out.println("Hi");
  }
  @Test(enabled=false)
  public void m() {
	  System.out.println("m method is enabled true so executed");
  }
  @Test(timeOut=7000)
  public void m2() throws InterruptedException {
	  System.out.println("executed before time out");
	  Thread.sleep(12000);
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
