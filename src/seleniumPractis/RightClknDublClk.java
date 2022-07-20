package seleniumPractis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClknDublClk {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://demoqa.com/buttons");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		WebElement DblClkbtn=wd.findElement(By.id("doubleClickBtn"));
		WebElement RigtClkbtn=wd.findElement(By.id("rightClickBtn"));
		WebElement clkbtn=wd.findElement(By.xpath("//*[text()='Click Me']"));
		clkbtn.click();
		Actions act=new Actions(wd);
		act.doubleClick(DblClkbtn).perform();
		act.contextClick(RigtClkbtn).perform();
		//act.click(clkbtn);
		
		
	}

}
