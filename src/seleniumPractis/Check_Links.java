package seleniumPractis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver wd=new ChromeDriver();
wd.get("https://login.arduino.cc/login?state=hKFo2SBNOG5CTmh0VzBqNVptZXRhcVZ0cmRveHNhR1BhanFSZ6FupWxvZ2luo3RpZNkgMjQwTGNEMVdSNzU4WE5HRmFSaWxJN2lwa3pyYU9XTkGjY2lk2SBkdHFwT1VlMDVxckx2YkdST0lXWWkyeG80M1ZQMFVyMw&client=dtqpOUe05qrLvbGROIWYi2xo43VP0Ur3&protocol=oauth2&prompt=login&response_type=code&redirect_uri=https%3A%2F%2Fid.arduino.cc#/sso/login");
//To find single Element
WebElement link=wd.findElement(By.tagName("a"));
link.click();
//To find multiple Elements
List<WebElement> links=wd.findElements(By.tagName("a"));
int num=links.size();
System.out.println("Total number of links present on the page are "+num);
for(WebElement ee :links) {
	String name=ee.getText();
	System.out.println(name);
	
}

	
	
}
	//WebElement button=wd.findElement(By.xpath("//button[@type='submit'and @class='button-module_button__38F6g button-module_normal__3tnnr button-module_disabled__1m3wJ']")).click();

}


