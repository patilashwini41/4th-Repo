package seleniumPractis;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Step -1 Launch browser 
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//step-2 max window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement tab=driver.findElement(By.id("opentab"));
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",tab);
		String ParentTab=driver.getWindowHandle();
		Thread.sleep(2000);
		tab.click();
		//WebElement newtab2=driver.findElement(By.id("openwindow"));
		//newtab2.click();
		
		// Get Multiple Windows
		Set<String> tabs=driver.getWindowHandles();
		for(String id:tabs) {
			System.out.println(id);
			if(!id.equals(ParentTab)){
				driver.switchTo().window(id);
				String title=driver.getTitle();
				System.out.println("Child tab title is "+title);
			}
		}
		//Switch to Parent tab
		Thread.sleep(2000);
		Thread.sleep(2000);
        driver.switchTo().window(ParentTab);
		String Parenttitle=driver.getTitle();
		System.out.println("Parent tab title is "+Parenttitle);
		//To close current tab
		//driver.close();
		//To close all tabs
	//	driver.quit();

	}

}
