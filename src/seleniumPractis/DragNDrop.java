package seleniumPractis;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;

public class DragNDrop {

	public static void main(String[] args) throws MoveTargetOutOfBoundsException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Step -1 Launch browser 
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		//step-2 max window
		driver.manage().window().maximize();
		
		
	
		Thread.sleep(2000);
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		je.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		
		WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement dragbox=driver.findElement(By.xpath("//*[@id='draggable']"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(dragbox,250,250).release().build().perform();
		Thread.sleep(2000);
		

	}

}
