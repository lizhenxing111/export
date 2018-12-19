package org.lq.export.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class ExcelWork {

	protected final String VERSION="2007";
	
	protected Workbook get07After(){
		return new XSSFWorkbook();
	}
	protected Workbook get07Before(){
		return new HSSFWorkbook();
	}
	
}
