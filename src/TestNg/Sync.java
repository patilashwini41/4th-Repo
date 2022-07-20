package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sync {
	
	WebDriver driver;
	@BeforeClass
	public void openBrowser() throws InterruptedException {

		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			//Step -1 Launch browser 
			 driver =new ChromeDriver();
			
			//step-2 max window
			driver.manage().window().maximize();
			
			//step-3 open web application
			driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
			
			//step-4 dynamic wait
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(2000);
			
	}
	
	@Test
	public void verifyTitle() throws InterruptedException {
		
		driver.findElement(By.id("alert")).click();
		
		//explicit wait--------------
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)) ;
		
	wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("populate-text")).click();
		
		//Display button click----------
	
boolean display=driver.findElement(By.xpath("//*[text()='Display button after 10 seconds']")).isDisplayed();

//
		
		//	wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[text()='Display button after 10 seconds']"), display));
			if(display) {
			driver.findElement(	By.xpath("//*[text()='Display button after 10 seconds']")).click();}
			else 
		driver.close();
		//Click Enable Button-----------------
		boolean EnblBtn=driver.findElement(By.xpath("//*[text()='Enable button after 10 seconds']")).isEnabled();
		WebElement button=driver.findElement(By.xpath("//*[text()='Enable button after 10 seconds']"));
	//	wait.until(ExpectedConditions.invisibilityOf(button));
		if(EnblBtn) {
		
		
			driver.findElement(By.xpath("//*[text()='Enable button after 10 seconds']")).click();}
}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		//Thread.sleep(8000);
		//driver.close();
	}

}
