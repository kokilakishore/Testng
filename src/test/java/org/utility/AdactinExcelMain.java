package org.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class AdactinExcelMain{
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\ACER\\eclipse-workspace\\Maven\\ExcelSheets\\facebook.xlsx");
	Workbook bk=new XSSFWorkbook();
	Sheet sh0=bk.createSheet("Login");
	
	Row r0=sh0.createRow(0);
	
	
	//Cell1
	Cell c1=r0.createCell(0);
	Cell c2=r0.createCell(1);
	Cell c3=r0.createCell(2);
	Cell c4=r0.createCell(3);
	
	
	//Cell assign a value
	c1.setCellValue("Name");
	c2.setCellValue("Class");
	c3.setCellValue("MobileNo");
	c4.setCellValue("Address");
	
	//Write in excel
	FileOutputStream fout=new FileOutputStream(f);
	bk.write(fout);
}
}
