package seleniumPractis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://login.arduino.cc/login?state=hKFo2SBNOG5CTmh0VzBqNVptZXRhcVZ0cmRveHNhR1BhanFSZ6FupWxvZ2luo3RpZNkgMjQwTGNEMVdSNzU4WE5HRmFSaWxJN2lwa3pyYU9XTkGjY2lk2SBkdHFwT1VlMDVxckx2YkdST0lXWWkyeG80M1ZQMFVyMw&client=dtqpOUe05qrLvbGROIWYi2xo43VP0Ur3&protocol=oauth2&prompt=login&response_type=code&redirect_uri=https%3A%2F%2Fid.arduino.cc#/sso/login");
		WebElement emailbox=wd.findElement(By.className("input-module_input__3k4oC" ));
		emailbox.sendKeys("patilashwini.41@gmail.com");


	}

}
