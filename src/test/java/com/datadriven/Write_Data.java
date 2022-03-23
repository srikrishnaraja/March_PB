package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\srikrishnaraja\\Desktop\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("raja").createRow(0).createCell(0).setCellValue("emp id");
		
		wb.getSheet("raja").getRow(0).createCell(1).setCellValue("salary");
		
		wb.getSheet("raja").createRow(1).createCell(0).setCellValue("sri");
		
		wb.getSheet("raja").getRow(1).createCell(1).setCellValue("10000");
		
		wb.getSheet("raja").createRow(2).createCell(0).setCellValue("krishnaraja");
		
		wb.getSheet("raja").getRow(2).createCell(1).setCellValue("20000");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("write sucessfully");
		
		
		
		
		
		
		
		
	}

}
