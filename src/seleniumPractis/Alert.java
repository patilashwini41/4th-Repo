package seleniumPractis;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://vctcpune.com/selenium/practice.html");
		wd.manage().window().maximize();
		
		//Scrolling
		JavascriptExecutor je=(JavascriptExecutor)wd;
		je.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		// Click on Alert Button
wd.findElement(By.xpath("//input[@id='alertbtn']")).click();
Thread.sleep(2000);
//To Handle Alert
wd.switchTo().alert().accept();
Thread.sleep(2000);
wd.findElement(By.xpath("//input[@id='confirmbtn']")).click();
Thread.sleep(2000);
wd.switchTo().alert().dismiss();
Thread.sleep(2000);
wd.close();
	}

}
