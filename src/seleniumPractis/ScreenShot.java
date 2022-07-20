package seleniumPractis;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	//WebDriver wd;

	public static void main(String[] args) throws IOException,InterruptedException {
		//ScreenShot ss=new ScreenShot();
		//ss.ScreenShot1();
	}
		public void ScreenShot1(WebDriver wd,String name) throws IOException,InterruptedException {
		
//System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
// wd=new ChromeDriver();

//wd.get("https://www.google.in/");
TakesScreenshot tss=(TakesScreenshot)wd;
File source=tss.getScreenshotAs(OutputType.FILE) ;
System.out.println(System.getProperty("user.dir"));
File file=new File(System.getProperty("user.dir")+"\\screenshotFolder\\"+name+".png");

FileHandler.copy(source,file);
	}
		 

}
