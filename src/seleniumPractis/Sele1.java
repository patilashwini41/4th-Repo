package seleniumPractis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//step 1:Launch Browser
		WebDriver driver=new ChromeDriver();
		//step 2: open Web application
		driver.get("https://www.facebook.com");
		//to maximize window
		driver.manage().window().maximize();
		//step 3: alternative method for get method is navigate
driver.navigate().to("https://www.myntra.com");
         // to navigate back
driver.navigate().back();
//To navigate forward
driver.navigate().forward();
//To refresh page
driver.navigate().refresh();
//to close current application/tab
driver.close();
		
	}

}
