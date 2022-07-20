package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class GroupsAttribt {
	
  @Test (groups="sanity")
  public void IsTextBox() {
	  System.out.println("Sanity test textbox ");
  }
  @Test (groups="sanity")
  public void IsBtnEnable() {
	  System.out.println("Sanity test case btn enble");
  }
  @Test(groups="Integration")
  public void Module1(){
	  System.out.println("Integrtn module case 1");
	  
  }
  @Test(groups="Integration")
  public void Module2(){
	  System.out.println("Integrtn module case 2");
	  
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
