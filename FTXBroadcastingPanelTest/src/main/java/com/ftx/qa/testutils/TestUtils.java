package com.ftx.qa.testutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtils {

	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;

public static void getTestData() {
	
	FileInputStream file= null;
	
	try {
		
		file= new FileInputStream("");
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		
	}
	
	try {
		
		book= WorkbookFactory.create(file);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	sheet=book.getSheet(null);

	
}


	}
	
	
	
	
	
	
	

