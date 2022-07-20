package seleniumPractis;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesNCalender {
	

	public static void main(String[] args) throws NoSuchWindowException, InterruptedException  {
		SelectDate("Oct2021",22);
	}
	public static void SelectDate(String month1,int date)throws NoSuchWindowException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://jqueryui.com/datepicker/");
		Thread.sleep(1000);
		wd.manage().window().maximize();
		//Scrolling
		JavascriptExecutor je=(JavascriptExecutor)wd;
		je.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		WebElement frame=wd.findElement(By.xpath("//*[@class='demo-frame']"));
		wd.switchTo().frame(frame);
		wd.findElement(By.id("datepicker")).click();
	//Select Date from Calendar
		
		while(true) {
			
		WebElement month=wd.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
		String monthVal=month.getText();
		if(!monthVal.equalsIgnoreCase(month1)) {
			WebElement prevButton=wd.findElement(By.xpath("//*[@id='ui-datepicker-div']//div//a[@title='Prev']"));
			prevButton.click();
		}
		else {
			break;
		}
		}
		//Select Date 
		wd.findElement(By.xpath("//*[@id='ui-datepicker-div']//table//tbody//tr//td//a[text()='"+date+"']")).click();
		}
	}


