package seleniumPractis;
import java.rmi.AccessException;

import javax.xml.xpath.XPathException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.Throw;

public class Alert2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException,UnhandledAlertException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		wd.manage().window().maximize();
		//Scrolling
		JavascriptExecutor je=(JavascriptExecutor)wd;
		je.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
			// Click on Alert Button
wd.findElement(By.xpath("//input[@id='alertbtn']")).click();
Thread.sleep(4000);
wd.switchTo().alert().accept();
//To Handle Alert
Thread.sleep(2000);
WebElement givstr=wd.findElement(By.id("name"));
givstr.sendKeys("Ashi");
wd.findElement(By.xpath("//input[@id='alertbtn']")).click();
String SentText=wd.switchTo().alert().getText();
//String SentText=givstr.getText();
System.out.println(SentText);
 //givstr.alert().getText();
String ActText=wd.switchTo().alert().getText();
Thread.sleep(1000);
if(ActText.contains(SentText)) {
	try {
	wd.findElement(By.xpath("//input[@id='confirmbtn']")).click();
	System.out.println("Input name showed in Alert msg");
	}catch(UnhandledAlertException ue) 
	{
		System.out.println("Handled exception");
		wd.close();
	}}
	else {
wd.switchTo().alert().dismiss();
Thread.sleep(2000);
	}}}


