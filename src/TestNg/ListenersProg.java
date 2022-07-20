package TestNg;

import org.testng.annotations.Test;

import seleniumPractis.ScreenShot;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

@Listeners(TestNg.ListenersProg.class)
public class ListenersProg extends ScreenShot implements ITestListener {
	ScreenShot sc;
	WebDriver wd;
	 
  @Test
  public void verifyTitle() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
			String given="Gogle";
		wd.get("https://www.google.com/");
		  
		
		Assert.assertEquals(wd.getTitle(),given);
	 
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @Override
public void onTestStart(ITestResult result) {
	
	ITestListener.super.onTestStart(result);
	System.out.println("test start");
}
@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestSuccess(result);
}
@Override
public void onTestFailure(ITestResult result) {
	System.out.println("Entered in onTestFailure");
	
	String name=result.getName();
	//System.out.println(name);
	sc=new ScreenShot();
	wd.get("https://www.google.com/");
	  
	
	try {
		sc.ScreenShot1(wd,name);
	} catch (InterruptedException | IOException e) {
		
		e.printStackTrace();
	}
	//ITestListener.super.onTestFailure(result);
}
@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestSkipped(result);
	System.out.println("on test skipped");
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
