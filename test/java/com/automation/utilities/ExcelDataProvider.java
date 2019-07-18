package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	
	//constructor to load xl as soon as we create class object
	public ExcelDataProvider() throws IOException{
		
		File src=new File("./TestData/data.xlsx");
		FileInputStream fs=new FileInputStream(src);
		wb=new XSSFWorkbook(fs);
	}
	
	//method overloading
	public String getStringData(int index,int row,int column){
		return wb.getSheetAt(index).getRow(row).getCell(column).getStringCellValue();
	}
	//method overloading
	public String getStringData(String sheetName,int row,int column){
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getIntData(String sheetName,int row,int column){
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
