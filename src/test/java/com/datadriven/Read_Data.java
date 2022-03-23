package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static void Particular_cell_() throws IOException {
		

		File f = new File("C:\\Users\\srikrishnaraja\\eclipse-workspace\\March_PB\\Excel_files\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(2);
		
		Cell c = r.getCell(1);
		
		CellType type = c.getCellType();
		
		if (type.equals(CellType.STRING)) {
			
			String cellvalue = c.getStringCellValue();
			
			System.out.println(cellvalue + "s");
		}
		
		else if (type.equals(CellType.NUMERIC)) {
			
			double cellvalue = c.getNumericCellValue();
			
			int value = (int) cellvalue;
			
			System.out.println(value + "n");
		}
		wb.close();
	}
			
	
	public static void all_data() throws IOException {
		
		File f = new File("C:\\Users\\srikrishnaraja\\eclipse-workspace\\March_PB\\Excel_files\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				
				Cell c = r.getCell(j);
				
				CellType type = c.getCellType();
				
				if (type.equals(CellType.STRING)) {
					
					String value = c.getStringCellValue();
					
					System.out.println(value);
					
					
				}
				
				else if (type.equals(CellType.NUMERIC)) {
					
					double numvalue = c.getNumericCellValue();
					
					int v = (int) numvalue;
					
					String value = String.valueOf(v);
					
					System.out.println(value);
					
				}
				
				
				
			}
			
		}
		
		
		wb.close();
		

	}
	
	public static void particular_rowdata() throws IOException {
		
		
	File f = new File("C:\\Users\\srikrishnaraja\\eclipse-workspace\\March_PB\\Excel_files\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
			
			Row r = s.getRow(1);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				
				Cell c = r.getCell(j);
				
				CellType type = c.getCellType();
				
				if (type.equals(CellType.STRING)) {
					
					String value = c.getStringCellValue();
					
					System.out.println(value);
				}
				
				else if (type.equals(CellType.NUMERIC)) {
					
					double numvalue = c.getNumericCellValue();
					
					int v = (int) numvalue;
					
					String value = String.valueOf(v);
					
					System.out.println(value);
					
				}
				
			}
			
		
		
		wb.close();

		
		
	}
	
	
	public static void particular_columndata() throws IOException {
		
		
        File f = new File("C:\\Users\\srikrishnaraja\\eclipse-workspace\\March_PB\\Excel_files\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
				
				Cell c = r.getCell(0);
				
				CellType type = c.getCellType();
				
				if (type.equals(CellType.STRING)) {
					
					String value = c.getStringCellValue();
					
					System.out.println(value);
					
					
				}
				
				else if (type.equals(CellType.NUMERIC)) {
					
					double numvalue = c.getNumericCellValue();
					
					int v = (int) numvalue;
					
					String value = String.valueOf(v);
					
					System.out.println(value);
					
				}
				
				
				
			}
		wb.close();
		}
		
		

	
		public static void main(String[]args) throws IOException	
		{
			
		Particular_cell_();	
			
		//all_data();
		
		//particular_rowdata();
		
		//particular_columndata();
			
		}
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	


}