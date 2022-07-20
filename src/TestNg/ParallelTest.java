package TestNg;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ParallelTest {
	WebDriver wb;
  @Test
  public void f() {
	String title=wb.getTitle();
	System.out.println(title);

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
  @Parameters("browser")
  @BeforeTest
 
  public void launch(String browserName) throws InterruptedException {
	  if(browserName.equals("edge"))
	  {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\msedgedriver.exe");
		 wb=new EdgeDriver();
		 wb.get("https://www.orangehrm.com/");
		 Thread.sleep(2000);
  }
	  else if(browserName.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 wb=new ChromeDriver();
			 wb.get("https://www.orangehrm.com/");
			 Thread.sleep(2000);
	  }
	  
	  }

  @AfterTest
  public void afterTest() {
	  wb.close();
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
