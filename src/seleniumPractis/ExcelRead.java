package seleniumPractis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {
	public String readData(int r,int c) throws IOException,NullPointerException {
		//Step-1
		String path=System.getProperty("user.dir")+"\\ExcelReadPracticeProg.xlsx";
		//Step-2 Use File class
		File file=new File(path);
		//Step-3 Read File
		FileInputStream fis=new FileInputStream(file);
		//Step 4-Handling excel Workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//Step 5-Locate sheet inside workbook
		XSSFSheet sheet=wb.getSheet("Sheet1");
		//Step 6-Get rows and Cols
		XSSFRow row=sheet.getRow(r);
		XSSFCell cell=row.getCell(c);
		//Step 7-Get value from Cell
		String val=cell.getStringCellValue();
		//Step 8-close workbook
		wb.close();
		return val;
	}

	public static void main(String[] args) throws IOException,InterruptedException,NullPointerException {
		ExcelRead er=new ExcelRead();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/login");
		wd.findElement(By.id("txtUsername")).sendKeys(er.readData(0, 0));
		
	    wd.findElement(By.id("txtPassword")).sendKeys(er.readData(1, 0));
		
		
	}

}
