package seleniumPractis;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Step -1 Launch browser 
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//step-2 max window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement dropbox1=driver.findElement(By.xpath("//*[@id='draggable']"));
		Actions act=new Actions(driver);
		WebElement dropbox2=driver.findElement(By.xpath("//*[@id='droppable']"));
		act.dragAndDrop(dropbox1, dropbox2).perform();

	}

}
