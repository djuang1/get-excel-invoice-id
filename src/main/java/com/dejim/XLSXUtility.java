package com.dejim;

import java.io.IOException;
import java.io.*;

import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXUtility {
	
	public XLSXUtility() {

	}
	
	public static String GetCellValue(String col, Integer row, InputStream body) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook(body);
		return wb.getSheetAt(0).getRow(row - 1).getCell(CellReference.convertColStringToIndex(col)).toString();
	}

	public static void main(String[] args) throws IOException {		
		FileInputStream fi = new FileInputStream("/Users/djuang/Workspaces/seven-fifteen/get-excel-invoice/src/main/resources/out/Example Invoice for iPaaS Workshop.xlsx");
		System.out.print(GetCellValue("F",5,fi));
	}
}
