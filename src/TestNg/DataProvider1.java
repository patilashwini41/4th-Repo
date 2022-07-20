package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DataProvider1 {
	
	WebDriver driver;
 
  
	  @Test (dataProvider="testData")
	  public void login(String email,String pass) throws InterruptedException {
	  	
	  	//step-1 enter email adress
	  	driver.findElement(By.id("email")).sendKeys(email);
	  	Thread.sleep(2000);
	  	
	  	//step-2 enter pass
	  	driver.findElement(By.id("pass")).sendKeys(pass);
	  	Thread.sleep(2000);
	  	
	  	//step-3 click on login
	  	driver.findElement(By.xpath("//button[@name='login']")).click();
	  	Thread.sleep(2000);
	  	
	  	//step-4 back ward
	  	driver.navigate().back();
	  	Thread.sleep(2000);
	  	
	  	//step-5 
	  	driver.findElement(By.id("email")).clear();
	  	Thread.sleep(2000);
	  }

   @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

@DataProvider(name="testData")
  public String[][] getData() throws IOException {
	System.out.println("HIIIIIIIIII");
	  String [][] data=new String[4][4];
	  int TotalRows=4;
	  int col=4;
	  for(int i=0;i<TotalRows;i++) {
		  for(int j=0;j<col;j++) {
			  data[i][j]=readData(i,j); 
			 } }
  	return data;
  			 }
  private String readData(int i, int j) throws IOException {
	 	//Step-1
		String path=System.getProperty("user.dir")+"\\DataProviderSampleSheet.xlsx";
		//Step-2 Use File class
		File file=new File(path);
		//Step-3 Read File
		FileInputStream fis=new FileInputStream(file);
		//Step 4-Handling excel Workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//Step 5-Locate sheet inside workbook
		XSSFSheet sheet=wb.getSheet("Sheet1");
		//Step 6-Get rows and Cols
		XSSFRow row=sheet.getRow(i);
		XSSFCell cell=row.getCell(j);
		//Step 7-Get value from Cell
		String value=cell.getStringCellValue();
		System.out.println("Cell value" +value);
		wb.close();
		return value;
}

	@BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  
	  public void init() throws InterruptedException {
			
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  		
		  		
		  		//Step -1 Launch browser 
		  		 driver =new ChromeDriver();
		  		
		  		//step-2 max window
		  		driver.manage().window().maximize();
		  		
		  		//step-3 open web application
		  		driver.get("https://www.facebook.com/");
		  		Thread.sleep(2000);
  }
		 
  @AfterTest
  
	  public void tearDown() throws InterruptedException {
			Thread.sleep(2000);
			driver.close();
		}
  

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
