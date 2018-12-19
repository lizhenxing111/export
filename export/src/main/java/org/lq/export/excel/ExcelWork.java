package org.lq.export.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class ExcelWork {

	abstract Workbook getWorkBook(String version);
	
	Workbook get07After(){
		return new XSSFWorkbook();
	}
	Workbook get07Before(){
		return new HSSFWorkbook();
	}
	
}
