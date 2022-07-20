package seleniumPractis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Title1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		String given="Gogle";
		wd.get("https://www.google.com");
		
		Assert.assertEquals(wd.getTitle(),"Gogle");
		//-------------------For Url------------------
	
	/*	String givUrl="https://www.google.com/z";
		String expUrl=wd.getCurrentUrl();
		if(givUrl.equals(expUrl)) {
			System.out.println("Test case passed..Given Url matched with Expected ");

		}
		else
			System.out.println("Test case failed..Given url din't match with Expected ");

*/
	}

}
