package com.base_class;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;



import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Base_Class {
	
	public static WebDriver driver; 
	
	public static String value;
	
	public static WebDriver browser_configuration(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe" );
			
			driver = new ChromeDriver();
		}
		
	  	
		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\firefoxdriver.exe");
			
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		return driver;

	}
	
	public static void clickOnElement(WebElement element) {
		
		element.click();

	}	
		
	public static void inputValueElement(WebElement element, String data ) {
		
		element.sendKeys(data);
		
	}
	
     public static  void getUrl(String url) {
		
		driver.get(url);
		

	}
     
     public static void close() {
		
    	 driver.close();

	}
    
     public static void scrollUpandDown(WebElement element) {
		
     JavascriptExecutor js = (JavascriptExecutor) driver;
     
     js.executeScript("arguments[0].scrollIntoview();",  element);
    	 
	}
		
		public static void implicitWait(int seconds , TimeUnit format) {
			
			driver.manage().timeouts().implicitlyWait(seconds, format);

		}
		
		public static void takesScreenshot(String path ) throws IOException {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(path);
			FileUtils.copyFile(src, des);

		}
		
		public static void dropDown(WebElement element, String type, String value) {
			
			Select s = new Select(element);
			
			if (type.equalsIgnoreCase("by value")) {
				
				s.selectByValue(value);
			}
			
			else if (type.equalsIgnoreCase("by text")) {
				
				s.selectByVisibleText(value);
			}
			
			else if (type.equalsIgnoreCase("by index")) {
				
				int index = Integer.parseInt(value);
				s.selectByIndex(index);
			}
			
			
			

		}
		
		
		
		public static void clearall(WebElement element) {
			
			element.clear();

		}
		
		public static String particular_data(String path,int row_index,int cell_index ) throws IOException {
			
			File f = new File(path);
			
			FileInputStream fis = new FileInputStream(f);
			
			Workbook wb = new XSSFWorkbook(fis);
			
			Sheet s = wb.getSheetAt(0);
			
			Row r = s.getRow(row_index);
			
			Cell c = r.getCell(cell_index);
			
			CellType type = c.getCellType();
			
			
			if (type.equals(CellType.STRING)) {
				
				   value = c.getStringCellValue();
				
			}
			
			else if (type.equals(CellType.NUMERIC)) {
				
				double numericCellValue = c.getNumericCellValue();
				
				int val = (int) numericCellValue;
				
				 value = String.valueOf(val);
				
				
			}
			wb.close();
			return value;
			

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	
	
	
}
