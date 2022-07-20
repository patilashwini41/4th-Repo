package seleniumPractis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelWrite {
public void writeData(int r, int c,String s) throws NullPointerException,IOException{
	String path=System.getProperty("user.dir")+"\\TestData.xlsx";
	File file=new File(path);
	FileInputStream fis=new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.createSheet("Sheet2");
	XSSFRow row=sheet.createRow(r);
	XSSFCell cell=row.createCell(c);
	cell.setCellValue(s);
	FileOutputStream fos=new FileOutputStream(file);
	wb.write(fos);
	wb.close();
	System.out.println("Written successfully");
	
}
	public static void main(String[] args) throws NullPointerException,IOException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/login");
		String title=wd.getTitle();
		
		ExcelWrite ew=new ExcelWrite();
		ew.writeData(2,1,title);
		

	}

}
